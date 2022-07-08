import java.util.Scanner;
import model.Balok;
import model.Kerucut;
import model.Kubus;
import model.Tabung;
import model.Prisma;

public class App{
    public static void main(String[] args) throws Exception{
        Util.init();
        Util.bacaFile();
        Util.tulisFile(null);

        /*String pesan = "Selamat Datang di Dunia Lingkaran Tahun ";
        int tahun = 2022;
        System.out.println(pesan + tahun);
        System.out.print("============================================\n");
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Carissa Chandra");
        System.out.println("03081210012");
        System.out.println("21SI1");

        String yn="";
        do {
            System.out.println("Program Menghitung Bangun Ruang");
            System.out.println("1. Menghitung Tabung");
            System.out.println("2. Menghitung Kubus");
            System.out.println("3. Menghitung Balok");
            System.out.println("4. Menghitung Kerucut");
            System.out.println("5. Menghitung Prismak");
            System.out.println("6. Keluar");
            System.out.print ("\nMasukkan pilhan Anda : ");

            int pilihan=0;
            pilihan = keyboard.nextInt();
            if (pilihan==1){
                menuTabung(keyboard);
            }
            else if (pilihan==2){
                menuKubus(keyboard);
            }
            else if (pilihan==3){
                menuBalok(keyboard);
            }
            else if (pilihan==4){
                menuKerucut(keyboard);
            }
            else if (pilihan==5){
                menuPrisma(keyboard);
            }
            else if (pilihan==6)break; 
            System.out.print("Apakah Anda ingin kembali ke menu utama? (y/n)");
            yn = keyboard.next();
            //clear screen
            bersihkanLayar();
        }
        while (yn.equals("y"));
        System.out.println("Terimakasih");*/
    }

    public static void bersihkanLayar(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
    public static void menuKubus (Scanner keyboard){
        Kubus kubus1 = new Kubus();
        System.out.print ("Masukkan Sisi Kubus  = ");
        kubus1.s = keyboard.nextInt();
        kubus1.hitungLuas();
        kubus1.tampilkanLuas();
        kubus1.tampilkanVolume();
    }
    public static void menuBalok (Scanner keyboard){
        Balok balok1 = new Balok();
        System.out.println("Masukkan Panjang Kubus = ");
        balok1.p = keyboard.nextInt();
        System.out.println("Masukkan Lebar Kubus = ");
        balok1.l = keyboard.nextInt();
        System.out.println("Masukkan Tinggi Kubus = ");
        balok1.t = keyboard.nextInt();
        balok1.hitungVolume();
        balok1.tampilkanVolume();
    }

    public static void menuKerucut (Scanner keybaord){
        Kerucut kerucut1 = new Kerucut();
        System.out.println("Masukkan Panjang Radius = ");
        kerucut1.rad = keybaord.nextInt();
        System.out.println("Masukkan Panjang Garis Pelukis = ");
        kerucut1.garpel = keybaord.nextInt();
        kerucut1.hitungLuas();
        kerucut1.tampilkanLuas();
    }

    public static void menuTabung (Scanner keyboard){
        Tabung tabung1 = new Tabung();
        System.out.print("Masukkan Panjang Jari Jari Tabung = ");
        tabung1.rad = keyboard.nextDouble();
        System.out.print("Masukkan Tinggi Tabung = ");
        tabung1.t = keyboard.nextDouble();
        tabung1.hitungLuasSelimut();
        tabung1.tampilkanLS();
        tabung1.hitungLuasPermukaan();
        tabung1.tampilkanLP();
    }
    public static void menuPrisma(Scanner keybaord){ 
        Prisma prisma1 = new Prisma();
        System.out.print("Masukkan Alas Segitiga Prisma : ");
        prisma1.a = keybaord.nextInt();
        System.out.print("Masukkan Tinggi Segitiga : ");
        prisma1.t = keybaord.nextInt();
        System.out.print("Masukkan Tinggi Prisma : ");
        prisma1.h = keybaord.nextInt();
        prisma1.hitungVolume();
        prisma1.tampilkanVolume();
    }
    
}
