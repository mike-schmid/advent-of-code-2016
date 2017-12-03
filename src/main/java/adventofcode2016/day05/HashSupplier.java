package adventofcode2016.day05;

import lombok.RequiredArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.function.Supplier;

/**
 * @author Mike Schmid
 */
@RequiredArgsConstructor
public class HashSupplier implements Supplier<String> {
    private final String doorId;
    private int i;

    @Override
    public String get() {
        return DigestUtils.md5Hex(doorId + (i++));
    }

}