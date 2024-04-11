public class Point3D extends Point2D{
    float z =0.0f;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{getX(),getY(),getZ()};
    }
    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
