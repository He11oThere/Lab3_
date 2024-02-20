package actor;

import additionalElements.Food;
import additionalElements.Furniture;
import enums.EmotionalCondition;
import enums.HungerState;
import interfaces.Eatable;
import interfaces.Sittable;

import java.util.Objects;
import java.util.Random;

public abstract class HumanBeing implements Sittable, Eatable {
    private String name;

    private String appearance;

    private EmotionalCondition emotion;

    private HungerState hungerState;

    public HumanBeing() {
        String[] possibleNames = {"Алиса", "Боб", "Чарли", "Давид", "Ева"};
        int randomIndex = new Random().nextInt(possibleNames.length);
        this.name = possibleNames[randomIndex];
    }

    public HumanBeing(String name, String appearance) {
        this.name = name;
        this.appearance = appearance;
    }

    public HumanBeing(String name, EmotionalCondition emotion, HungerState hungerState) {
        this.name = name;
        this.emotion = emotion;
        this.hungerState = hungerState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public EmotionalCondition getEmotionalCondition() {
        return emotion;
    }

    public void setEmotionalCondition(EmotionalCondition emotion) {
        this.emotion = emotion;
    }

    public HungerState getHungerState() {
        return hungerState;
    }

    public void setHungerState(HungerState hungerState) {
        this.hungerState = hungerState;
    }

    public void hungerLevel(HungerState hungerState) {
        setHungerState(hungerState);
        System.out.print(getHungerState());
    }

    public void printHungerState() {
        System.out.print(getName() + " " + getHungerState());
    }

    public void see(Object obj) {
        if (obj == null) {
            System.out.print(getName() + " увидел, что ");
        } else {
            System.out.println(getName() + " смотрит на " + obj);
        }
    }

    public void ask() {
        System.out.print(getName() + " попросил ");
    }

    public void ask(String question) {
        System.out.println(getName() + " спросил:" + question);
    }

    public void evaluate(String rate, String rateTarget) {
        if (rate == "понравилась" || rate == "понравилось" || rate == "понравился") {
            System.out.println(getName() + rate + rateTarget);
            setEmotionalCondition(EmotionalCondition.HAPPY);
        } else {
            System.out.println(getName() + rate + rateTarget);
            setEmotionalCondition(EmotionalCondition.SAD);
        }
    }

    public void think() {
        System.out.print(getName() + " подумал");
    }

    public void remember() {
        System.out.print(getName() + " вспомнил, что ");
    }

    public void want() {
        System.out.print(getName() + " захотел");
    }

    public void toDo(String action) {
        System.out.println(action);
    }

    public void drink(Food food) {
        System.out.print("выпил " + food.getFoodType());
    }

    public void emotion(EmotionalCondition emotionalCondition) {
        setEmotionalCondition(emotionalCondition);

        if (emotionalCondition == EmotionalCondition.KIND) {
            System.out.print(getEmotionalCondition());
        } else {
            System.out.print(getName() + " чувствует себя " + getEmotionalCondition());
        }
    }

    @Override
    public void sit(Furniture furniture) {
        System.out.println("Он " + "сел/сидит за " + furniture.getFurniture());
    }

    @Override
    public void eat(Food food, String action) {
        if (food.getCount() == 1) {
            System.out.print(action + food.getFoodType() + " ");
            if (getHungerState() != HungerState.FULL) {
                this.setHungerState(HungerState.FULL);
            } else {
                System.out.print("");
            }
        } else {
            System.out.print(action + food.getCount() + " порции " + food.getFoodType());
        }
    }

    @Override
    public String toString() {
        return "HumanBeing{" +
                "name='" + name + '\'' +
                ", appearance='" + appearance + '\'' +
                ", emotion=" + emotion +
                ", hungerState=" + hungerState +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanBeing that = (HumanBeing) o;
        return Objects.equals(name, that.name) && Objects.equals(appearance, that.appearance) && emotion == that.emotion && hungerState == that.hungerState;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, appearance, emotion, hungerState);
    }
}
