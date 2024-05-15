// Concrete topping decorator class
public class Pepperoni extends ToppingDecorator {
    Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    public double cost() {
        return pizza.cost() + 1.50;
    }
}
