package Actor;

import AdditionalElements.Food;
import AdditionalElements.Furniture;
import Enums.EmotionalCondition;

import java.util.List;
import java.util.ArrayList;


public class ShortiesContainer {
    private List<Shorty> shortiesList;
    private String whoIn;
    private String personsDescription;

    public ShortiesContainer(String whoIn, String personsDescription) {
        this.whoIn = whoIn;
        this.personsDescription = personsDescription;
        this.shortiesList = new ArrayList<>();
    }

    public String getWhoIn() {
        return whoIn;
    }

    public String getPersonsDescription() {
        return personsDescription;
    }

    public Shorty createShorty(String name, String appearance) {
        Shorty shorty = new Shorty(name, appearance);
        shortiesList.add(shorty);
        return shorty;
    }

    public Shorty createShorty() {
        Shorty shorty = new Shorty();
        shortiesList.add(shorty);
        return shorty;
    }

    public void allTalk(String activeSpeakers) {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            shortiesList.get(0).talk(activeSpeakers, getWhoIn());
//            someShorty.talk(activeSpeakers);
        } else {
            System.out.println("Недостаточно коротышек");
        }
    }

    public void allLaugth() {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            someShorty.laugth();
        } else {
            System.out.println("Недостаточно коротышек");
        }
    }

    public void allAppearanceDescription() {
        if (shortiesList.size() > 1) {
//            Shorty someShorty = shortiesList.get(0);
            shortiesList.get(0).appearanceDescription(true, getPersonsDescription());
        } else {
            System.out.println("Недостаточно коротышек");
        }
    }

    public void allLookAt(Actor person, EmotionalCondition emotion) {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            someShorty.lookAt(person, emotion);
        } else {
            System.out.println("Недостаточно коротышек");
        }
    }

    public void allLookAt(Actor person) {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            someShorty.lookAt(person);
        } else {
            System.out.println("Недостаточно коротышек");
        }
    }

    public void allLookAt(String object) {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            someShorty.lookAt(object);
        } else {
            System.out.println("Недостаточно коротышек");
        }
    }

    public void allEat(Food food, String action) {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            someShorty.eat(food, action, getWhoIn());
        } else {
            System.out.println("Недостаточно коротышек");
        }
    }

    public void allSit(Furniture furniture) {
        if (shortiesList.size() > 1) {
            Shorty someShorty = shortiesList.get(0);
            someShorty.sit(furniture);
        } else {
            System.out.println("Недостаточно коротышек");
        }
    }

}