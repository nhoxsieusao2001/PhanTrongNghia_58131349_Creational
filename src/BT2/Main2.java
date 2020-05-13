/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author Admin
 */
public class Main2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder.myBuilder()
                .addString("Phan Trọng Nghĩa  ")
                .addFloat((float)0.58)
                .addString("  ")
                .addBool(true)
                .buil();
        System.out.println(sb.toString());
    }
}
