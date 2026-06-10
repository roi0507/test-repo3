package cousr01d
import cousr01d.states.ComputeMainPara
import io.ol.refactor.runtime.*

class Cousr01d {
    void run(Context ctx, ScreenPort screen) {
        State state = (State) new ComputeMainPara()
        int steps = 0
        while (state != null && ctx.xctlTo == null && steps++ < 500) {
            state = state.step(ctx, screen)
        }
    }
}
