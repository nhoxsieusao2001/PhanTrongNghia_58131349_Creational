/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDon {
    String sanPham;
    int soLuong;
    long donGia;
    long chietKhau;
    
    
    public ChiTietHoaDon() {
    }
    

    public ChiTietHoaDon(String sanPham, int soLuong, long donGia, long chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }


    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public long getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(long chietKhau) {
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return   "Sản Phẩm : " + sanPham + ", Số Lượng : " + soLuong + ", Đơn Giá : " + donGia + ", Chiết Khấu : " + chietKhau ;
    } 
    
}
