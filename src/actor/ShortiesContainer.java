package actor;

import additionalElements.Food;
import additionalElements.Furniture;
import enums.EmotionalCondition;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;


public class ShortiesContainer {
    private List<Shorty> shortiesList;
    private String whoIn;
    private String personsDescription;

    public ShortiesContainer(String whoIn, String personsDescription) {
        this.whoIn = whoIn;
        this.personsDescription = personsDescription;
        this.shortiesList = new ArrayList<>();
    }

    public List<Shorty> getShortiesList() {
        return shortiesList;
    }

    public void setShortiesList(List<Shorty> shortiesList) {
        this.shortiesList = shortiesList;
    }

    public String getWhoIn() {
        return whoIn;
    }

    public void setWhoIn(String whoIn) {
        this.whoIn = whoIn;
    }

    public String getPersonsDescription() {
        return personsDescription;
    }

    public void setPersonsDescription(String personsDescription) {
        this.personsDescription = personsDescription;
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

    @Override
    public String toString() {
        return "ShortiesContainer{" +
                "shortiesList=" + shortiesList +
                ", whoIn='" + whoIn + '\'' +
                ", personsDescription='" + personsDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortiesContainer that = (ShortiesContainer) o;
        return Objects.equals(shortiesList, that.shortiesList) && Objects.equals(whoIn, that.whoIn) && Objects.equals(personsDescription, that.personsDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortiesList, whoIn, personsDescription);
    }
}