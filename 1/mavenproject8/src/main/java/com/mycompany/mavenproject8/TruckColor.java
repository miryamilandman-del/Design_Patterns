/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject8;

/**
 *
 * @author This User
 */
public class TruckColor implements icolor{
   private String color ;

    public TruckColor(String color) {
        this.color=color;
    }
    public TruckColor()
    {
    color="red";}
    @Override
    public void getColor() {
        System.out.println("i am " +color + " truck");
    } 
}

