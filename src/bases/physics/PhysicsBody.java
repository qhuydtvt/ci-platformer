package bases.physics;

/**
 * Created by huynq on 8/12/17.
 */
public interface PhysicsBody {
    BoxCollider getBoxCollider();
    boolean isActive();
}
