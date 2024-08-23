package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getAreaLiving() {
        return area;
    }

    public double getBalconyArea() {
        return balconyArea;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public double getArea() {
        return getAreaLiving() + getBalconyArea();
    }

    @Override
    public int compareTo(Home anotherHome) {
        if (this.getArea() == anotherHome.getArea()) {
            return 0;
        }
        this.getArea() > anotherHome.getArea() ? return 1 : return -1;
    }

    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + getFloor() + " этаже";
    }

}
// END
