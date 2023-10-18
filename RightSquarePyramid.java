public class RightSquarePyramid {
    private double baseLength;
    private double altitude;

    public RightSquarePyramid() {
        baseLength = 1.0;
        altitude = 1.0;
    }

    public RightSquarePyramid(double b, double h) {
        baseLength = b;
        altitude = h;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double b) {
        baseLength = b;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double h) {
        altitude = h;
    }

    public double getSlantLength() {
        return (); // Put your calculation for slant length using the baseLength and altitude variables inside of the parentheses.
    }

    public double getVolume() {
        return (); // Put your calculation for volume using the baseLength and altitude variables inside of the parentheses.
    }

    public double getSurfaceArea() {
        return (); // Put your calculation for surface area using the baseLength and altitude variables and the getSlantLength method inside of the parentheses.
    }
}
