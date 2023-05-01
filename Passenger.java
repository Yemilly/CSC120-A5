public class Passenger {
    
    private String name;

    /**  creates new passanger
     * @param name
     */
    public Passenger(String name) {
        this.name = name;

    }

    /** returns passengers name
     * @return name
     */
    public String getName(){
        return this.name;

    }


    /** moves the passenger to a car
     * @param c
     */
    public void boardCar(Car c){
        try{c.addPassenger(this);
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    /** removes passenger from car 
     * @param c
     */
    public void getOffCar(Car c){
        try{c.removePassenger(this);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Passenger p2Passenger= new Passenger("person");
        Passenger p3Passenger= new Passenger("student");
        Car c = new Car(10);
        p2Passenger.boardCar(c);
        p3Passenger.boardCar(c);
        System.out.println(p2Passenger.getName());
        c.printManifest();
        p2Passenger.getOffCar(c);
        c.printManifest();

        
    }

}
