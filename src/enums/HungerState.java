package enums;

public enum HungerState {
    HUNGRY("голоден"), FULL("сытый"), NEUTRAL("не голоден");

    private String state;

    HungerState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return state;
    }
}
