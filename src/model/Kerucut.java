package model;

public class Kerucut{
    public int rad, garpel;
    public double phi = 3.14;

    public double hitungLuas(){
        double luas = phi * rad + (rad + garpel);
        return luas;
    }
    public void tampilkanLuas(){
        System.out.println("Luas Kerucut = " + hitungLuas()+ " cm");
    }
}