package game;

import bases.GameObject;
import bases.physics.BoxCollider;
import bases.physics.PhysicsBody;
import bases.renderers.ImageRenderer;

/**
 * Created by huynq on 8/30/17.
 */
public class Platform extends GameObject implements PhysicsBody {

    private BoxCollider boxCollider;
    public Platform() {
        super();
        this.renderer = ImageRenderer.create("assets/images/yellow_square.jpg");
        this.boxCollider = new BoxCollider(30, 30);
        this.children.add(boxCollider);
    }

    @Override
    public BoxCollider getBoxCollider() {
        return boxCollider;
    }
}
