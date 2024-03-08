package edu.iu.habahram.pizzashop.model;

public class NYVeggiePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public NYVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
