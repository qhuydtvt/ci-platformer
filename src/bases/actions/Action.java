package bases.actions;

import bases.GameObject;

/**
 * Created by huynq on 8/26/17.
 */
public interface Action {
    boolean run(GameObject owner);
    void reset();
}
