package model;

public class Kubus{
        public int s = 0;
        
        public int  hitungLuas(){
            return 6 * (s * s);
        }
        public int hitungVolume (){
            return s * s * s;
        }
        public void tampilkanLuas(){
            System.out.println("Sisi = "+s+" cm");
            System.out.println("Luas = "+ hitungLuas());
        }
        public void tampilkanVolume(){
            System.out.println("Sisi = "+s+" cm");
            System.out.println("Volume = "+ hitungVolume());
        }
      }