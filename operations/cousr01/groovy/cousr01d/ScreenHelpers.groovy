package cousr01d
import io.ol.refactor.runtime.*

class ScreenHelpers {
    static ScreenOutput buildScreen_COUSR1A(Context ctx) {
        MapTemplate.load('maps/COUSR1A.json').render(ctx.snapshot())
    }

    static void applyInput_COUSR1A(Context ctx, ScreenInput input) {
        ctx.lastAidKey = input.aidKey
        ctx.eibcposn = input.cursorPosition ?: 0
        if (input.fields.containsKey('TRNNAME')) ctx.trnnamei = input.fields['TRNNAME'] ?: ''
        if (input.fields.containsKey('TITLE01')) ctx.title01i = input.fields['TITLE01'] ?: ''
        if (input.fields.containsKey('CURDATE')) ctx.curdatei = input.fields['CURDATE'] ?: ''
        if (input.fields.containsKey('PGMNAME')) ctx.pgmnamei = input.fields['PGMNAME'] ?: ''
        if (input.fields.containsKey('TITLE02')) ctx.title02i = input.fields['TITLE02'] ?: ''
        if (input.fields.containsKey('CURTIME')) ctx.curtimei = input.fields['CURTIME'] ?: ''
        if (input.fields.containsKey('FNAME')) ctx.fnamei = input.fields['FNAME'] ?: ''
        if (input.fields.containsKey('LNAME')) ctx.lnamei = input.fields['LNAME'] ?: ''
        if (input.fields.containsKey('USERID')) ctx.useridi = input.fields['USERID'] ?: ''
        if (input.fields.containsKey('PASSWD')) ctx.passwdi = input.fields['PASSWD'] ?: ''
        if (input.fields.containsKey('USRTYPE')) ctx.usrtypei = input.fields['USRTYPE'] ?: ''
        if (input.fields.containsKey('ERRMSG')) ctx.errmsgi = input.fields['ERRMSG'] ?: ''
    }
}
