package decorator;

public class Sauce extends Decorator {

    private double addedState;
    private String[] sauceChoice;

    public Sauce( priceComponent c, String[] arraySauce)
    {
       super( c ) ;
       sauceChoice = arraySauce;
    }

    public double operation()
    {
       addedState = super.operation() ;
       return addedBehavior( addedState ) ;
    }

    private double addedBehavior(double in) {
        double extraPrice =0;
        if(sauceChoice.length > 1)
            extraPrice = (sauceChoice.length - 1) * 0.75;
        return addedState + extraPrice ;
    }
    
}
