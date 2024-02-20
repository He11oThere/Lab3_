package additionalElements;

import java.util.Objects;

public class Furniture {
    private final String furniture;

    public Furniture(String furniture) {
        this.furniture = furniture;
    }

    public String getFurniture() {
        return furniture;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "furniture='" + furniture + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture1 = (Furniture) o;
        return Objects.equals(furniture, furniture1.furniture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(furniture);
    }
}
