package adventofcode2017.day04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day04Puzzle2Test {

    @Test
    public void solve() throws Exception {

        final String input = "abcde fghij\n" +
                "abcde xyz ecdab\n" +
                "a ab abc abd abf abj\n" +
                "iiii oiii ooii oooi oooo\n" +
                "oiii ioii iioi iiio";

        Assertions.assertEquals(3, Day04Puzzle2.solve(input));

    }


    @Test
    public void solveReal() throws Exception {

        final String input = "oaoe rxeq vssdqtu xrk cjv yaoqp loo\n" +
                "mveua dogbam szydvri hyzk lbega abzqw xwjn wniug kwbre\n" +
                "npaoy uivpxwd oynpa rcdk uixpvdw\n" +
                "yserir iikzcm ieuroca iuwcfov rvb giti crdpdcv mxpps\n" +
                "spyuhgo lucasl ucllsa bymnjig yflbv nxitmlf\n" +
                "xlxyhwz xla mpye fvjegwg fezlfrt inetrh vhg xpvstx ydhvq\n" +
                "xgue cvtmh myg ontvvyw ygm oqzrdrw\n" +
                "srdfsjf dli kccb kauk kauk apa doefc cdffkhh cdffkhh\n" +
                "msizb elqiov lqn epamk onmnlst baawab ncafwaf jrataml iyzhy svycuec\n" +
                "wdzqpcn dkgdumv wdzqpcn qxdmwib cjsigi bgcihgh fmua\n" +
                "kpvbzf kpvbzf svyq flg shwtgp\n" +
                "ywrynt cesjtgk hsvitr brpiul lxgvvrl cesjtgk cesjtgk xuflpfn\n" +
                "tik mrpht gkv unqp wypscc vmwiu ldrigk okbc wztc\n" +
                "zpy kyzvijv bilpf etbrgk edza vuz jzgn\n" +
                "yoa rgppd kzpopd cffjk murcb jmt raace iwt\n" +
                "aobgkja drc ztkd qskxxbv lve lev rhhoqex bmd eolf ybxjr yiiut\n" +
                "zhjcfms fpabnu aozp delsc mge yqi eovg pwefafe\n" +
                "gukf iys qztqxz xhsssz pfqq slg jdbp pfqq yabztc asow ygh\n" +
                "fmr ijgmjrc zbhwsmx ylgccz ycydcyx hjjset\n" +
                "zybsr iqisbs hffmij ikby lwufzvg gwd\n" +
                "ruk rku kur ydurp upmebe\n" +
                "baqide zdijcf ezqfe ovrldez delzrov szimd irmk busim ppv zepqk mlwpl\n" +
                "bxlvp dxumme byaada cgyn diz\n" +
                "xlxr jhili bmcke nkl vuhqsn lxzb zmyuxgk qcqr tyxe\n" +
                "wvth gyerrd yewrta kgri yewrta\n" +
                "fall jpyuusu lffybb ivmtmzx alfl yjupusu\n" +
                "lzvcg xwnt mjyiklh vwlz qejj mjyiklh dmcwq qejj\n" +
                "vgutb smc yvnsbgd bxmjd qmhia krxz luhgg emnrp\n" +
                "uuvhtia aiuutvh brstbr tsrbrb\n" +
                "howd japlq lhk qtsfdq htfufj qkyywy anxxxqw jtmryw cdtajh\n" +
                "pksswl jprpccl wpklss yyrbo\n" +
                "furp pfru bftha iekamfc bixwmr sslovex\n" +
                "nrqobo hyb byh hby\n" +
                "mugix kzlbtuq hmju ysstccs hmju btsuh\n" +
                "hsrlhw zilj jtvto zilj fjq\n" +
                "lvol xic hqqdeo gmsug yqe wue vhmrq buj juv wxexdot\n" +
                "lqeybb odpv mttm bxqy vqbqr ylbei wyjcxco urufsuz kyq\n" +
                "youbiz kvrea xsfcp zaz zybiou earvk qpf\n" +
                "bowsref ooobtic apiushu kplpyza\n" +
                "hxfhoyy ybbe ceebt recegzz ftnlv ukaf gpvx opvd lqnvk ybbe ygnwa\n" +
                "jpbgc aahm aahm aahm\n" +
                "qyvheb xyb elt oaksuj dvgpmel poiowc ykgbgpz dxpit ytg\n" +
                "vgsv yrjo vjss kyfvim izwo yrjo vgsv\n" +
                "hkk xmqx crlki dtp nuh okef okef xomktit viia nuh tplhrx\n" +
                "bmkjclx sbwe bwes bsbnqd nqbsbd\n" +
                "gfwrl vocwln hsuxkz zpclb qprrvlt bkcluvs pqy sxucrla npb fensz\n" +
                "adjklj nyr btmav roxv jrri vqfnis gzsab ogskmaj\n" +
                "bvjm fer ztgfx mtp vvhps hptzrar wpy yhvmh qklfwpf edgrdts vmhhy\n" +
                "lngra nrlga xokqu mgq\n" +
                "mksdk bkkbfsq hazlai nixee vyxh hpvebeg jujoqe wkw mzpxixm\n" +
                "kxrkkx qivtt xsm xsm rqvgdjl jilosjs rji\n" +
                "xiqga rez igqxa odiilj izoiwf xgqia\n" +
                "aepioo krcr aepioo jhigtx krcr qubkv jgo zybyvy wbsguz\n" +
                "ntyscmf duwvvb kga xvaypk sfjlg daguzm kqat otj zmnki\n" +
                "ggxaery jazo ggxaery zevobo zux wfnd wbyd hmhmo oaakvab jsimsw\n" +
                "vqdnvgy qiex yqeweds yqvdvgn iqcukgc bvrc osi\n" +
                "esjzak krwe ivbri hnbah iuvb begybsk ctxmlym gjqi lcscum\n" +
                "hyxdilx tsv evckza bdbscwj jlihiqk dciuj hamd dqsm ydihxxl\n" +
                "lurtwhx ygwf pwhj whxtrlu zfvywxr gcrl zvl wienpqb woto\n" +
                "mfaektr ocvho ukfx ukfx old daqwotk pybjtiz kumkiq tmql lqou tmql\n" +
                "guwy ceqsyvs svteymr nrovwz tesymrv rmsveyt\n" +
                "pigilsu zpyiohn zpyiohn xzl pryi zpyiohn ohdz\n" +
                "pziqfg hhrzdr wxl zpqigf\n" +
                "psnmnxz oed edo deo\n" +
                "tkdp tkdp auozn tfyo wmp jtp wjyskeh dag ojdvw gbptp deiqi\n" +
                "xkr nmsbk mreiv occcvva eca bupc gvaoopu jdhr flh ptgdumz mks\n" +
                "dlevn vmwzws dlevn dlevn\n" +
                "qwx qnuqgc rtzc yvym sft wxq fhv fts nyvrfxz ydjvcq tnwz\n" +
                "debkk pullndo ezaibw ldnloup nllupdo wiiw nij\n" +
                "hng rpd aud epq opzjh jnzge\n" +
                "rmtauf nwinyl nwnliy pjzahm lywnin\n" +
                "cgiv omva fos irse uytiqu iqjo riplx capa dhdl echbyjw cutfam\n" +
                "fqrqmi jfrj zllh gfhhq fqrqmi mmyqv\n" +
                "yoepae uabuxlz jzqy yoepae sxena jzqy\n" +
                "bfr jlrycal ndg xejwjdp khwg wckevqb tud xljzem ntfbazf lkr\n" +
                "aomdwt sji sij jsi wlsvvva kgjzqj whhf\n" +
                "ogorbil orlgiob iorlbog xapwiqs jxb\n" +
                "tnn sxgdikv ynick ynick aumwthl rwhx eqxd jdbzyk kbil pmnifp dpeips\n" +
                "vzeoilq son olqvh jawmny\n" +
                "vsifce kcighpn mubl zkgwm\n" +
                "ncagxs ilohd lyq oqhjf nfeij qmtvf qpru tfmtaj\n" +
                "pfjkcpr dqrfde efqddr edqdrf\n" +
                "wdyygax hscx ptmro wqko ecnfkhj ywui\n" +
                "gdv nrnrzdc vyq vyq vesrj vyq jwxg\n" +
                "oqhrr daoew zpoduh zwmoss nfkh vubf xza kju rhrpt fvsc\n" +
                "oqp ppyq swvin mut uacwd swivn ucdaw icfj ldcujh cejl\n" +
                "dar bqp ajdhuej sxwt bqp tppexrh tppexrh\n" +
                "sitplaj xnb ldopp mqd gwtk uhnvozu ljz dqm ylzy qltf gwtjksx\n" +
                "eqkvncb jdp pahwje avhrer awb zqnwfhx zohmcz fitbyab\n" +
                "xlnel gjzviy cndpuoj jvwxs qsd kwli quisju kyoix imzg\n" +
                "czqjkk evyima ixpelbv eobpd wwuxxof pbxc dgj\n" +
                "czsigs lbdaynp amsexn aemsxn easnmx rsitdzf\n" +
                "xdpc xfbp lrjwlo ntnnob sbe bse\n" +
                "suud fws zgn kvfimsi\n" +
                "wnexa diexvky oemdq uasxzhq qxa kevyixd lpw unluohs\n" +
                "ylruxt beqvn vbenq ogsov mvftu sovog gshtb qriaxko vthgfr jwj\n" +
                "gmz wcjb cqjlb hijz qwuluuf xdpu jybdf ajiv xizwb\n" +
                "fcxos spz idg rjb uhr ert bxia urh xfxp ixba bnvxy\n" +
                "uxiie eixiu wgmwbj euiix qknyd wtaojk naeqfz qmhnulk uscgwxa\n" +
                "qwyxd jno xelqd isdjht qxz dbwnr bfzhewu opxmkgj igfiuck\n" +
                "ljpphwc ijzic pfsemsc mfedoxy pad wsk beqjpbj gbjr imce xumhr\n" +
                "causc ogypj csacu pdokc itpgjl xfx nyt yytg srhrup bontz xbalwnj\n" +
                "asohjj qer pfgwo qgdw wgdq\n" +
                "gpzvyhh tsnx tyu kswlgb whju zkkpdm bmh hdov\n" +
                "unux lhrn unux lhrn rxr\n" +
                "epq ksew pqct jib pqebafk jib pyfjy gnu pqct\n" +
                "anzbbs oyhm moyh mhyo\n" +
                "dpk zael zael mxots zfcum\n" +
                "aehljyc wrj lfhife xbss ztszba vlg eljycah ihffle coypll\n" +
                "aoqedco bogk bogk aoqedco sanwwo\n" +
                "udmbz yxe dft rzolgtp nwwjpti\n" +
                "efu qcls rtx mestnqt pkh ciekj scrv uswd oroowx lcztvt\n" +
                "urnwt uapni ood lzce\n" +
                "zjiqxt jzqxti infgde xbmi kawilp kaipwl\n" +
                "lsfn kxfw zgzdfq meqwql zpqqu otert\n" +
                "taajsho gbeoguv bpi nxeuy\n" +
                "dpoyzi rqlzx rqlzx udhuwjm qnu bnuma udhuwjm gfezx cbjpfp woir\n" +
                "mjbv isni ixjtjue fwsk ncgwpn vqnmq pivz jbmv qoakqou argval dacvksc\n" +
                "xxjcn amdgdhh iup hlk xxjcn elx\n" +
                "gyhocay ofqosv nldfqay aqu dsrz lmekze bus lmekze gfoq lmekze vkor\n" +
                "xidyqq bimvxu zrkg rpcdca ymg nmxkkqu gygcmp euemr\n" +
                "gvd ywog ywog gvd hwjzzq\n" +
                "byu ggpwrl lpexjcf hgy jee febgcae valcgc tcfwicu texqi lxfjepc qeraxcs\n" +
                "lkjejsb eonp jtsbps pfvlos neop ikwnb avzxnk\n" +
                "big pjgttfb eetr jobjfae odvl jheh tuz ystrh tuz tuz ige\n" +
                "czubaxq czubaxq pbxgs jhuopn snmhhc qwmcka xdhxfuz jhuopn eummw\n" +
                "xdwduc sqcano zopaco ozbbc bczob eas cbbzo\n" +
                "oanpgo tiav bbssup ttzchih tpb xmfnqwa ghdx uepmz fzqbx\n" +
                "ahha zsbdq jggv zfcjdp dzcfpj dkew jxmelbf jgsohj oghsjj\n" +
                "awdy plulzw gdi jiiq lod rog mrf uihaz sebk guvb\n" +
                "tlhwro sapaws ovlbbfh xctruk spzpzm latyy\n" +
                "ligaot xfhacs jvk xbnpu yuanx yvvi gjek\n" +
                "nfwuug nxccj dxpfvfq pvxcvy ayss lfwz wwole ewowl xceybeb efs zfwl\n" +
                "lzowlql armo yrlgfg kbl vudahci yav evdi ofak ysmfjk upe\n" +
                "qtmmqrl gxi rrhbi pydbopp yvevlq ovwwdrt mrppov lzzs yjyrxh srzo\n" +
                "hytkyas wpuqvf fftiso fftiso\n" +
                "yutais qjdbzo kewsi opy ysl zyvyoty wkp\n" +
                "qtbad bxfjkwa stcdk lyre tabdq yler\n" +
                "friyh ivp hshy ksmanzq mzdbbub ncbx mhzki friyh vyjk hshy\n" +
                "ijeysr aww evn ttqvshg xkd zjy honvuqy zyj quvyohn gphcir\n" +
                "okft smja fkto etb\n" +
                "pbi zhyy kyjdho mqsuyic vegocmw gdkskg kgavjag dbqh wamfijz ktihnrg\n" +
                "csqix soz ingra gvslgk\n" +
                "ugxgzqt pdn hiynufo lpfabmi rmwj uhsqoo pmlzad ferdup guzqtxg voxd\n" +
                "wkixiq vck vck sylv ttqcbwv ywqta vblz mhohx frv\n" +
                "phns ozeghgm dfodkyv iyc psnh tedotyz xqz gqbyj ydttezo kxgju mvip\n" +
                "chc jdjo pyq usyn vtrbnq ohnx dsxpdzn mgbc ysun mlalmu mqemyuw\n" +
                "qrkosx wcwcv brvbwo nvxwg bvrwob\n" +
                "bovt gpb rwm gpb pitttl rwm rvfzn tbo\n" +
                "zczkb tmpwtj kackkx yzqkzso rsg ema ereo jptvfd jptvfd flbjfii\n" +
                "fcdyetv jqelvx jlevqx cfvetyd\n" +
                "dtyp wfh rxtpwr nolbro iozrs mnshu tkesvyk pkmkf\n" +
                "lvecoh ohpb brlqwx immgqe dzfac bwlrxq hng clxmpd qodfyv\n" +
                "sjbc dsoqk dqosk iyla lqzrsgi tjgt mfxshtd ztmc\n" +
                "nxveg vmxf jwnub kujji aqkonjl xtit xitt\n" +
                "jsft pmojruo vtvjox wimrlhj rezqi rnv hjnvdka\n" +
                "vnl vzgltnl mry kkqf fekwjw knsrvt nct kqy infvys\n" +
                "jbvm igq gvcl crry ylia nbqcq ouduen jklepay\n" +
                "ermsf emrsf uksuvz zrnlun\n" +
                "ecksf dkydasw wddasky pmfhi yltmedt bdovedg vfnyoze ufcki civrjs ohozga\n" +
                "hvf gfqgc adbeykt jdz zmgonhi yua kifxyoy umsza ivnbvoc whnpi gtbinze\n" +
                "nmy fsdu myn iiw\n" +
                "yrkwca jkxc yrkwca yrkwca kxqtvqh\n" +
                "ildxc taopx spykdz dzbpcxp wzgka cbyr xpvrzbk\n" +
                "qqp axdmvo cmppp shx\n" +
                "uldyu luyud uduly rgcmugh\n" +
                "woc vjdpyq cwshqq tlh fzyuz cbwgp egpy sfw\n" +
                "adyv cnrn bhaxvx ofdbkn yxrtir cnrn\n" +
                "ycz ednsydc bqsdcpx adnq bydb tqy tqy vqzpy erdcnv\n" +
                "mouv ouiy gld stdv gwr lxlfq gdl ldg\n" +
                "gtx bbvr fxytm veofwp bvbr opefvw\n" +
                "pcf scu ovso rawtjxs kzxgnuy ifcn tvibap\n" +
                "ugcbob xkjgtx ugcbob ilkkx dikca wpxyq retqhlu ugcbob ylmt tigcmmm\n" +
                "gmnde ool qeuwc ctux\n" +
                "wpajwn gooy fedmjur pxiq xkyniyp xtgi eyfpc gjx\n" +
                "uaivt kvfyn mpsya qxu kvnyf wvoeaz mbt fkyvn\n" +
                "jth awxbprn kpcodj qxegybo\n" +
                "sfvitld mdzczg pdptzm fmz himb eutpyi mgrde gubsta tfsldvi dfistvl\n" +
                "piabmr fckmhrv twnlnka jyb selqflm iwcutk pvvann\n" +
                "uxjfm rmleg ochuj ruiq aobxbb tpuusot uhwjojw tutopus\n" +
                "dzj qdyxzk oan rtpz ona qkdzyx nkunr\n" +
                "urjydh dfreifg tmbetd aakc vdr dkdkldw xgvtfsa ivv doadb axgvstf\n" +
                "fdjhr ujgbj ulkm dfzh tmhx zfdh ckt ortg\n" +
                "obe ywwge rgqmt cfcnyt atn fdkdrwz lmb zwpe sqfoc yllxs akdlsso\n" +
                "ckhbu jfqhkml abenw ckp xvjy wsyhxox jzsz hqksq\n" +
                "tjx zlh zgyrjpe bdorry uofh hgkzl ezixges kaxlkjw ztijupu hlgkz\n" +
                "belj ipbygk dxe cqoyukw jnncelh ihvom qstbowu rocqsz ifiztlf fjrf nsit\n" +
                "vyswalv reaqae hzoqyun lbci ibqfljz cgjflqf kos\n" +
                "njrzfvu nxw nxw bdsgnxp\n" +
                "gxlgn qrx nspbvl pzuob nggxl ipak wjr lggxn zas\n" +
                "xkd sooef fsayaob tfsiyl\n" +
                "ecldvh jugto ghfpbev xzlc\n" +
                "rpyattn spb ajdplq eaorgi ackirxg knrap cobdeu qca pkp zkc\n" +
                "bhh tczwffg bhh bhh hrjx jwyu gry kkgghnx\n" +
                "zsav frsakbr bvzd gafr homzjw frsakbr yasgz homzjw kqa\n" +
                "nbd mekhfif mekhfif keuoag nbd\n" +
                "mzv vzm utuxhuf uufuhtx\n" +
                "siy tdbii qtu yrxar ruubale yrxar lsvnr yqxq ruubale\n" +
                "wstykuz fxnuszr tgmkw eovvrd ohheh raf degh hzoeun tiou wpt cqnw\n" +
                "dzbyhrv vzlbvn ncoa xfglcye ncoa sykfps ghi\n" +
                "lvi ilv xalhd ztejzb\n" +
                "zaeu diz zaeu gtdjsz fmoxgju diz uvh\n" +
                "zef lmkqlcs jnhgqww qsm fuatcq ixfa\n" +
                "wgp gvu rpmxrjh yokepvc yokepvc lywdl bbvvbf yokepvc\n" +
                "etjfs gjh tvmxb agovg yihn rmmh nue jfil\n" +
                "zgcco slios jbfodb wpthe ydvit regizw regizw qosou slios cto jfz\n" +
                "kmmq lnafaha ddos hrsjtxk zjch rfynx eovks\n" +
                "ezeuzu jfpv oinrstv vsw naoz enrcy svw jfvp kgmfwf cfisxzo\n" +
                "ljtv watps equf ljtv equf\n" +
                "axijki zotolsi ryqujrm xmhug fhz lkgaw umzokxh ktr jsdsfat trk iosoztl\n" +
                "vpqvvvn ydjz tcqc asffcxr rxb fyt vyham fys\n" +
                "agxrcxl obcncq htod ved ozesk obcncq iwqmksk fsijtg iidyy lxu ozesk\n" +
                "orsyqt otqrys pnaax qtrsoy\n" +
                "oyisc chu ahdp abhbtry kjsqve tkpux tkpux sxzu sxzu\n" +
                "wquw umlbwf mxzdbvb upp fopxe aub bau eritni punrpfc esnkyg\n" +
                "jjlzy hozskgo jjlzy aiq jjlzy sgfyhsd\n" +
                "ejghc ejghc ejghc igacslu\n" +
                "unzmg fugzotb nxkdlds ewn hydj fbr iuly oiwwkbg scnozau sfi dsishk\n" +
                "xuhjduu hfloaga xhuuduj mbavfkd nrnl ral erc mntev elpoqgq\n" +
                "seydro onpi qjey skgkiox fbdgyt xhr rhvz dpsjcj tfzd spjdcj btqn\n" +
                "difyxz cdm jlzsz oycm txyssd wckqshu ihya yjyb\n" +
                "nmrhlif wcreso chtqfov qcftvoh lqp egd erc myep plq cjdh\n" +
                "hcnwgkq kkrpxxj gwe xqgea kkrpxxj nxz mumqbw kwxhlz kkrpxxj otqy\n" +
                "rxbioyf cszah mhu mhu mhu\n" +
                "qpbrf jzink ojy idt nrjykzu\n" +
                "omnrq kkol dex eaqdmej dnpaum ynnntw ddwewsh ztcenhc zqdrq hmi\n" +
                "ngmqpu owmcuz gop gdbsfc nyott cdsflq ngmqpu\n" +
                "srus lrexy aqgkqvm tiyjm\n" +
                "wxa qopky glaaekv ykopq lna gyxvpx xwa hly dbvo\n" +
                "vqf sqrqw phxn xiw gejyzip ugg gghhugl zyqae\n" +
                "ylj cyolrx giim yrchuu yrchuu ylj\n" +
                "rixa yfusuqn yfusuqn yfusuqn\n" +
                "lpm gboakz ylyv gje yxu ahokxb ixwnpu hlcka cndhbbm nkmvts xdtqbc\n" +
                "veul zjvz regtyp njwfpm\n" +
                "pdlyjbn edawa xbcmyew gme yuk yek nfknzgn ehjz\n" +
                "rcgun ulv ntbwnvg ptf givapv bych gmxxxf iajqpb gwh ipavvg\n" +
                "qvpwk grbb gptdgrh sij vunv hsb uegsmt uos vkxdd\n" +
                "iun aagzlj elqcq vkrk awl yyt dxfhkwq hbkeht\n" +
                "cgf omofuz zddgwef iyosk hmou\n" +
                "mvjorn zseyo wpfjlac kpxb dlh ggo zgxoso txzuy jfbmv lacjpwf vha\n" +
                "twrsrw pxv iklzg rtfcl kfbcjix uyvowpa kfbcjix ofnsf adqm\n" +
                "qvi ivr plxfrg awugjh fxbv ztlljk qvi jdkfts xyq jdkfts uqwgdr\n" +
                "phs eimuuf lmxq wmp\n" +
                "laf gmuowr rplgkh orentm whor lkrhgp mjwr zapz mdqtqyq ttkfkf\n" +
                "fxk wdbl fjh ojqxp yvs fkx ysv ngksb\n" +
                "oclyxqu tpajqun vvmj twin zclk\n" +
                "srcwxs xiduxd tqpfc sbqybp sdtzw gizfn bpji kaolpuy\n" +
                "pfkmk olmsaz uffy uyff\n" +
                "crpazh pcrzha lew lkhcjij stfxq\n" +
                "nkbb rnlo icnzg rnlo ejanu mofx ujblud\n" +
                "abte xnjfo boz fnxzid nqfhifm jmnmsgh\n" +
                "lvck nfll szdgrxc nghig szdgrxc oytahh cibk szdgrxc\n" +
                "sduf jgv rrt spxw fdus\n" +
                "gplutjv ufep fuzrnj tmko zzpj cpd mvtrzq\n" +
                "ycdiav qvr ycdiav tjngezs mphk oykgcei ycdiav\n" +
                "egbkscg ksgcbeg qmw jdbj\n" +
                "kbgx otnfyc agouh iai lyhqd yzihyq ouagh snzhxa xyxrgz\n" +
                "kdpqljx rin dlxms ukdzedc duezdkc ikgplm ffk vdmie qziajdf ftfwl\n" +
                "prrzhj okffaot tlrxpjd aquc dbonaef enfdoab nwbtuh\n" +
                "vyzf ijo cdhek bvlgxt kvldmp kvldmp vfvg\n" +
                "zhijgyb yfkkal utb brew vfj ztiftq\n" +
                "kodsuol ubnbdv iozwfum ayqxgnj qkp yiiv wbkgi psi wnfa epw\n" +
                "iok mecjsp lccn nrb kobca wkznctc afjjlrt\n" +
                "yrw yhsva hgx nxjfbb\n" +
                "dbdj vef xjssylt hjlld bqbmx ihfmz uhij zoh opzrmy mfq\n" +
                "wqhcq usyfuc wqhcq pmf aryq nhvtkh\n" +
                "nkviwge snpfdza nadzfsp evvdnrl qled ekqs qumle myhky\n" +
                "rgljws kjuk txgeein ajmph pjhdy pmvr upae yfh\n" +
                "vmepn wekgc qfwybl midbac vmepn ddqmbu vmepn uhfccp yuh zzz gnx\n" +
                "hyqv fud xdc bssziiv mwo xfrsn xqehs mwo\n" +
                "djhr qxhfy vdjs ueoi mbmwa lkeumzd hyxfq krbyy ywvcstf wdkum xfqyh\n" +
                "heprtex wgxpign lvm vlm ypswfxr ggxipwn hdszz blrv ppy\n" +
                "fwalim sbqj zewxcaf qjsb cjgujwr uclxro wceu wmaifl rnd\n" +
                "gmivd spncot jxeycn notspc nzb wie ceyjxn xlam\n" +
                "cfujai hfvux hhtwe hfvux oputz oam\n" +
                "gmwu xwthnkp xwthnkp mdxa xwthnkp\n" +
                "shfqzi hdq uyyqjrd wczfvy wciko hdq nuywebl\n" +
                "dtkq qnb uzmo ypxfja cekqe cekqe tnaibc uzmo pmtnb\n" +
                "apdz exdze pop pvm pce hywvftx jrjezgd jkajq jcdjli\n" +
                "satq czv cfhyca cshnyh cshnyh rcu cshnyh\n" +
                "mxp ujq fmrnzxx xqv mxp\n" +
                "nel whnnxak lwzlre mrxq kpo pko bsa gimtzwb\n" +
                "okssco iuke vcnv okssco liawwc vcnv aztl\n" +
                "kjvq rye eawplkw qzxt jkqv bxbfyv\n" +
                "bphssax ylemih wsm jnpxce jgh repsyj ieypbz asx\n" +
                "dwivit ptcwt qwectqk ttwcp bklpa ivditw\n" +
                "ies knj zemmcto mczotme yanr kjdrwr mcry ndols\n" +
                "dqzdpg adb ulsv ulsv qux ppmoru sjcn dpihqz\n" +
                "akazkk kssdguo cgigktm indfh wwh kevuhv dclpjv kgtd ehjxous\n" +
                "spogxy jyzhag qumd brk cbu akbpjxb spie\n" +
                "jgyn cxbar axtkwh hktgcm cfsla xll rpauwl cgpziuh dyc brcxa\n" +
                "dodey dysnjxe kzmyytw tzddd cnupwmv\n" +
                "nqab whxkb kvc kvc jcjhywy mbbpfwj fxozlt whxkb qwz\n" +
                "ihmif xhjc lmfk yjrsioo uvtd qvtqsgt dqd\n" +
                "uvzedxd afli hkrigd lkzkzu ncki toam hoaefui\n" +
                "zmvywjv jsjf nrbrgt mbs yog eexuo\n" +
                "ukzab euwb qnkanyt lgeqf qefgl ewub\n" +
                "zbol bolz ilncu ciunl\n" +
                "hjryu qyl ajwju rplplr skbdsl xvto\n" +
                "ojfotbx zvta jofxtbo ejjnhi jyeiz yzeij\n" +
                "ivr pvrwef ivr zgnm jscgaoq hfjuzju cea hfjuzju ehszaz\n" +
                "yikp gul ugbniac jehm fwqxb hqbhi hlfr iyuuf vacrao fwqxb\n" +
                "plsjh efu napxwe jfxfjz efacqcp sythfxc sythfxc napxwe qncqc\n" +
                "meuf rcjzf mhluz kbrk tzjrcn omoiprl khs oyzad yuzbz\n" +
                "exvzzuc ckqfivf uoyidkg mwztyf wxtg uzrls gudioyk wfihpzn tdmwhf\n" +
                "qoovwqm bldswvy xkb yqrcluk qyrclku cluqyrk qgakbv urclhse\n" +
                "rmmymgg ytpqtuq ibt tmedibz tmbsdg ytpqtuq cxbnng\n" +
                "qkyeo frjjht vkpt ikztq avzqon diw noqzva dvkhwdt\n" +
                "opz usos kdqseyb cdxvve nahjc hbr rhsfm hcjna wnczls kky\n" +
                "sgeml uyaoe ked utxab hxqa glems wbdo kzrjsq\n" +
                "isp bmebt becira ixoz yeakj fmueu\n" +
                "jrd qyys cik bmaief zxllza rsu swvodiv ivvdsow ikpvwaj jdr qte\n" +
                "gzjjre tkjhdn lrqmvw gues ositymc xhfiutm\n" +
                "kcnble oxoh zggvo zjz auub kunoj snil zggvo lgql\n" +
                "yyfmd wbwmizs vmb clba bpzzjz nlt wgukoe hedlp osxz\n" +
                "skic mgcr chkj eiiy kdhch gcanziz dpecug fccp\n" +
                "jhnejy akpwbj mhrunvm wjzwyhe lwxostl gfe niuhj iuf bewur\n" +
                "nuursk gehzvck szm fllr bfaq ijpjp gehzvck bfaq\n" +
                "ecx etrsadp lyekp lxf flx tadreps\n" +
                "gbo wzkner hky ggoqu\n" +
                "yiitvf tyvifi xpnbk iiytfv\n" +
                "okpjxyq mmxcha pujgv ltgfdk wpporh bfle tuupth ukyyjgv vlnwhz\n" +
                "phbs qtpolnh udito ukx kjqsi jbwf sgkkwgm udito mwwb wihg\n" +
                "mces dhc qccy sxyilmb qmki dyqnr qsh aigaemz oofdw hbifiz\n" +
                "yyben jjklnz whwswg tox vgytp noijcv jjsa ybney eyrvg htjl vxli\n" +
                "detb tus rloz zymvmg zpe\n" +
                "usvkehi kxgvo rna scnaljd jmowud ipfkkf rxvpie nxysvj pvquagf fjhsvef\n" +
                "ytosun puwdoix oyc qdufuw ysunot\n" +
                "htw biy htw oxot oxot\n" +
                "xgzi nbq lxxtmt nbq lxxtmt fnzmmno\n" +
                "lko bdbj kcqvc torg enbfbj sbooco afjbclm dendwq\n" +
                "cgih ikmfn lyhzhxd ubq ixrori tofbo\n" +
                "glfhfzs gihsccj yic mlci slne\n" +
                "wdiu lhl hdlhzo voo yhqckcy axnz yqyi fyss qhvtsbc\n" +
                "aotbk zfokegh uax myhehay terwus hmzic fdwojh wjuwlp\n" +
                "ucbiex eigq qqe ifqw sxakwl xkwsal qeq\n" +
                "pknvybh qkrwi povvd phairw qst inklob yrryv bcuv dolvr okwe iexrpbw\n" +
                "kkah qrt dihygsm nly rblqvrm sxguxj yspmre\n" +
                "gzhhkjt uimif bssle vdiaa wkohq nrgboi htkojiw\n" +
                "aeb xihgva vwcjbjh lri nlwbxun sargiey uyekrc\n" +
                "fnnwfbj yyccaxu fhqb nlmwhc ymbqky ooljix mfijg ryykirn womn rygezi qsdwgpw\n" +
                "itfs udfr sitf gml\n" +
                "gknztly vay ypy jpid pyy mbpfmwz pfmzbwm qqec\n" +
                "bbhmw uus xffgd xcjzrlk kyecv zcerxe\n" +
                "ncpc otqzotf godtu yhcpsyw ncpc fbs\n" +
                "ggoiqm ofk pryqt kqdbo ktek kklhlju iqgmgo gqoimg flscx\n" +
                "gsgmvy tktzj kgi ikyz pthtk hxt gik\n" +
                "bunvugy fefqpkk juwk aent\n" +
                "atm tma dzyret jmuqke xbayiit jumqke\n" +
                "dilfw qws ldwfi lnujld ywrogk kjh adaj khmlb hkbml\n" +
                "veaemc xugf udpphf mydi jbvebgp ngyhly pufdph vbgepbj\n" +
                "vyd tisntn qmc yzal\n" +
                "uxdlc piw mwjnk qiar xwpspf sxktemh jmw\n" +
                "qhhvar pox aed bgwq doe uyktv pox vriy ndel pzx aed\n" +
                "tswei dtfb yhj krxu yqio wtzpm wtzpm yqio\n" +
                "bjzp zzp qdzdfv tzkbl nggbfqs vquqds xiud xgrkb\n" +
                "ffvjfwp jbzslqo ffvjfwp pchzrqv ffvjfwp pkd nlav\n" +
                "czepixn yurmsw ucckih qqlnxjj exipznc\n" +
                "xeu llc jnmp dmz pnmj stqzao\n" +
                "fzvu uscqp xerkzkg roivhri fzvu yiwae xguz ajpg\n" +
                "qdzk uyyoi cspmnc qdzk nwknfx fnngvla cbl\n" +
                "acg utwrv cahupdm xgat elb aemkf wmkdzj kfmae ahlrwu yxfcj\n" +
                "vdumh rcd rgc hpqk qeum fpgva qkhmuji rjxpuzk ommk\n" +
                "ztvm ntxkav ajv avj ippodg sukg bivcslu tes gdlrbnt bdlkaye xpgslef\n" +
                "aygsym pwq owxmx xjw\n" +
                "dkhykf pfqeyo lfq saoewy qldrky sdgrrcr frdqn tkfezop doo saoewy\n" +
                "cwof mqlscm iqxhb nnkex nxx glgpbn\n" +
                "noq zikmeyx yodahj ssu qqmifa plcbv rsahsd\n" +
                "nvc fuwiyq myv hjn rtuoq zoyp rqnt xchlrg\n" +
                "dziscfa nbzsuvp rbnrban cjdprp dkj zcry ckxtm\n" +
                "stpm ifcbmmw dpkpzo sot ydpeydw nusp nkciqa psnr\n" +
                "udikjfr foqnxl whq ojuspzz ddyz emdktzb gfio mnd hyb\n" +
                "vchdphx zkrtky ucyifqx ryzl txdixd cip aid cip\n" +
                "wcz ywzwpp viswpsm qfus uzopaq mhps sidjky kipvjg\n" +
                "wehhc rzujn urprwzw gkwzhk rhrpph xkzzl rzujn yddlb\n" +
                "wlhif foh rpvylg gruiqdv daih yflhbr coe yflhbr hvluddj\n" +
                "hfzi ffjntj fdth crkrzdr nyel nlxm cawze bfjz neixnw uygqvmw zayf\n" +
                "guthfwn kcinec glhaiqv rfgbi cbrm\n" +
                "mvqv lszqu eyjn suq lavyjbh ujivbza aianl wik noy zth\n" +
                "zkn ren ncoyj fppsy dwgtgqz til\n" +
                "ybxepr hrzcrxs zhrscxr uvpxxl eprxby vzgg\n" +
                "xhi zess zet mtpcu ibz nkwq cbzb etz kjjcns\n" +
                "kvmu rxgw xboplw enlqcxi uxysl xboplw kvmu oqxislh xeg qwhdc spsddge\n" +
                "dxaao ltjjn cpsvnxe core aojgu pbss nudwi\n" +
                "llro yoy tixzyc beim qirnb lffcr gzm\n" +
                "quxetbf gfpll gqyav dckhp xbfetqu xaebz xuqfteb\n" +
                "fblkc hsydxqt bvmwujr rak\n" +
                "epeohq olrwyft cmrvov fbdyxbg\n" +
                "uzqk pkhizw jbrnlvx aqkq mtmjmy gpcln gaqt rinrz gwis gpcln\n" +
                "ttkcu ttkcu mcq xao lhnxdph djj ylet atdln xao\n" +
                "pmwn svqktkm isopar krrfbna knrw kbm zsohxrk xlsmm knrw cmoikq etqeggc\n" +
                "undrw issrttk mcoe pvufl bwjwqkx jdz undrw vje\n" +
                "kfzqbb djpcjv ixctsvb rqsntv fcqz\n" +
                "agezraf ezrfaga pftdwrk slsxu axw\n" +
                "ezvkn smwko utdlu nizby\n" +
                "ygl dwtrpsh qzz cuntrr hdrn lujcx iwc bll qvjhg\n" +
                "jrdrvj ledrjp noqx igodve odgiev\n" +
                "zonvzgy ujnzj ujnzj zonvzgy ckzd\n" +
                "rmg lmib fdn nfd gfobw wrc iro nsz\n" +
                "acgxvh sdn zcef sdn jvgnmhi xitkqgy tbascbh\n" +
                "ykuzk ovp mikolx xxgpylt secuf yrtilra wnoypy mty lmnagx\n" +
                "wwmlins mxwye kjntv sadc wnvyoov rzdawl\n" +
                "ali ncsrq tcbjzpu oiw iimxlbp mwi hdvdl dqnicf lxit\n" +
                "sql vywv vycj nprzb tdqe qwvljm myhpvxy hdixbk ywqpn xvue vrno\n" +
                "etncz etncz czqw moz uaxbtm axlslow fhephy moz\n" +
                "wsriuaj umjkx mhxau luzf wmo kyx jidl ufuoz cbk\n" +
                "msfrvbt bxnd msfrvbt yut qwbx\n" +
                "rhag vfkqf rekoz buw qffvk wxs ghra\n" +
                "meignx dhdu xacg hmiqkd nrijc gcxa gwap lov ybtyr vol\n" +
                "qoqns swib mlegyjn ojdtt tvdrrhg oetg xdret nzpq\n" +
                "ntc zowllt dwiyht ztdeifx velaumx jfxxsqt uefmb gwn\n" +
                "bgykxl bykan tvvgcpa wdcsj coonage hpocfz sqmihw pnagv uozsh\n" +
                "wass vve ngyd yyvxmsq rsaypsa newxyc adqmbm xqsvymy ygdn idysq\n" +
                "ybo vpjcf tsbpc hcdszr qrxwjqr bzz tgjhkpu hgtxkt stpbc woro\n" +
                "ogszrg rszt owufa cohmv msygfw fud fzi lhts sfiy dfu gxsuj\n" +
                "fclumcq ejuj jkbu hbsv ythmpoo xdzg dkvrdue\n" +
                "rbf sunzzl sokgih rngqli xndnuj rbf smiea mqzpzb fwpcx smiea\n" +
                "uuuxchs uuuxchs fzna qlj tcjnv oghk fzna\n" +
                "zuiyk tbn nqma wptoecs xndgbqm mqan wmcahvm qpir\n" +
                "ztexf pqsc icxqsuf tkgr itnn yorg oyvqaj yoxggqk lep\n" +
                "ehm hysd jfv iugyt jyvh\n" +
                "fenjp zjtvvhb xfe dgxoah ljn ixvdyi fenjp odnlr\n" +
                "uosxyy euicgp lrsc euicgp mcszotm kvxrpk jfo oxu xyeiv fhdwl wbw\n" +
                "tsmdp gshgm kpb tlx kfznsu gglefv pkb gcnydo eavgrc rgd lgefvg\n" +
                "xuq svh cmzt bxxlvfm rtblxpu imuexhl lbre hqyedxa hwkgaak\n" +
                "hhlfj mlrdv dlsn zgcy hciiuzw uwciihz iizhcwu gwx\n" +
                "ukqoj kjqou hlk nfyz lusf kebvmrw ccaj ewmicq useba\n" +
                "jlnnl jsmox vnw ucr ggithr usqe allzc pfumkkm jlnnl\n" +
                "mswpbk lffjwq icc kef zlba uolrrl fqlfwj tbc\n" +
                "bfmra hdgczrw dgmnod afbmr fnczx\n" +
                "dcqrso cgbymsg jbx ofpbp rmtygip syly\n" +
                "yrmn wzkt lqys tzkw sqyl fxoc\n" +
                "wal zgjy cwnqyaf bhz dbpft owx\n" +
                "xnrautk dlsyot nzbohog xmzsbh soec wyy\n" +
                "kde jpkvbs eyzw ukgiv ggrtzcd vikgu mxqy jyh crdtgzg ebzet\n" +
                "psg jsykdw drpqzl qzqbge ldqpzr wsdykj lmhbldv hbognjp nqej fmxoq guuf\n" +
                "ueo ncedaju ijasprn rvxb mxkddl qvgdlbx bpj bpf pxewuf chvo lvrq\n" +
                "zlmg eciyqi xfbeoq pupyrc bfqexo ituqab pycrpu\n" +
                "jsk clo vqxzl aja jfbce ldov\n" +
                "muss tzg iksvdej zpw fxwhrv eeye fxwhrv\n" +
                "kjjd dzf zkppx qdwlx irudds kjgd pdrz rgogy qdwlx egx rjxldp\n" +
                "szjpf aouvl ehxq exqh\n" +
                "nzweop qlkje welkfs jqmvqi coc\n" +
                "ivmjzk usk auvmc vvcnwn qubihx vkms fbt udn uyto jjt kxqy\n" +
                "rayw ijaklcr ywra qkj qytxeh pmnfh qffvsft tyxheq\n" +
                "pea cqy tkg qidvx qidvx pea skgrndq\n" +
                "iijm xgwq zzpskl qtjezqt yqjwy dhbq\n" +
                "dfuv iqw iejb bjei iwq\n" +
                "ogrmldp xdc dcx cqhbwlp\n" +
                "wzwb xrjl keciql ckky litdr bmurdk anjs nyggesn ygwt svmee\n" +
                "bvkkzj rcr lozrw mgpwkm lwm yecsr ykl tzny aeus jmq mchopp\n" +
                "rsnvaa oikce angqn rnvsaa mhc\n" +
                "hsiov kxqpxtc rzh vjrqlx xxtkpqc wiunol qckxtpx\n" +
                "aosek lhi ruqgd rmr\n" +
                "agqvlao pvhcgz esw kwnpefs qsrvxz hgkgrs mpx odaiqi\n" +
                "dvqkrzf dawioo jtaco oeutol ravp apvr frjunad\n" +
                "wss nahhsh pfwgcfr rvvvq uqxxmhq qax vtrkfou medfj\n" +
                "imdyfc sez gve kgtryl kmqklg\n" +
                "crmg yhkpa bsfouax kyttpa who mcrbzaj kcsktxe yfv\n" +
                "zpw zlab pzw pwz okb\n" +
                "fgqlb byhkhfn qglfb ladle ifa\n" +
                "skr zwwjnr iub wekt biu jnrwwz\n" +
                "mpvt mpvt havn ztf\n" +
                "odqhd uxrswp ppj eztyj nxzwm fvxyadn tostwy odo abyp meqdm ktqkvh\n" +
                "fgufup uabd vhxem imto imto vhxem\n" +
                "vrpxxhi kii zwatqg nokg wesxju xplc sumte muwjj\n" +
                "nsse iquhoc giuv pxaa qpqn zrfk kywjr spz kgzc lfa\n" +
                "cjjgarr psvwoap ivijyt nfbxu ktiuy jajrgrc goyc\n" +
                "yrfzf wyxda gsslsy oeyve jczghf cbuwf iwnu izyrtho dyoup toizyhr vzzrr\n" +
                "bwqgxsr ufy cnouypd qwxbgsr efdkfe rwsblis bhvyws oodh\n" +
                "piqpez yhqahjp oxu qtomld\n" +
                "vjvpnwy kajjaim lcxmbyd fkdy ywvvnjp xcn nbwlklo\n" +
                "qghq mihdp vuv ocrzsw mlmkn rgnbfcm qgufcks btlulb effsrih\n" +
                "psazbfo vbpr efcspj yrjl pqjrfe relxjc nzzvb yviuhc\n" +
                "tbbhdbm uxhawtk bmdhtbb rqxrr pspjzx krtmf pnaz srcej rsjec\n" +
                "owikzec glvbqy jhknyuz jkaxu ldhnlpx wdp\n" +
                "qvuv wteohr daynue nehs gzqu porzrsk cqokye zzsbqox rqh ogxtn pskorrz\n" +
                "gnm grlfoon lxid isxa\n" +
                "jes iixswl umgbg qfixa xnecpns asm nopsmo axaopsm qahwpqd\n" +
                "orr auvlruu mqq uurlvua urauuvl fjrcuo mqht tkdgps tdvnhvq iezdv\n" +
                "txwyzy zzwk bzi etfg gtef\n" +
                "qyydr lllgosq qyydr lllgosq\n" +
                "xqm uyl ldpowm pxhi ievvvez hmhzwmr ldpowm jaw\n" +
                "qlvfq efgivhr rfhhu gvw bxgsrp sgbnjh ekgbp cyof rvghph nxfekia xym\n" +
                "lgladv ogj cir jxx msz fshf ayheu wpmke zckng vgrlv lxgmge\n" +
                "fcmp aabxdp hpxbb bblpy mpcf eju pnkv jxwoy hmv fgynps pbdxaa\n" +
                "jcrh dgg lzyiv ojop vhk vdb uinoetv\n" +
                "utlzcf ziizdo njffmxe uhyjxdb cztluf yjdhbxu\n" +
                "ubl cgz tyg nljl\n" +
                "slwe qaos ybcwdoh ogazkj tqh opggnzt ffrscl opggnzt izeh\n" +
                "evitfwb jpivmn dpnxzuf gdkx zprogl xehb\n" +
                "dktt kpnkizb rreq gjmosa iekdtpj rcxk eweawk qrre olv\n" +
                "cmcw vmw mujx mujx ypqfz\n" +
                "nzxcl fzwa ftcrc immendi tmxzzi hslye eibc tmxzzi\n" +
                "abfc jdqvk lichxx uiomtz tlq\n" +
                "mnkthoj nohjktm eued izmcjj\n" +
                "ullh wju bxfsif icnrmmj qnufw zubcnmo yewz phovhv\n" +
                "ndfvd gcyt wnm badaww twm jahlat ndfdv mtw xrq bechxx dnp\n" +
                "ceg gcxgu gnudeib utsynwx dpg wpsnp ahbbvkt wpsnp iou\n" +
                "wutcg congyz erkj ibtcics\n" +
                "xsbq lyycse qbsx ppgutls lroo tyor\n" +
                "hfiwoy hclhl gcwgqox ogo hlqr ultkaz yke iwohyf oog\n" +
                "bcl nemims udwkmlm nokck tkwny ulkihcu knwty pngamqg yxtphkn kuihlcu\n" +
                "nwsr enrutc eqcfb uxmdgju rfnzhsn tzk vysc\n" +
                "wbtki vjmkk kvjkm ibwkt sckvbv\n" +
                "xjxnow tli woxldj rotrtz nfkhcz ibh mla ybxldg\n" +
                "cwtpkhr oxywg qpwrgfm dfjpfuc kpcopa\n" +
                "byczby tbfkonk ytlczzf bbyczy\n" +
                "khuvrne rnamlgt akjtu qlx odr git xmiazr icwsxsq\n" +
                "jfm bneh tkdzuad bsr oruvmqq uauw zjlp gwov hot jkjbex\n" +
                "jjo uvk vlpy lpxd irntb uvk ehhsqv fxhvt jjo fpa\n" +
                "qrwu mgnw hvflf ytspp mco ikvbqg fflvh wts cbbf";


        Assertions.assertEquals(208, Day04Puzzle2.solve(input));

    }

}