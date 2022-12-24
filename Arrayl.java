/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesi_9;
import java.util.ArrayList;
/**
 *
 * @author SHIKUZIKA
 */
public class Arrayl {
    public static void main(String[] args) {
        ArrayList <String> myData = new ArrayList<String>();
        myData.add("Samsung");
        myData.add("Smartphone");
        myData.add("Acer");
        for (String brand : myData){
            System.out.println(brand);
        }
    }
}
