package decorator;

public class Premium extends Decorator {

	private double addedState;
	private String[] premiumChoice;

    public Premium( priceComponent c, String[] arrayPremium)
    {
        super( c ) ;
        premiumChoice = arrayPremium;
    }

    public double operation()
    {
        addedState = super.operation() ;
        return addedBehavior( addedState ) ;
    }

	private double addedBehavior(double in) {
		double extraPrice = (premiumChoice.length * 1.50);
	    return addedState + extraPrice ;
	}
	
}
