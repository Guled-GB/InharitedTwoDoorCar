
interface Car {
    void run();
    void stop();
    void repair();
}

abstract class FourDoorCar implements Car {
    private String model;
    private String brand;
    private int year;


    public FourDoorCar(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public void openFourDoors() {
        System.out.println("All four doors are now open.");
    }

    public void run() {
        System.out.println(brand + " " + model + " (" + year + ") is running.");
    }


    public void stop() {
        System.out.println(brand + " " + model + " (" + year + ") has stopped.");
    }


    public void repair() {
        System.out.println(brand + " " + model + " (" + year + ") is being repaired.");
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}

class FourDoorToyota extends FourDoorCar {
    public FourDoorToyota(String model, int year) {
        super(model, "Toyota", year);
    }

    public void activateToyotaSafetyFeatures() {
        System.out.println("Activating Toyota safety features.");
    }
}

class FourDoorBMW extends FourDoorCar {
    public FourDoorBMW(String model, int year) {
        super(model, "BMW", year);
    }

    public void activateBMWDrivingMode() {
        System.out.println("Activating BMW driving mode.");
    }
}

class FourDoorFord extends FourDoorCar {
    public FourDoorFord(String model, int year) {
        super(model, "Ford", year);
    }

    public void enableFordEcoMode() {
        System.out.println("Enabling Ford Eco Mode.");
    }
}

class FourDoorHyundai extends FourDoorCar {
    public FourDoorHyundai(String model, int year) {
        super(model, "Hyundai", year);
    }

    public void activateHyundaiSmartSense() {
        System.out.println("Activating Hyundai SmartSense features.");
    }
}

public class Main {
    public static void main(String[] args) {

        FourDoorToyota myToyota = new FourDoorToyota("Camry", 2024);
        FourDoorBMW myBMW = new FourDoorBMW("5 Series", 2023);
        FourDoorFord myFord = new FourDoorFord("Explorer", 2022);
        FourDoorHyundai myHyundai = new FourDoorHyundai("Sonata", 2023);

        myToyota.run();
        myToyota.openFourDoors();
        myToyota.activateToyotaSafetyFeatures();
        myToyota.stop();
        myToyota.repair();

        System.out.println();

        myBMW.run();
        myBMW.openFourDoors();
        myBMW.activateBMWDrivingMode();
        myBMW.stop();
        myBMW.repair();

        System.out.println();

        myFord.run();
        myFord.openFourDoors();
        myFord.enableFordEcoMode();
        myFord.stop();
        myFord.repair();

        System.out.println();

        myHyundai.run();
        myHyundai.openFourDoors();
        myHyundai.activateHyundaiSmartSense();
        myHyundai.stop();
        myHyundai.repair();
    }
}
