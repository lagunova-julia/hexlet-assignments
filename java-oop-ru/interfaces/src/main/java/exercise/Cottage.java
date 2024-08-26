package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    @Override
    public double getArea() {
        return area;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public String toString() {
        return getFloorCount() + " этажный коттедж площадью " + getArea() + " метров";
    }

    @Override
    public int compareTo(Home anotherHome) {
        if (this.getArea() == anotherHome.getArea()) {
            return 0;
        }
        int result = (this.getArea() > anotherHome.getArea()) ? 1 : -1;
        return result;
    }
}
// END
