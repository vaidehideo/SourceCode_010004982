package decorator;

import java.text.DecimalFormat;


public class Leaf implements Component {

    private String description ;
    private double price ;
    private String[] chosenList;

    public Leaf ( String d, double p )
    {
        description = d ;
        price = p ;
    }
    
    public Leaf()
    {
    }
    
    public Leaf( String[] list)
    {
        chosenList = list;
    }
    
    public void printDescription() {
        if(price != 0)
        {
            DecimalFormat fmt = new DecimalFormat("0.00");
            System.out.println( description + " " + fmt.format(price) ) ;
        }
        else
        {
            int i;
            System.out.print("\n");
            for (i=0; i< chosenList.length -1 ; i++ )
                 System.out.print(chosenList[i] + " + ");
                 System.out.print(chosenList[i]);         
        }
    }

    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }
    
}
 
