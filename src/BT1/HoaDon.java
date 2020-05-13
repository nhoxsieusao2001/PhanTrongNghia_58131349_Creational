/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDon {
    HoaDonHeader HDH = new HoaDonHeader();
    ArrayList<ChiTietHoaDon> CTHD = new ArrayList<>();
    protected  HoaDon (builHoaDon b){
        this.HDH = b.HDH;
        this.CTHD = b.ctdh;
    }
    @Override
    public String toString() {
        return "Hóa Đơn Header:" + this.HDH.toString() + " \nChi Tiết Hóa Đơn : " + this.CTHD.toString() ;
    }
public static class builHoaDon{
    HoaDonHeader HDH = new HoaDonHeader();
    ArrayList<ChiTietHoaDon> ctdh = new ArrayList<>();
    public builHoaDon themHDD (HoaDonHeader hd){
        this.HDH = hd;
        return this;
    }
    public  builHoaDon themCTHD(ChiTietHoaDon ct){
        ctdh.add(ct);
        return this;
    }
    public HoaDon buil(){
        return new HoaDon(this);
    }

        Object themHDD(HoaDon hd) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}