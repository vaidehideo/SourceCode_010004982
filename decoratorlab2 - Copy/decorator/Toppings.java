package decorator;

public class Toppings extends Decorator {

	private double addedState;
	private String[] toppingsChoice;

    public Toppings( priceComponent c, String[] arrayToppings)
    {
        super( c ) ;
        toppingsChoice = arrayToppings;
    }

    public double operation()
    {
        addedState = super.operation() ;
        return addedBehavior( addedState ) ;
    }

	private double addedBehavior(double in) {
	    double extraPrice = 0;
	    if (toppingsChoice.length > 4)
	        extraPrice = (toppingsChoice.length - 4) * 0.75;
		return addedState + extraPrice ;
	}

}
