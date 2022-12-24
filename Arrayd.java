/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesi_9;
import java.util.ArrayDeque;
/**
 *
 * @author SHIKUZIKA
 */
public class Arrayd {
     public static void main(String[] args) {
        ArrayDeque<String> keyboard = new ArrayDeque<>();
        keyboard.add("Corsair");
        keyboard.addFirst("C-20");
        keyboard.add("Digital Touch");
        keyboard.addLast("Keychron");
        for(String brand : keyboard){
            System.out.println(brand);
        }
    }
}
