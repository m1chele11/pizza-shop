package edu.iu.habahram.pizzashop.model;

public class NYClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public NYClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
