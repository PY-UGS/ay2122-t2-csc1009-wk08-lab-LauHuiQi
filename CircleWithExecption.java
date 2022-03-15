import java.lang.Math;

public class CircleWithExecption {
    private float radius;

    public CircleWithExecption() {
    }

    public CircleWithExecption(float radius) throws Exception {
        if (radius <= 0) {
            throw new IllegalArgumentException("Illegal Argument Exception");
        }
        this.radius = radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public float getDiameter() {
        return (float) (2 * Math.PI * this.radius);
    }

    public float getArea() throws Exception {
        float area = (float) (Math.PI * Math.PI * this.radius);
        if (area > 1000) {
            throw new Exception("Area bigger than 1000");
        }
        return area;
    }

}
