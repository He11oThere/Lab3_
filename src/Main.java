import actor.Actor;
import actor.ShortiesContainer;
import actor.Shorty;
import additionalElements.Food;
import additionalElements.Furniture;
import enums.EmotionalCondition;
import enums.HungerState;
import enums.TimePoint;

public class Main {
    public static void main(String[] args) {
        ShortiesContainer container = new ShortiesContainer("коротышки", "приветливые лица");
        Actor neznaika = new Actor("Незнайка", EmotionalCondition.CALM, HungerState.NEUTRAL);
        container.createShorty();
        container.createShorty(); // добавление двух коротышек в контейнер
        Shorty darkShorty = new Shorty("коротышка", "черненький");
        Shorty waiter = new Shorty("Официант", "в черном костюме");
        Furniture table = new Furniture("стол");

        Food soup = new Food("суп", 1);
        Food pasta = new Food(" макароны с сыром", 1);
        Food cabbageRolls = new Food("голубцы", 2);
        Food coffee = new Food("чашечка кофе", 1);
        Food iceCream = new Food("Клубничным мороженным", 1);
        Food dinner = new Food("ужин", 1);

        neznaika.see(null);
        container.allEat(dinner, " ели ");
        neznaika.remember();
        System.out.print(TimePoint.LONG_AGO.getPoint());
        neznaika.hungerLevel(HungerState.HUNGRY);
        System.out.println("");

        neznaika.think();
        System.out.print(" и ");
        neznaika.sit(table);
        System.out.print(TimePoint.RIGHT_NOW.getPoint());
        waiter.jump(neznaika);
        waiter.ask(" Что желаете покушать?");

        System.out.print(neznaika.getName());
        neznaika.eat(soup, " съел ");
        System.out.print(TimePoint.AFTER.getPoint() + " ");
        neznaika.ask();

        neznaika.eat(pasta, "");
        System.out.print("\n" + TimePoint.THEN.getPoint());
        System.out.print(neznaika.getName());
        neznaika.eat(cabbageRolls, " cъел ");
        System.out.print(", ");
        neznaika.drink(coffee);
        System.out.print(", ");
        neznaika.eat(iceCream, "закусил ");
        System.out.println("");
        neznaika.evaluate(" понравилась", " еда");
//        System.out.print(neznaika.getName() + " " + neznaika.getHungerState()); // заменил на один метод
        neznaika.printHungerState();
//         System.out.print(neznaika.getHungerState());
//         neznaika.hungerLevel(HungerState.FULL);  // исправил реализацию и добавил в метод
        System.out.print(", поэтому ");
        neznaika.emotion(EmotionalCondition.HAPPY);
        System.out.print(" и ");
        neznaika.emotion(EmotionalCondition.KIND);
        System.out.println("");
        neznaika.emotion(EmotionalCondition.HAPPY);
        System.out.print(", поэтому ");
        neznaika.want();
        neznaika.sing();
        System.out.print(" или ");
        neznaika.toDo(" сделать что-то приятное");
        neznaika.sit(table);
        neznaika.listen("музыку");
        System.out.print(" и ");
        neznaika.lookAt("танцующих");
        System.out.print(", и ");
        neznaika.lookAt(container.getWhoIn());
        System.out.print(", которые");
        container.allSit(table);
        container.allTalk("между собой");
        System.out.print(" и");
        container.allLaugth();
        container.allAppearanceDescription();
        waiter.setName("коротышка");
        waiter.setAppearance("черненький");
        System.out.print(waiter.getAppearance() + " ");
        System.out.print(waiter.getName());
        System.out.print(", который ");
        waiter.carry(" еду ", neznaika);
        waiter.glanceAt(neznaika, EmotionalCondition.FRIENDLY);
    }
}