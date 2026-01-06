/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject8;

/**
 *
 * @author This User
 */
public class Carengine implements iengine{
    private String engine;
    public  Carengine()
    { engine="dezer";
    }
    public Carengine(String Engine)
    {
        this.engine=Engine;
    }

    @Override
    public void getEngine() {
        System.out.println("i am "+engine+ " car");
    }
}
