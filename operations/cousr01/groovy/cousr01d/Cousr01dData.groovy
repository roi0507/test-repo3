package cousr01d
import io.ol.refactor.runtime.*

class Cousr01dData {
    static int insertUsersec(Context ctx, Map<String, Object> params = [:]) {
        int count = ctx.data.execute('cousr01d.insertUsersec', params)
        ctx.sqlcode = ctx.data.sqlcode
        DbSupport.reportSqlFailure(ctx, ctx.data, ctx.sqlcode, 'EXECUTE')
        return count
    }

    static void commitOperation(Context ctx) {
        ctx.data.commit()
        ctx.sqlcode = ctx.data.sqlcode
        DbSupport.reportSqlFailure(ctx, ctx.data, ctx.sqlcode, 'COMMIT')
    }

    static void rollbackOperation(Context ctx) {
        ctx.data.rollback()
        ctx.sqlcode = ctx.data.sqlcode
        DbSupport.reportSqlFailure(ctx, ctx.data, ctx.sqlcode, 'ROLLBACK')
    }

    static void rollbackOperation2(Context ctx) {
        ctx.data.rollback()
        ctx.sqlcode = ctx.data.sqlcode
        DbSupport.reportSqlFailure(ctx, ctx.data, ctx.sqlcode, 'ROLLBACK')
    }

    static void rollbackOperation3(Context ctx) {
        ctx.data.rollback()
        ctx.sqlcode = ctx.data.sqlcode
        DbSupport.reportSqlFailure(ctx, ctx.data, ctx.sqlcode, 'ROLLBACK')
    }

}
