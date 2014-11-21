package decorator;

public abstract class Decorator extends Leaf implements priceComponent {

	private priceComponent component;
	
    public Decorator( priceComponent c )
    {
          component = c ;
    }
    
    public Decorator()
    {
    }
    
    public Decorator(String[] temp)
    {
    }

	public double operation()
    {
        return component.operation() ;
        //return 0;
    }
    
     public void printDescription() {
        // no implementation
    }

    public void addChild(priceComponent c) {
	    // no implementation
	}

	public void removeChild(priceComponent c) {
        // no implementation
	}

	public Component getChild(int i) {
        // no implementation
        return null ;
	}

}
