package model;

public class Tabung {
    public double rad;
    public double t;
    public final double phi = 22.0/7;

    public double hitungLuasSelimut(){
        double LS = 2 * phi * rad * t;
        return LS;        
    }
    public double hitungLuasPermukaan(){
        double LP = hitungLuasSelimut() + (2 * phi * Math.pow(rad , 2));
        return LP;
    }
    public void tampilkanLS(){
        System.out.println("Luas selimut tabung = " + hitungLuasSelimut());
    }
    public void tampilkanLP(){
        System.out.println("Luas permukaan tabung = " + hitungLuasPermukaan());
    }
}