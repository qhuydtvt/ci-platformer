package bases.actions;

import bases.GameObject;

/**
 * Created by huynq on 8/26/17.
 */
public class ActionRepeatForever implements Action {

    private Action action;

    public ActionRepeatForever(Action action) {
        this.action = action;
    }

    @Override
    public boolean run(GameObject owner) {
        if(action.run(owner)) {
            action.reset();
        }
        return false;
    }

    @Override
    public void reset() {
        action.reset();
    }
}
