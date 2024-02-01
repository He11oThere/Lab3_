package Actor;

import AdditionalElements.Food;
import AdditionalElements.Furniture;
import Enums.EmotionalCondition;
import Enums.HungerState;
import Interfaces.Eatable;
import Interfaces.Sittable;

import java.util.Objects;
import java.util.Random;

public class Actor implements Eatable, Sittable {
    private String name;

    private String appearance;

    private EmotionalCondition emotion;

    private HungerState hungerState;

    public Actor() {
        String[] possibleNames = {"Алиса", "Боб", "Чарли", "Давид", "Ева"};
        int randomIndex = new Random().nextInt(possibleNames.length);
        this.name = possibleNames[randomIndex];
    }

    public Actor(String name, String appearance) {
        this.name = name;
        this.appearance = appearance;
    }

    public Actor(String name, EmotionalCondition emotion, HungerState hungerState) {
        this.name = name;
        this.emotion = emotion;
        this.hungerState = hungerState;
    }

    public String getName() {
        return name;
    }

    public String getAppearance() {
        return appearance;
    }

    public EmotionalCondition getEmotionalCondition() {
        return emotion;
    }

    public void setEmotionalCondition(EmotionalCondition emotion) {
        this.emotion = emotion;
    }

    public void emotion(EmotionalCondition emotionalCondition) {
        setEmotionalCondition(emotionalCondition);

        if (emotionalCondition == EmotionalCondition.KIND) {
            System.out.print(getEmotionalCondition());
        } else {
            System.out.print(getName() + " чувствует себя " + getEmotionalCondition());
        }
    }

    public void hungerLevel(HungerState hungerState) {
        setHungerState(hungerState);
        System.out.print(getHungerState());
    }

    public HungerState getHungerState() {
        return hungerState;
    }

    public void setHungerState(HungerState hungerState) {
        this.hungerState = hungerState;
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
    public void sit(Furniture furniture) {
        System.out.println("Он " + "сел/сидит за " + furniture.getFurniture());
    }

    public void interaction(String object) {
        if ("No Object".equals(object)) {
            System.out.print(getName() + " увидел, что ");
        } else {
            System.out.println(getName() + " смотрит на " + object);
        }
    }

    public void ask() {
        System.out.print(getName() + " попросил ");
    }

    public void drink(Food food) {
        System.out.print("выпил " + food.getFoodType());
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

    public void jump(Actor person) {
        System.out.println(getName() + getAppearance() + " подскочил к " + person.getName());
    }

    public void ask(String question) {
        System.out.println(getName() + " спросил:" + question);
    }

    public void listen(String noise) {
        System.out.print(getName() + " слушает " + noise);
    }

    public void lookAt(String object) {
        System.out.print(getName() + " смотрит на " + object);
    }

    public void lookAt(Actor person) {
        System.out.print(getName() + " смотрит на " + person.getName());
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

    public void sing() {
        System.out.print(" петь");
    }

    public void carry(String carryObject, Actor person) {
        System.out.print("носил " + person.getName() + carryObject);
    }

    public void toDo(String action) {
        System.out.println(action);
    }

    @Override
    public String toString() {
        return "Actor{" +
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
        Actor actor = (Actor) o;
        return Objects.equals(name, actor.name) && Objects.equals(appearance, actor.appearance) && emotion == actor.emotion && hungerState == actor.hungerState;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, appearance, emotion, hungerState);
    }
}
