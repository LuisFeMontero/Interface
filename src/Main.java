//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Helicopter helicopter = new Helicopter(0,"Green");

        helicopter.turnOn();
        helicopter.fly();

        Bird bird = new Bird();

        bird.fly();

        Flyable flyable = bird;
        //Ejemplo de colección


    }
}