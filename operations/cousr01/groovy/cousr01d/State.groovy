package cousr01d
import io.ol.refactor.runtime.ScreenPort
trait State {
    abstract State step(Context ctx, ScreenPort screen)
}
