package actor;

import additionalElements.Food;
import additionalElements.Furniture;
import enums.EmotionalCondition;
import interfaces.Eatable;
import interfaces.Sittable;

public class Shorty extends Actor implements Eatable, Sittable {

    public Shorty() {
    }

    public Shorty(String name, String appearance) {
        super(name, appearance);
    }

    @Override
    public void sit(Furniture furniture) {
        System.out.println(" сидят за " + furniture.getFurniture());
    }

    @Override
    public void eat(Food food, String action) {
        System.out.println(getName() + action + food.getFoodType());
    }

    public void eat(Food food, String action, String who) {
        System.out.println(who + action + food.getFoodType());
    }

    public void talk(String activeSpeakers) {
        System.out.print(getName() + " разговаривал " + activeSpeakers);
    }

    public void talk(String activeSpeakers, String who) {
        System.out.print(who + " разговаривали " + activeSpeakers);
    }

    public void laugth() {
        System.out.println(" смеялись");
    }

    public void appearanceDescription() {
        System.out.println("У него были " + getAppearance());
    }

    public void appearanceDescription(boolean redactable, String parameter) {
        if (redactable) {
            System.out.println("У них были " + parameter);
        } else {
            appearanceDescription();
        }
    }

//    public void lookAt(String object) {
//        System.out.print(getName() + " смотрят на " + object);
//    }

    public void glanceAt(Actor person, EmotionalCondition emotion) {
        System.out.print(emotion + " поглядывал на " + person.getName());
    }

    public void lookAt(Actor person) {
        System.out.print(" поглядывали на  " + person.getName());
    }

    public void lookAt(Actor person, EmotionalCondition emotion) {
        System.out.print(emotion + " поглядывали на " + person.getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
