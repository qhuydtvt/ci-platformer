package bases.actions;

import bases.FrameCounter;
import bases.GameObject;

/**
 * Created by huynq on 8/26/17.
 */
public class WaitAction implements Action {
    private FrameCounter frameCounter;

    public WaitAction(int frameDelay) {
        frameCounter = new FrameCounter(frameDelay);
    }

    @Override
    public boolean run(GameObject owner) {
        return frameCounter.run();
    }

    @Override
    public void reset() {
        frameCounter.reset();
    }
}
