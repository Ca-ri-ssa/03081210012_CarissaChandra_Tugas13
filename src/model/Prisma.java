package model;

public class Prisma{
    public int a = 0, t = 0, h = 0;
    
    public double hitungVolume(){
        double volume = (1.0/2 * a * t) * h;
        return volume;
    }
    public void tampilkanVolume(){
        System.out.println("Volume = "+ hitungVolume()+ " cm^3");
    }
}