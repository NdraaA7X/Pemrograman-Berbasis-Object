package Jobsheet1.BikeDemo;

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        Bike mountainBike3 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        mountainBike1.setBrand("Polygon");
        mountainBike1.gearChanges(2);
        mountainBike1.speedAcceleration(12);
        mountainBike1.printInfo();

        mountainBike2.setBrand("United");
        mountainBike2.gearChanges(3);
        mountainBike2.speedAcceleration(25);
        mountainBike2.printInfo();

        mountainBike3.setBrand("Wimcycle");
        mountainBike3.gearChanges(1);
        mountainBike3.speedAcceleration(18);
        mountainBike3.printInfo();

        roadBike1.setBrand("Pinarello");
        roadBike1.setTireWidth(23);
        roadBike1.gearChanges(5);
        roadBike1.speedAcceleration(30);
        roadBike1.printInfo();
    }
}
