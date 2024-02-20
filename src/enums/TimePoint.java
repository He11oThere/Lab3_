package enums;

public enum TimePoint {
    LONG_AGO("давно "),
    RIGHT_NOW("Cейчас же "),
    AFTER("после чего"),
    THEN("Потом ");

    private String point;

    TimePoint(String point) {
        this.point = point;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return point;
    }
}
