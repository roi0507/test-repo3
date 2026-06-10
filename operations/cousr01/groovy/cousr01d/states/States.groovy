package cousr01d.states
import cousr01d.Context
import cousr01d.State
import cousr01d.ScreenHelpers
import io.ol.refactor.runtime.*

class ComputeMainPara implements State {
    @Override
    State step(Context ctx, ScreenPort screen) {
        State __r = cousr01d.Paragraphs.mainPara(ctx, screen)
        if (__r != null) return __r
        return null
    }
}

class ComputeProcessEnterKey implements State {
    @Override
    State step(Context ctx, ScreenPort screen) {
        State __r = cousr01d.Paragraphs.processEnterKey(ctx, screen)
        if (__r != null) return __r
        return null
    }
}

class ComputeReturnToPrevScreen implements State {
    @Override
    State step(Context ctx, ScreenPort screen) {
        State __r = cousr01d.Paragraphs.returnToPrevScreen(ctx, screen)
        if (__r != null) return __r
        return null
    }
}

class ShowCousr1a implements State {
    @Override
    State step(Context ctx, ScreenPort screen) {
        screen.write(ScreenHelpers.buildScreen_COUSR1A(ctx))
        return new WaitCousr1a()
    }
}

class WaitCousr1a implements State {
    @Override
    State step(Context ctx, ScreenPort screen) {
        def input = screen.read()
        ScreenHelpers.applyInput_COUSR1A(ctx, input)
        return new ComputeMainPara()
    }
}

class ComputePopulateHeaderInfo implements State {
    @Override
    State step(Context ctx, ScreenPort screen) {
        State __r = cousr01d.Paragraphs.populateHeaderInfo(ctx, screen)
        if (__r != null) return __r
        return null
    }
}

class ComputeInsertUserDb2Table implements State {
    @Override
    State step(Context ctx, ScreenPort screen) {
        State __r = cousr01d.Paragraphs.insertUserDb2Table(ctx, screen)
        if (__r != null) return __r
        return null
    }
}

class ComputeClearCurrentScreen implements State {
    @Override
    State step(Context ctx, ScreenPort screen) {
        State __r = cousr01d.Paragraphs.clearCurrentScreen(ctx, screen)
        if (__r != null) return __r
        return null
    }
}

class ComputeInitializeAllFields implements State {
    @Override
    State step(Context ctx, ScreenPort screen) {
        State __r = cousr01d.Paragraphs.initializeAllFields(ctx, screen)
        if (__r != null) return __r
        return null
    }
}
