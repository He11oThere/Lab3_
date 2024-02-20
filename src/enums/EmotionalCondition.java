package enums;

public enum EmotionalCondition {
    HAPPY("счастливый"), KIND("добрым"), JOYFULL("радостный"), FRIENDLY("приветливо"), SATISFIED("доволен"),

    SAD("расстроен"), CALM("спокойно");

    private String title;

    EmotionalCondition(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
