class Car {

    String carMake;
    String carModel;
    int modelYear;

    Car(String carMake, String carModel, int modelYear) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.modelYear = modelYear;
    }

    void displayDetails() {
        System.out.println(carMake + " " + carModel + " " + modelYear);
    }
}

public class CarDemo {

    public static void main(String[] args) {

        Car firstCar = new Car("Toyota", "Camry", 2022);
        Car secondCar = new Car("Honda", "City", 2023);

        firstCar.displayDetails();
        secondCar.displayDetails();
    }
}
