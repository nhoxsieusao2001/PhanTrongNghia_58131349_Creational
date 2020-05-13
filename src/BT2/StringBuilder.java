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
public class StringBuilder {
    String str;

    public StringBuilder() {
    }

    public StringBuilder(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    protected StringBuilder(myBuilder b){
        this.str = b.str;
    }

    @Override
    public String toString() {
        return  str ;
    }
    
    public static class myBuilder{
        String str = " ";
    public myBuilder addString(String s){
        this.str += s;
        return this;
    }
    public myBuilder addFloat(float s){
        this.str += String.valueOf(s);
            return this;
    }
    public  myBuilder addBool(boolean s){
        this.str += String.valueOf(s);
        return this;
    }
    public StringBuilder buil(){
        return new StringBuilder(this);
                
    }
    }
}
