package decorator;

public class Burger extends Decorator {
    
    private String[] burgerChoice;
    private double basePrice;
    
    public Burger(String[] arrayBurger){
        burgerChoice = arrayBurger;
        basePrice = 0;
    }

    public double operation() {
        for (String myburger: burgerChoice )
        {
            if(myburger.toLowerCase().contains("organic bison"))
                basePrice = basePrice + 4;
            if(myburger.toLowerCase().contains("ahi tuna"))
                basePrice = basePrice + 4;
            if(myburger.toLowerCase().contains("1/3 lb"))
                basePrice = basePrice + 9.50;
            if(myburger.toLowerCase().contains("1/2 lb"))
                basePrice = basePrice + 11.50;
            if(myburger.toLowerCase().contains("1 lb"))
                basePrice = basePrice + 15.50;
            if(myburger.toLowerCase().contains("bowl"))
                basePrice = basePrice + 1;
        }
        return basePrice;
    }
}
