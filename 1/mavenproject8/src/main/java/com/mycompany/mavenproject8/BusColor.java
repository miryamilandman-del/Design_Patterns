/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject8;

/**
 *
 * @author This User
 */
public class BusColor implements icolor{
    private String color ;

    public BusColor(String color) {
        this.color=color;
    }
    public BusColor()
    {
    color="red";}
    @Override
    public void getColor() {
        System.out.println("i am " +color + " bus");
    }
}
