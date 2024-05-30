package pattern;

public class Builder {

    //burger builder
    private boolean hasCheese;
    private boolean hasLettuce;
    private boolean hasTomato;
    private boolean hasOnion;
    private boolean hasPickles;
    private boolean hasKetchup;
    private Builder burger;

    public Builder() {
        this.burger = new Builder();
    }

    public static void main(String[] args) {
        var burger = new Builder().addCheese().addLettuce().addTomato().addOnion().addPickels().getBurger();

    }

    public Builder getBurger() {
        return burger;
    }

    public Builder addCheese() {
        this.burger.setHasCheese(true);
        return this;
    }

    public Builder addLettuce() {
        this.burger.setHasLettuce(true);
        return this;
    }

    public Builder addKetchup() {
        this.burger.setHasKetchup(true);
        return this;
    }

    public Builder addTomato() {
        this.burger.setHasTomato(true);
        return this;
    }

    public Builder addOnion() {
        this.burger.setHasOnion(true);
        return this;
    }

    public Builder addPickels() {
        this.burger.setHasPickles(true);
        return this;
    }


    public boolean isHasCheese() {
        return hasCheese;
    }

    public void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
    }

    public boolean isHasLettuce() {
        return hasLettuce;
    }

    public void setHasLettuce(boolean hasLettuce) {
        this.hasLettuce = hasLettuce;
    }

    public boolean isHasTomato() {
        return hasTomato;
    }

    public void setHasTomato(boolean hasTomato) {
        this.hasTomato = hasTomato;
    }

    public boolean isHasOnion() {
        return hasOnion;
    }

    public void setHasOnion(boolean hasOnion) {
        this.hasOnion = hasOnion;
    }

    public boolean isHasPickles() {
        return hasPickles;
    }

    public void setHasPickles(boolean hasPickles) {
        this.hasPickles = hasPickles;
    }

    public boolean isHasKetchup() {
        return hasKetchup;
    }

    public void setHasKetchup(boolean hasKetchup) {
        this.hasKetchup = hasKetchup;
    }
}
