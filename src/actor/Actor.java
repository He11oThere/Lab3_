package actor;

import additionalElements.Food;
import additionalElements.Furniture;
import enums.EmotionalCondition;
import enums.HungerState;
import interfaces.Eatable;
import interfaces.Sittable;

import java.util.Objects;
import java.util.Random;

public class Actor extends HumanBeing{

    public Actor() {
    }

    public Actor(String name, String appearance) {
        super(name, appearance);
    }

    public Actor(String name, EmotionalCondition emotion, HungerState hungerState) {
        super(name, emotion, hungerState);
    }

    public void lookAt(String object) {
        System.out.print(getName() + " смотрит на " + object);
    }

    public void lookAt(Actor person) {
        System.out.print(getName() + " смотрит на " + person.getName());
    }

    public void jump(Actor person) {
        System.out.println(getName() + " " + getAppearance() + " подскочил к " + person.getName());
    }

    public void listen(String noise) {
        System.out.print(getName() + " слушает " + noise);
    }

    public void sing() {
        System.out.print(" петь");
    }

    public void carry(String carryObject, Actor person) {
        System.out.print("носил " + person.getName() + carryObject);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
