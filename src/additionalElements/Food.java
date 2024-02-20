package additionalElements;

import java.util.Objects;

public class Food {
    private String foodType;

    private int count;

    public Food(String foodType, int count){
        this.foodType = foodType;
        this.count = count;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getCount() {
        return count;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodType='" + foodType + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return count == food.count && Objects.equals(foodType, food.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodType, count);
    }
}
