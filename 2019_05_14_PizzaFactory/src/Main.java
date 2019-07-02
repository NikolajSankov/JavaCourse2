public class Main {
	public static void main(String[] args) {
		PizzaFactory factory = new PizzaFactory();
		
		
		Pizza pizza = factory.createPizza(PizzaType2.PIZZA_SALAMI);
		Pizza pizza1 = factory.createPizza(PizzaType2.PIZZA_HAWAII);
		Pizza pizza2 = factory.createPizza(PizzaType2.PIZZA_MOZARELLA);
		
		pizza.orderPizza();
		pizza1.orderPizza();
		pizza2.orderPizza();
		
		
		PizzaType2[] values = PizzaType2.values();
		for(PizzaType2 t:values) {
			System.out.println(t);
		}
		
		PizzaType2 pizza_salami =PizzaType2.valueOf("PIZZA_Diablo");
	}
}
