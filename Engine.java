
public class Engine {
    
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    public double getFuelLevel(){
        return this.currentFuelLevel;

    }

    public double getMaxFuelLevel(){
        return this.maxFuelLevel;

    }

    public FuelType getFuelType(){
        return this.f;


    }


/**
 * Creating a new engine
 * @param f 
 * @param fuel
 */
public Engine (FuelType f, double fuel){
    this.f=f;
    this.currentFuelLevel=fuel;
    this.maxFuelLevel=fuel;

}

public void refuel(){
    this.currentFuelLevel=this.maxFuelLevel;
}

public void go(){
    if(this.currentFuelLevel > 0){
        this.currentFuelLevel-=5;
        System.out.println("remaining fuel level " + this.currentFuelLevel);
    }
    else{
        throw new RuntimeException(" OUT OF FUEL!!! ");

    }
}


public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    try {
        while (true) {
            myEngine.go();
        }
    } catch (Exception e) {
        System.err.println(e.getMessage()); // Out of fuel
    }
}
}