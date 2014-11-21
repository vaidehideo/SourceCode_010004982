package decorator;

public class BuildOrder {

    private static String[] arrayBurger, arraySauce, arrayPremium, arrayToppings, arrayCheese;
    
    //Composite
    public static Component getOrder()
    {
        Composite myorder = new Composite( "Order" , 0) ;
        myorder.addChild(new Leaf("\nCrispy Onion Strings", 5.50 ));
        myorder.addChild(new Leaf("The Purist", 8.00 ));
        
        priceComponent burgerObj = getPrice();
        Composite customBurger = new Composite("Build Your Own Burger", burgerObj.operation()) ;
         customBurger.addChild(new Leaf(arrayBurger));
         customBurger.addChild(new Leaf(arrayCheese));
         customBurger.addChild(new Leaf(arrayToppings));
         customBurger.addChild(new Leaf(arrayPremium));
         customBurger.addChild(new Leaf(arraySauce));
         myorder.addChild( customBurger );
        return myorder ;
    }
    
    //Decorator
    public static priceComponent getPrice()
     {
         arrayBurger = new String[] {"Beef", "1/3 lb", "on a Bun"};
         arraySauce = new String[] {"Appricot Sauce"};
         arrayPremium = new String[] {"Applewood Smoked Bacon"};
         arrayToppings = new String[] {"Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw"};
         arrayCheese = new String[] {"Danish Blue Cheese", "Horseradish Cheddar"};
         priceComponent obj = new Cheese( new Toppings(new Premium(new Sauce(new Burger(arrayBurger), arraySauce), arrayPremium), arrayToppings), arrayCheese) ;
         return obj;
     }
}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/