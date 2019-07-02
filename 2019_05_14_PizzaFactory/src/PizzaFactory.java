public class PizzaFactory {		
	
	public Pizza createPizza(PizzaType2 type) {
		
		switch(type) {
		case PIZZA_SALAMI: return new PizzaSalami();
		case PIZZA_HAWAII: return new PizzaHawaii();
		case PIZZA_MOZARELLA: return new PizzaMozarella();
		default: return null;
		
		
		
		
		}
		
	}
}
