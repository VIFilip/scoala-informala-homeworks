package ro.siit.java10.evp;

import java.util.ArrayList;
import java.util.List;

public class CarArray {
    public static void main(String[] args) {
        //Creating list of Cars
        List<Car> list=new ArrayList<Car>();
        //Creating Cars
        Car c1=new Car(1,"Toyota","Prius","Yes","Plugin",2001,17.99,true,true,19000);
        Car c2=new Car(2,"Honda","Civic","Yes","Hybrid",2001,16.55,false,true,21000);
        Car c3=new Car(3,"Tesla","Model S","Yes","Electric",2001,12.30,true,false,35000);
        //Adding Cars to list
        list.add(c1);
        list.add(c2);
        list.add(c3);
        //Filter list of ev cars, number of stock, and their prices
        for(Car c:list){
            System.out.println(c.stocknr+" "+c.manufacturer+""+c.model+ ", Price:"+c.price+ " $; "+"Has fast charging:"+c.hasFastCharging+". In stock:"+c.inStock);




            }
        }
    }

