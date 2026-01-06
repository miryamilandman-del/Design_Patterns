/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;

/**
 *
 * @author This User
 */
public class Mavenproject8 {

    public static void main(String[] args) {
        System.out.println("--- Testing Track Factory ---");
         IVehicleFactory trackFactory=new TruckFactory();
        createAndShowVehicle(trackFactory);

        System.out.println("\n--- Testing Car Factory ---");
        IVehicleFactory carFactory = new CarFactory();
        createAndShowVehicle(carFactory);
        
        System.out.println("\n--- Testing Bus Factory ---");
        IVehicleFactory busFactory = new BusFactory();
        createAndShowVehicle(busFactory);
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println(db1 == db2); 
    }

   
    public static void createAndShowVehicle(IVehicleFactory factory) {   
        icolor color = factory.createColor();
        iengine engine = factory.createEngine();
        itype type = factory.createType();   
        color.getColor();
        engine.getEngine();
        type.getType();
    }
}
    
