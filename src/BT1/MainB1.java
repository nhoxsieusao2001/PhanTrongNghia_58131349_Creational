/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class MainB1 {
    public static void main(String[] args) throws ParseException {
        HoaDonHeader hdh =  new HoaDonHeader("1", new SimpleDateFormat("dd/MM/yy").parse("05/10/1998"), "Phan Trọng Nghĩa");
        ChiTietHoaDon ct1 = new ChiTietHoaDon("Sữa", 10, 6000, 0);
        ChiTietHoaDon ct2 = new ChiTietHoaDon("Nước ngọt", 2, 10000, 0);
        HoaDon hd = new HoaDon.builHoaDon()
                .themHDD(hdh)
                .themCTHD(ct1)
                .themCTHD(ct2)
                .buil();
   
        System.out.println(hd.toString());   
      
                
    }
}