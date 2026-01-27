import exc1.*;
import  exc2.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Room myRoom=new BasicRoom();
        myRoom=new AirConditionerDerecrator(myRoom);
        myRoom=new BedDecorator(myRoom);
        myRoom=new BedDecorator(myRoom);
        myRoom=new DoorDecrecator(myRoom);
        myRoom=new ColerDecorator(myRoom);
        System.out.println(myRoom.GetPrice());

        File file1 = new File("Image", 500);
        File file2 = new File("Text", 200);
        File file3 = new File("PDF", 300);
        Folder subFolder = new Folder();
        subFolder.addComponent(file3);
        Folder rootFolder = new Folder();
        rootFolder.addComponent(file1);
        rootFolder.addComponent(file2);
        rootFolder.addComponent(subFolder);
        System.out.println("--- מערכת ניהול קבצים ---");
        System.out.println("גודל קובץ בודד (file1): " + file1.getSize() + " KB");
        System.out.println("גודל תיקיית המשנה: " + subFolder.getSize() + " KB");
        System.out.println("גודל התיקייה הראשית כולה: " + rootFolder.getSize() + " KB");
        System.out.println("סוג התיקייה הראשית: " + rootFolder.getType());
        System.out.println("סוג קובץ 1: " + file1.getType());
    }
}