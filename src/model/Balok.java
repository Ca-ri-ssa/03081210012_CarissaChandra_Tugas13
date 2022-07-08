package model;

public class Balok{
    public int p = 0, l = 0, t = 0;
    
    public int hitungVolume(){
        return p * l * t;
    }
    public void tampilkanVolume(){
        System.out.println("Volume = "+hitungVolume()+ " cm^3");
    }
}