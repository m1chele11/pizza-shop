package edu.iu.habahram.pizzashop.model;

public class NewyorkPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = (PizzaIngredientFactory) new NYPizzaIngrediantFactory();

        if (item.equals("cheese")) {

            pizza = new NYCheesePizza(ingredientFactory);
            pizza.setName("NY Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY Style Pepperoni Pizza");

        }
        return pizza;
    }
}
