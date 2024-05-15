// Concrete topping decorator class
public class Mushroom extends ToppingDecorator {
    Pizza pizza;

    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }

    public double cost() {
        return pizza.cost() + 1.00;
    }
}
