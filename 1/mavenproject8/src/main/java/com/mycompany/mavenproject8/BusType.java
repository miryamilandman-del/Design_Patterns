/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject8;

/**
 *
 * @author This User
 */
public class BusType implements itype{
  private String type;

public BusType (){
type="Toyota";}
public  BusType (String type){
this.type=type;}
    @Override
    public void getType() {
        System.out.println("i am "+ type+" bus"); 
    }
      
}
