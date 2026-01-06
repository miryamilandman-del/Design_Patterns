/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject8;

/**
 *
 * @author This User
 */
public class BusFactory implements IVehicleFactory
{
    

    @Override
    public icolor createColor() {     
        return new BusColor(); 
    }

      @Override
    public iengine createEngine() {      
        return new BusEngine(); 
    }

    @Override
    public itype createType() {
        return new BusType();
    }
}

