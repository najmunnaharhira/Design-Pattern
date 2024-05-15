// Main class to test Pizza Topping Problem
public class Main {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza();
        System.out.println("Description: " + cheesePizza.getDescription());
        System.out.println("Cost: $" + cheesePizza.cost());

        Pizza pepperoniPizza = new Pepperoni(new CheesePizza());
        System.out.println("Description: " + pepperoniPizza.getDescription());
        System.out.println("Cost: $" + pepperoniPizza.cost());

        Pizza mushroomPizza = new Mushroom(new CheesePizza());
        System.out.println("Description: " + mushroomPizza.getDescription());
        System.out.println("Cost: $" + mushroomPizza.cost());

        Pizza deluxePizza = new Mushroom(new Pepperoni(new CheesePizza()));
        System.out.println("Description: " + deluxePizza.getDescription());
        System.out.println("Cost: $" + deluxePizza.cost());
    }
}
