import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Util {
    //static String lokasiFile= "/Users/admin/Documents/GitHub/PBO20S1/gamePocong20S1/README.md";
    static String lokasiFile= "/README.md";
    static String lokasiFileOutput= "/output.md";
    //windows gunakan \\

public static void init(){
    try {
        String path = new File(".").getCanonicalPath();
        lokasiFile = path + lokasiFile;
        lokasiFileOutput = path + lokasiFileOutput;
        //System.out.println(path);
    } catch (Exception e) {
        //TODO: handle exception
    }
}

    public static ArrayList<Long> bacaFile(){
        init();
        ArrayList<Long> hasil = new ArrayList<Long>();
        String data;
        FileReader fin=null;
        try {
            fin = new FileReader(lokasiFile);
            BufferedReader br = new BufferedReader(fin);
            do{
                data = br.readLine();
                if(data!=null){
                    System.out.println(data);
                    hasil.add(Long.parseLong(data));
                }
            }while(data!=null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //TODO: handle exception
        }
        finally{
            if(fin!=null){
                try {
                    fin.close();
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println(e.getMessage());
                }
            }
        }
        return hasil;
    }



    public static void tulisFile(ArrayList<Long> hasil){
        init();
        String data = "";
        FileWriter fout = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            fout = new FileWriter(lokasiFile);
            data = "ini test menulis data";
        } catch (Exception e){
            //TODO: handle Exception
            System.out.println(e.getMessage());
        } finally{
            if(fout!=null){
                try {
                    for(Long hasils : hasil){
                        fout.write(hasils.toString());
                    }
                    fout.close();
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println(e.getMessage());
                }
            }   
        }   
    }
}