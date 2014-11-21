package decorator;

public class Cheese extends Decorator {

    private double addedState;
    private String[] cheeseChoice;

    public Cheese( priceComponent c, String[] arrayCheese)
    {
        super( c ) ;
        cheeseChoice = arrayCheese;
    }

    public double operation()
    {
        addedState = super.operation() ;
        return addedBehavior( addedState ) ;
    }

    private double addedBehavior(double in) {
        double extraPrice = 0;
        if(cheeseChoice.length > 1)
            extraPrice = (cheeseChoice.length - 1);
        return addedState + extraPrice ;
    }

}
