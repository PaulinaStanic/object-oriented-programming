package ar.com.ada.online.second.ExerciseEighteen;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal perro = new Animal();
        Person personal = new Person();
        Vehicle bici = new Vehicle();

        perro.breed = "Shih Tzu";
        perro.color = "Blanco y marrón";
        perro.name = "Felipe";

        personal.age = 25;
        personal.name = "Paulina";
        personal.lastName = "Stanic";

        bici.brand = "Venzo";
        bici.color = "negra";
        bici.maxSpeed = 40;

        perro.sleep();
        personal.play();
        vehicle.brake();
    }
}
