package cousr01d
import io.ol.refactor.runtime.*
import cousr01d.states.*

class Paragraphs {
    static State mainPara(Context ctx, ScreenPort screen) {
        ctx.trnnameo = null
        ctx.title01o = null
        ctx.curdateo = null
        ctx.pgmnameo = null
        ctx.title02o = null
        ctx.curtimeo = null
        ctx.fnameo = null
        ctx.lnameo = null
        ctx.userido = null
        ctx.passwdo = null
        ctx.usrtypeo = null
        ctx.errmsgo = null
        ctx.wsErrFlg = 'N'
        ctx.wsMessage = ' '
        ctx.errmsgo = ' '
        if ((ctx.eibcalen ?: 0) == 0) {
            ctx.cdemoToProgram = 'COSGN00D'
            State __r0 = cousr01d.Paragraphs.returnToPrevScreen(ctx, screen)
            if (__r0 != null) return __r0
        } else {
            ctx.carddemoCommarea = CobolString.refMod((ctx.dfhcommarea)?.toString(), (1 as int), ((ctx.eibcalen ?: 0) as int))
            if (!(ctx.cdemoPgmContext == 1)) {
                ctx.cdemoPgmContext = 1
                ctx.cousr1ao = null
                ctx.cousr1ai = null
                ctx.fnamel = -1
                State __r1 = cousr01d.Paragraphs.sendUsraddScreen(ctx, screen)
                if (__r1 != null) return __r1
            } else {
                State __r2 = cousr01d.Paragraphs.receiveUsraddScreen(ctx, screen)
                if (__r2 != null) return __r2
                switch (ctx.lastAidKey) {
                    case 'ENTER':
                        State __r3 = cousr01d.Paragraphs.processEnterKey(ctx, screen)
                        if (__r3 != null) return __r3
                        break
                    case 'PF3':
                        ctx.cdemoToProgram = 'COADM01D'
                        State __r4 = cousr01d.Paragraphs.returnToPrevScreen(ctx, screen)
                        if (__r4 != null) return __r4
                        break
                    case 'PF4':
                        State __r5 = cousr01d.Paragraphs.clearCurrentScreen(ctx, screen)
                        if (__r5 != null) return __r5
                        break
                    default:
                        ctx.wsErrFlg = 'Y'
                        ctx.fnamel = -1
                        ctx.wsMessage = ctx.ccdaMsgInvalidKey
                        State __r6 = cousr01d.Paragraphs.sendUsraddScreen(ctx, screen)
                        if (__r6 != null) return __r6
                }
            }
        }
        State __ps = (State) ctx.pendingScreen
        ctx.pendingScreen = null
        return __ps
        return null
    }

    static State processEnterKey(Context ctx, ScreenPort screen) {
        if ((((ctx.fnamei ?: '').toString().trim() == '')) || ((ctx.fnamei == null || (ctx.fnamei).toString().trim() == ''))) {
            ctx.wsErrFlg = 'Y'
            ctx.wsMessage = 'First Name can NOT be empty...'
            ctx.fnamel = -1
            State __r0 = cousr01d.Paragraphs.sendUsraddScreen(ctx, screen)
            if (__r0 != null) return __r0
        }
        else if ((((ctx.lnamei ?: '').toString().trim() == '')) || ((ctx.lnamei == null || (ctx.lnamei).toString().trim() == ''))) {
            ctx.wsErrFlg = 'Y'
            ctx.wsMessage = 'Last Name can NOT be empty...'
            ctx.lnamel = -1
            State __r1 = cousr01d.Paragraphs.sendUsraddScreen(ctx, screen)
            if (__r1 != null) return __r1
        }
        else if ((((ctx.useridi ?: '').toString().trim() == '')) || ((ctx.useridi == null || (ctx.useridi).toString().trim() == ''))) {
            ctx.wsErrFlg = 'Y'
            ctx.wsMessage = 'User ID can NOT be empty...'
            ctx.useridl = -1
            State __r2 = cousr01d.Paragraphs.sendUsraddScreen(ctx, screen)
            if (__r2 != null) return __r2
        }
        else if ((((ctx.passwdi ?: '').toString().trim() == '')) || ((ctx.passwdi == null || (ctx.passwdi).toString().trim() == ''))) {
            ctx.wsErrFlg = 'Y'
            ctx.wsMessage = 'Password can NOT be empty...'
            ctx.passwdl = -1
            State __r3 = cousr01d.Paragraphs.sendUsraddScreen(ctx, screen)
            if (__r3 != null) return __r3
        }
        else if ((((ctx.usrtypei ?: '').toString().trim() == '')) || ((ctx.usrtypei == null || (ctx.usrtypei).toString().trim() == ''))) {
            ctx.wsErrFlg = 'Y'
            ctx.wsMessage = 'User Type can NOT be empty...'
            ctx.usrtypel = -1
            State __r4 = cousr01d.Paragraphs.sendUsraddScreen(ctx, screen)
            if (__r4 != null) return __r4
        }
        else {
            ctx.fnamel = -1
        }
        if (!(ctx.wsErrFlg == 'Y')) {
            ctx.secUsrId = ctx.useridi
            ctx.secUsrFname = ctx.fnamei
            ctx.secUsrLname = ctx.lnamei
            ctx.secUsrPwd = ctx.passwdi
            ctx.secUsrType = ctx.usrtypei
            State __r5 = cousr01d.Paragraphs.insertUserDb2Table(ctx, screen)
            if (__r5 != null) return __r5
        }
        return null
    }

    static State returnToPrevScreen(Context ctx, ScreenPort screen) {
        if (((ctx.cdemoToProgram == null || (ctx.cdemoToProgram).toString().trim() == '')) || (((ctx.cdemoToProgram ?: '').toString().trim() == ''))) {
            ctx.cdemoToProgram = 'COSGN00D'
        }
        ctx.cdemoFromTranid = ctx.wsTranid
        ctx.cdemoFromProgram = ctx.wsPgmname
        ctx.cdemoPgmContext = 0
        ctx.xctlTo = (ctx.cdemoToProgram)?.toString()?.trim()
        return null
        return null
    }

    static State sendUsraddScreen(Context ctx, ScreenPort screen) {
        State __r0 = cousr01d.Paragraphs.populateHeaderInfo(ctx, screen)
        if (__r0 != null) return __r0
        ctx.errmsgo = ctx.wsMessage
        ctx.pendingScreen = new cousr01d.states.ShowCousr1a()
        return null
    }

    static State receiveUsraddScreen(Context ctx, ScreenPort screen) {
        // CICS RECEIVE MAP COUSR1A (handled by Wait_COUSR1A)
        return null
    }

    static State populateHeaderInfo(Context ctx, ScreenPort screen) {
        def __cd = CobolDateSupport.currentDateParts()
        ctx.wsCurdateData = __cd.raw
        ctx.wsCurdateYear = __cd.year
        ctx.wsCurdateMonth = __cd.month
        ctx.wsCurdateDay = __cd.day
        ctx.wsCurdateMm = __cd.month
        ctx.wsCurdateDd = __cd.day
        ctx.wsCurdateMmDdYy = CobolDateSupport.formatMmDdYy(__cd)
        ctx.wsCurtimeHours = __cd.hours
        ctx.wsCurtimeMinute = __cd.minute
        ctx.wsCurtimeSecond = __cd.second
        ctx.wsCurtimeMilsec = __cd.hundredths
        ctx.wsCurtimeHh = __cd.hours
        ctx.wsCurtimeMm = __cd.minute
        ctx.wsCurtimeSs = __cd.second
        ctx.wsCurtimeHhMmSs = CobolDateSupport.formatHhMmSs(__cd)
        ctx.title01o = ctx.ccdaTitle01
        ctx.title02o = ctx.ccdaTitle02
        ctx.trnnameo = ctx.wsTranid
        ctx.pgmnameo = ctx.wsPgmname
        ctx.wsCurdateMm = ctx.wsCurdateMonth
        ctx.wsCurdateDd = ctx.wsCurdateDay
        ctx.wsCurdateYy = CobolNumeric.toBigDecimal(CobolString.refMod((ctx.wsCurdateYear)?.toString(), (3 as int), (2 as int)))
        ctx.curdateo = ctx.wsCurdateMmDdYy
        ctx.wsCurtimeHh = ctx.wsCurtimeHours
        ctx.wsCurtimeMm = ctx.wsCurtimeMinute
        ctx.wsCurtimeSs = ctx.wsCurtimeSecond
        ctx.curtimeo = ctx.wsCurtimeHhMmSs
        return null
    }

    static State insertUserDb2Table(Context ctx, ScreenPort screen) {
        Cousr01dData.insertUsersec(ctx, [secUsrId: ctx.secUsrId, secUsrFname: ctx.secUsrFname, secUsrLname: ctx.secUsrLname, secUsrPwd: ctx.secUsrPwd, secUsrType: ctx.secUsrType])
        switch (ctx.sqlcode) {
            case 0:
                State __r0 = cousr01d.Paragraphs.initializeAllFields(ctx, screen)
                if (__r0 != null) return __r0
                ctx.wsMessage = ' '
                ctx.errmsgc = ctx.dfhgreen
                Cousr01dData.commitOperation(ctx)
                ctx.wsMessage = [('User ').toString(), ((ctx.secUsrId ?: '')).toString().split(' ', 2)[0], (' has been added ...').toString()].join('')
                State __r1 = cousr01d.Paragraphs.sendUsraddScreen(ctx, screen)
                if (__r1 != null) return __r1
                break
            case -803:
                ctx.wsErrFlg = 'Y'
                ctx.wsMessage = 'User ID already exist...'
                ctx.useridl = -1
                Cousr01dData.rollbackOperation(ctx)
                State __r2 = cousr01d.Paragraphs.sendUsraddScreen(ctx, screen)
                if (__r2 != null) return __r2
                break
            case -1:
                ctx.wsErrFlg = 'Y'
                ctx.wsMessage = 'User ID already exist...'
                ctx.useridl = -1
                Cousr01dData.rollbackOperation2(ctx)
                State __r3 = cousr01d.Paragraphs.sendUsraddScreen(ctx, screen)
                if (__r3 != null) return __r3
                break
            default:
                ctx.wsErrFlg = 'Y'
                ctx.wsMessage = 'Unable to Add User...'
                ctx.fnamel = -1
                Cousr01dData.rollbackOperation3(ctx)
                State __r4 = cousr01d.Paragraphs.sendUsraddScreen(ctx, screen)
                if (__r4 != null) return __r4
        }
        return null
    }

    static State clearCurrentScreen(Context ctx, ScreenPort screen) {
        State __r0 = cousr01d.Paragraphs.initializeAllFields(ctx, screen)
        if (__r0 != null) return __r0
        State __r1 = cousr01d.Paragraphs.sendUsraddScreen(ctx, screen)
        if (__r1 != null) return __r1
        return null
    }

    static State initializeAllFields(Context ctx, ScreenPort screen) {
        ctx.fnamel = -1
        ctx.useridi = ' '
        ctx.fnamei = ' '
        ctx.lnamei = ' '
        ctx.passwdi = ' '
        ctx.usrtypei = ' '
        ctx.wsMessage = ' '
        ctx.secUserData = ' '
        return null
    }

}
