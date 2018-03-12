package ro.siit.java10.evp;
import java.util.*;
class Car {
    int stocknr,prodYear;
    String manufacturer,model,electricBatteries,electricMotor;
    double energyConsumption;
    float price;
    boolean hasFastCharging, inStock;

        public Car(int stocknr, String manufacturer, String model, String electricBatteries,String electricMotor, int prodYear, double energyConsumption, boolean hasFastCharging,boolean inStock, float price) {
        this.stocknr = stocknr;
        this.manufacturer = manufacturer;
        this.model = model;
        this.electricBatteries = electricBatteries;
        this.electricMotor = electricMotor;
        this.prodYear = prodYear;
        this.energyConsumption = energyConsumption;
        this.price = price;
        this.hasFastCharging = hasFastCharging;
        this.inStock = inStock;


    }
}
