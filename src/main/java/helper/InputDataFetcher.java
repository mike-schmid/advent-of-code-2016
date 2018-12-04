package helper;

import com.google.common.base.Charsets;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class InputDataFetcher {

    public static String fetchInput(final int year, final int day) {
        return String.join("\n", fetchInputLines(year, day));
    }

    public static List<String> fetchInputLines(final int year, final int day) {
        final String sessionCookie = getSessionCookie("config.properties");

        final String cacheFile = String.format("src/test/resources/cachedInputData/%s/%s_%s.txt", sessionCookie, year, day);
        final File file = new File(cacheFile);
        file.getParentFile().mkdirs();

        try {
            return getOrFetch(year, day, sessionCookie, file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Collections.emptyList();

    }

    private static List<String> getOrFetch(int year, int day, String sessionCookie, File file) throws IOException, InterruptedException {

        if (file.exists()) {
            System.out.println("File exists. Deliver from cache...");
        } else {
            System.out.println("File not exist yet. Fetching...");

            final HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(String.format("https://adventofcode.com/%d/day/%d/input", year, day)))
                    .header("cookie", "session=" + sessionCookie)
                    .build();

            final HttpResponse<Path> response = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(5))
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofFile(file.toPath()));

            if(response.statusCode() != 200){
                System.out.println("Error fetching file... Status code: " + response.statusCode());
                file.delete();
            }

        }

        return Files.readAllLines(file.toPath(), Charsets.UTF_8);
    }

    private static String getSessionCookie(final String fileName) {

        final File file = new File(InputDataFetcher.class.getClassLoader().getResource(fileName).getFile());

        try (FileInputStream input = new FileInputStream(file)) {

            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty("advent.of.code.session.cookie", StringUtils.EMPTY);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return StringUtils.EMPTY;

    }


}
