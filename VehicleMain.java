
import java.util.HashMap;

interface Describable {
    void descrive();    
}

class Vehicle implements Describable{
    String name;
    int speed;
    Vehicle(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void descrive(){
        System.out.println(this.name + ":" + this.speed + "km/h");
    }
}

class Car extends Vehicle{
    Car(String name, int speed){
        super(name, speed);
    }
     public void descrive(){
        System.out.println("🚗 " + this.name + ":" + this.speed + "km/h");
    }   
}

class Bike extends Vehicle{
    Bike(String name, int speed){
        super(name, speed);
    }
     public void descrive(){
        System.out.println("🚲 " + this.name + ":" + this.speed + "km/h");
    }   
}

public class VehicleMain {
    public static void main(String[]args){
        HashMap<String , Vehicle> vehicles = new HashMap<>();
        vehicles.put("フェラーリ", new Car("フェラーリ",300));
        vehicles.put("カローラ", new Car("カローラ",180));
        vehicles.put("ロードバイク", new Bike("ロードバイク",40));
        vehicles.put("ママチャリ", new Bike("ママチャリ",15));

        for(String key : vehicles.keySet()){
            vehicles.get(key).descrive();
            if(vehicles.get(key).getSpeed() >= 100){
                System.out.println("(高速)");
            } else{
                System.out.println("(低速)");
            }
        }
    }
}