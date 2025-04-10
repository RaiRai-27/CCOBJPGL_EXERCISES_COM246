public class App {
    public static void main(String[] args) throws Exception {
        
        HybridVehicles car1 = new HybridSedan();
        car1.carName = "Banana Bus";

        HybridVehicles car2 = new HybridPickup();
        car2.carName = "Tesla Y series";

        washCar carwash = new washCar();

        System.out.println(car1.carName + ": " + car1.changeBattery());
        System.out.println(car1.carName + ": " + car1.fillGas());
        System.out.println(car1.carName + ": " + carwash.washCar());

        System.out.println(car2.carName + ": " + car2.changeBattery());
        System.out.println(car2.carName + ": " + car2.fillGas());
        System.out.println(car2.carName + ": " + carwash.washCar());

        
    }
}
