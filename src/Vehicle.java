public class Vehicle {

    private Integer numberOfWheels;
    private String color;
    protected Boolean itsOn;


    public Vehicle(Integer numberOfWheels, String color) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.itsOn = false;
    }

    public void turnOn(){
        if(!itsOn){
            itsOn = true;
            System.out.println("se prendio el vehiculo");
        }else{
            System.out.println("ya esta prendido");
        }
    }
}
