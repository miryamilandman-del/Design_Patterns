/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject8;

/**
 *
 * @author This User
 */
public class CarColor  implements icolor{
private String color ;

    public CarColor(String color) {
        this.color=color;
    }
    public CarColor()
    {
    color="red";}
    @Override
    public void getColor() {
        System.out.println("i am " +color + " car");
    }
    
}
