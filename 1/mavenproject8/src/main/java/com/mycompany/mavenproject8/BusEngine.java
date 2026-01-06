/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject8;

/**
 *
 * @author This User
 */
public class BusEngine implements iengine{
    private String engine;
    public  BusEngine()
    { engine="dezer";
    }
    public BusEngine(String engine)
    {
        this.engine=engine;
    }

    @Override
    public void getEngine() {
        System.out.println("i am "+engine+ " bus");
    }
}
