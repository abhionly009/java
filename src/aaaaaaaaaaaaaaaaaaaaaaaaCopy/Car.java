package aaaaaaaaaaaaaaaaaaaaaaaaCopy;

public class Car {

    String carName;
    Engine engine;

    Car(String carName, Engine engine){
        this.carName = carName;
        this.engine = engine;
    }

    void display(){
        System.out.println("Car name: "+ carName);
        engine.showEngine();
    }

}
