package edu.iu.habahram.pizzashop.model;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String Item) {
        PizzaFactory pizzaFactory = new NewyorkPizzaFactory();
        return pizzaFactory.createPizza(Item);
    }
}
