package decorator;

import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList<Component> components = new ArrayList<Component>()  ;
    private String description ;
    private double burgerPrice;
    
    public Composite ( String d, double price )
    {
        description = d ;
        burgerPrice = price;
    }
    
    public Composite()
    {
    }

    public void printDescription() {
        if(burgerPrice == 0)
            System.out.print( description );
        else
            System.out.print( description + " " + burgerPrice);
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }

    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
     
}
 
