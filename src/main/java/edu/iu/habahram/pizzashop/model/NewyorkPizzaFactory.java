package edu.iu.habahram.pizzashop.model;

public class NewyorkPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngrediantFactory();

        if (item.equals("cheese")) {

            pizza = new NYCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;
    }
}
