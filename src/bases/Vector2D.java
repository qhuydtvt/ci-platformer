package bases;

/**
 * Created by huynq on 8/2/17.
 */
public class Vector2D {
    public static final Vector2D ZERO = new Vector2D(0, 0);
    public static final Vector2D ONE = new Vector2D(1, 1);

    public static final Vector2D DOWN = new Vector2D(0, 1);

    public float x;
    public float y;

    public Vector2D() {
        this(0, 0);
    }

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void addUp(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    public void set(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void set(Vector2D other) {
        set(other.x, other.y);
    }

    public void addUp(Vector2D other) {
        addUp(other.x, other.y);
    }

    public void subtractBy(float dx, float dy) {
        this.x -= dx;
        this.y -= dy;
    }

    public Vector2D subtract(float dx, float dy) {
        return new Vector2D(x - dx, y - dy);
    }

    public Vector2D subtract(Vector2D other) {
        return subtract(other.x, other.y);
    }

    public void subtractBy(Vector2D other) {
        subtractBy(other.x, other.y);
    }

    public Vector2D add(float dx, float dy) {
        return new Vector2D(this.x + dx, this.y + dy);
    }

    public Vector2D add(Vector2D other) {
        return add(other.x, other.y);
    }

    public Vector2D multiply(float f) {
        return new Vector2D(this.x * f, this.y * f);
    }

    public float magnitude() {
        return (float)Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Vector2D rotate(float degree) {
        double rad = Math.toRadians(degree);
        double sinRad = Math.sin(rad);
        double cosRad = Math.cos(rad);
        return new Vector2D(
                (float)(cosRad * x - sinRad * y),
                (float)(sinRad * x + cosRad * y)
        );
    }

    public Vector2D normalize() {
        float mag = magnitude();
        return new Vector2D(this.x / mag, this.y / mag);
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
