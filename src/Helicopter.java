public class Helicopter extends Vehicle implements Flyable{

    public Helicopter(Integer numberOfWheels, String color) {
        super(numberOfWheels, color);
    }

    @Override
    public void fly() {
        if (itsOn){
            System.out.println("estamos tomando altura");
        }
    }
}
