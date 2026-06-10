package cousr01d
import io.ol.refactor.runtime.DataPort
import io.ol.refactor.runtime.LinkPort
import io.ol.refactor.runtime.MessageQueue
import io.ol.refactor.runtime.DynamicProps
import io.ol.refactor.runtime.NoOpDataPort
import java.math.BigDecimal

class Context implements DynamicProps {
    String wsVariables = ''
    String wsPgmname = 'COUSR01D'
    String wsTranid = 'AD01'
    String wsMessage = ' '
    String wsErrFlg = 'N'
    BigDecimal wsRespCd = BigDecimal.ZERO
    BigDecimal wsReasCd = BigDecimal.ZERO
    String carddemoCommarea = ''
    String cdemoGeneralInfo = ''
    String cdemoFromTranid = ''
    String cdemoFromProgram = ''
    String cdemoToTranid = ''
    String cdemoToProgram = ''
    String cdemoUserId = ''
    String cdemoUserType = ''
    BigDecimal cdemoPgmContext = BigDecimal.ZERO
    String cdemoCustomerInfo = ''
    BigDecimal cdemoCustId = BigDecimal.ZERO
    String cdemoCustFname = ''
    String cdemoCustMname = ''
    String cdemoCustLname = ''
    String cdemoAccountInfo = ''
    BigDecimal cdemoAcctId = BigDecimal.ZERO
    String cdemoAcctStatus = ''
    String cdemoCardInfo = ''
    BigDecimal cdemoCardNum = BigDecimal.ZERO
    String cdemoMoreInfo = ''
    String cdemoLastMap = ''
    String cdemoLastMapset = ''
    String cousr1ai = ''
    BigDecimal trnnamel = BigDecimal.ZERO
    String trnnamef = ''
    String trnnamei = ''
    BigDecimal title01l = BigDecimal.ZERO
    String title01f = ''
    String title01i = ''
    BigDecimal curdatel = BigDecimal.ZERO
    String curdatef = ''
    String curdatei = ''
    BigDecimal pgmnamel = BigDecimal.ZERO
    String pgmnamef = ''
    String pgmnamei = ''
    BigDecimal title02l = BigDecimal.ZERO
    String title02f = ''
    String title02i = ''
    BigDecimal curtimel = BigDecimal.ZERO
    String curtimef = ''
    String curtimei = ''
    BigDecimal fnamel = BigDecimal.ZERO
    String fnamef = ''
    String fnamei = ''
    BigDecimal lnamel = BigDecimal.ZERO
    String lnamef = ''
    String lnamei = ''
    BigDecimal useridl = BigDecimal.ZERO
    String useridf = ''
    String useridi = ''
    BigDecimal passwdl = BigDecimal.ZERO
    String passwdf = ''
    String passwdi = ''
    BigDecimal usrtypel = BigDecimal.ZERO
    String usrtypef = ''
    String usrtypei = ''
    BigDecimal errmsgl = BigDecimal.ZERO
    String errmsgf = ''
    String errmsgi = ''
    String trnnamea = ''
    String title01a = ''
    String curdatea = ''
    String pgmnamea = ''
    String title02a = ''
    String curtimea = ''
    String fnamea = ''
    String lnamea = ''
    String userida = ''
    String passwda = ''
    String usrtypea = ''
    String errmsga = ''
    String cousr1ao = ''
    String trnnamec = ''
    String trnnameh = ''
    String trnnameo = ''
    String title01c = ''
    String title01h = ''
    String title01o = ''
    String curdatec = ''
    String curdateh = ''
    String curdateo = ''
    String pgmnamec = ''
    String pgmnameh = ''
    String pgmnameo = ''
    String title02c = ''
    String title02h = ''
    String title02o = ''
    String curtimec = ''
    String curtimeh = ''
    String curtimeo = ''
    String fnamec = ''
    String fnameh = ''
    String fnameo = ''
    String lnamec = ''
    String lnameh = ''
    String lnameo = ''
    String useridc = ''
    String useridh = ''
    String userido = ''
    String passwdc = ''
    String passwdh = ''
    String passwdo = ''
    String usrtypec = ''
    String usrtypeh = ''
    String usrtypeo = ''
    String errmsgc = ''
    String errmsgh = ''
    String errmsgo = ''
    String ccdaScreenTitle = ''
    String ccdaTitle01 = '      AWS Mainframe Modernization       '
    String ccdaTitle02 = '              CardDemo                  '
    String ccdaThankYou = 'Thank you for using CCDA application... '
    String wsDateTime = ''
    String wsCurdateData = ''
    String wsCurdate = ''
    BigDecimal wsCurdateYear = BigDecimal.ZERO
    BigDecimal wsCurdateMonth = BigDecimal.ZERO
    BigDecimal wsCurdateDay = BigDecimal.ZERO
    BigDecimal wsCurdateN = BigDecimal.ZERO
    String wsCurtime = ''
    BigDecimal wsCurtimeHours = BigDecimal.ZERO
    BigDecimal wsCurtimeMinute = BigDecimal.ZERO
    BigDecimal wsCurtimeSecond = BigDecimal.ZERO
    BigDecimal wsCurtimeMilsec = BigDecimal.ZERO
    BigDecimal wsCurtimeN = BigDecimal.ZERO
    String wsCurdateMmDdYy = ''
    BigDecimal wsCurdateMm = BigDecimal.ZERO
    BigDecimal wsCurdateDd = BigDecimal.ZERO
    BigDecimal wsCurdateYy = BigDecimal.ZERO
    String wsCurtimeHhMmSs = ''
    BigDecimal wsCurtimeHh = BigDecimal.ZERO
    BigDecimal wsCurtimeMm = BigDecimal.ZERO
    BigDecimal wsCurtimeSs = BigDecimal.ZERO
    String wsTimestamp = ''
    BigDecimal wsTimestampDtYyyy = BigDecimal.ZERO
    BigDecimal wsTimestampDtMm = BigDecimal.ZERO
    BigDecimal wsTimestampDtDd = BigDecimal.ZERO
    BigDecimal wsTimestampTmHh = BigDecimal.ZERO
    BigDecimal wsTimestampTmMm = BigDecimal.ZERO
    BigDecimal wsTimestampTmSs = BigDecimal.ZERO
    BigDecimal wsTimestampTmMs6 = BigDecimal.ZERO
    String ccdaCommonMessages = ''
    String ccdaMsgThankYou = 'Thank you for using CardDemo application...      '
    String ccdaMsgInvalidKey = 'Invalid key pressed. Please see below...         '
    String secUserData = ''
    String secUsrId = ''
    String secUsrFname = ''
    String secUsrLname = ''
    String secUsrPwd = ''
    String secUsrType = ''
    String secUsrFiller = ''
    String dfhaidValues = ''
    String dfhenter = 'ENTER'
    String dfhpf3 = 'PF3'
    String dfhpf4 = 'PF4'
    String dfhclear = 'CLEAR'
    String dfhbmscaValues = ''
    String dfhblue = 'BLUE'
    String dfhred = 'RED'
    String dfhpink = 'PINK'
    String dfhgreen = 'GREEN'
    String dfhturq = 'TURQUOISE'
    String dfhyello = 'YELLOW'
    String dfhneutr = 'NEUTRAL'
    String dfhbmasb = 'BMASB'
    String dfhbmasf = 'BMASF'
    String dfhbmask = 'BMASK'
    String dfhbmunn = 'BMUNN'
    String dfhbmunp = 'BMUNP'
    String dfhbmpro = 'BMPRO'
    String dfhbmprf = 'BMPRF'
    String dfhbmbry = 'BMBRY'
    String dfhbmdar = 'BMDAR'
    String dfhbmfse = 'BMFSE'
    String dfhbmpem = 'BMPEM'
    String dfhbmpnl = 'BMPNL'
    String dfhdft = 'DEFAULT'
    String dfhblink = 'BLINK'
    String dfhrevrs = 'REVERSE'
    String dfhundln = 'UNDERLINE'
    String dfhoutop = 'OUTTOP'
    String dfhoulft = 'OUTLEFT'
    String dfhourgt = 'OUTRIGHT'
    String dfhoubot = 'OUTBOTTOM'
    String dfhoubox = 'OUTBOX'
    String dfhsosi = 'SOSI'
    String dfhtrans = 'TRANSPARENT'
    String dfhopaq = 'OPAQUE'
    String lkCommarea = ''
    DataPort data = new NoOpDataPort()
    int sqlcode = 0
    Map<String, Object> __cursors = [:]
    String lastAidKey = 'ENTER'
    /** Simulated CICS commarea length: non-zero so programs treat us as a re-entry. */
    int eibcalen = 32
    /** Simulated EIBCPOSN (1-based cursor position) for PF-key / field-sensitive logic. */
    int eibcposn = 0
    /** Simulated DFHCOMMAREA payload (string view). */
    String dfhcommarea = ''
    /** Target program name set by `EXEC CICS XCTL`; null while the program is still active. */
    /** The runner's pseudo-conversational loop exits as soon as this becomes non-null. */
    String xctlTo = null
    /** State queued by the most recent `EXEC CICS SEND MAP`; consumed by `EXEC CICS RETURN`. */
    /** Mirrors CICS semantics where successive SENDs replace each other and only the final one renders. */
    /** Typed as `Object` to avoid pulling the per-program state package into the Context source. */
    Object pendingScreen = null
    LinkPort linkPort = null
    MessageQueue messageQueue = new MessageQueue()
    List<String> traceLog = []
    void trace(String msg) { traceLog << msg }
    /** Slot for properties not declared as typed columns (RPG PSDS, copybook fields). */
    private final Map<String, Object> __dynamicProps = [:]
    @Override Map<String, Object> dynamicProps() { __dynamicProps }
    def propertyMissing(String name) { __dynamicProps[name] }
    def propertyMissing(String name, value) { __dynamicProps[name] = value }
    Map snapshot() {
        def base = this.properties.findAll { k, v -> !['traceLog','metaClass','class','pendingScreen','data','__dynamicProps','__cursors'].contains(k.toString()) }
        base.putAll(__dynamicProps)
        base
    }
}
