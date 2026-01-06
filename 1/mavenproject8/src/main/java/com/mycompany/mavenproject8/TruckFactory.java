/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject8;

/**
 *
 * @author This User
 */
public class TruckFactory implements IVehicleFactory{
    

    @Override
    public icolor createColor() {
      
        return new TruckColor(); 
    }

    @Override
    public iengine createEngine() {
      
        return new TruckEngine(); 
    }

    @Override
    public itype createType() {
       
        return new TruckType();
    }
}

