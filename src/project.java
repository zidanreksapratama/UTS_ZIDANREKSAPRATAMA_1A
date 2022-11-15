import java.util.Random;
import java.util.Scanner;

public class project{
    int Jumlantai=3;
    static int totalmaksimalkendaraan = 450;
    static int totalbobotmaksimalkendaraan = 800000;
    public static String[] Lantai1 = new String[150];
    public static String[] Lantai2 = new String[150];
    public static String[] Lantai3 = new String[150];
    public static int[] bobotmaksimallantai1 = {450000};
    public static int[] bobotmaksimallantai2 = {200000};
    public static int[] bobotmaksimallantai3 = {150000};

    public static void printinfokendaraan(){
        int totalLantai1=0;
        int sisabobotmaksimal=0;
        int bobot1=0;
        for(int index=0;index< bobotmaksimallantai1.length;index++) {
            if (bobotmaksimallantai1[index] != 0) {
                bobot1++;
            }
        }
        int bobot2=0;
        for(int index=0;index< bobotmaksimallantai2.length;index++) {
            if (bobotmaksimallantai2[index] != 0) {
                bobot2++;
            }
        }
        int bobot3=0;
        for(int index=0;index< bobotmaksimallantai3.length;index++) {
            if (bobotmaksimallantai3[index] != 0) {
                bobot3++;
            }
        }
        int totalsisakuota=0;
        for(int index=0;index< Lantai1.length;index++){
            if (Lantai1[index] !=null) {
                totalLantai1++;

            }
        }
        int totalLantai2=0;
        for(int index=0;index< Lantai2.length;index++){
            if(Lantai2[index] !=null){
                totalLantai2++;
            }
        }
        int totalLantai3=0;
        for(int index=0;index< Lantai3.length;index++){
            if(Lantai3[index] !=null){
                totalLantai3++;
            }
        }

        totalsisakuota=totalmaksimalkendaraan-totalLantai1-totalLantai2-totalLantai3;
        sisabobotmaksimal=totalbobotmaksimalkendaraan-bobot1-bobot2-bobot3;
        System.out.println("Total kendaraan yang ada di lantai 1 : "+totalLantai1+" | Total kendaraan yang ada dilantai 2 :"+totalLantai2+" | Total kendaraan yang ada dilantai 3 :"+totalLantai3);
        System.out.println("Total maksimal bobot kendaraan : "+totalbobotmaksimalkendaraan+" | Sisa beban yang bisa ditampung :"+sisabobotmaksimal);
        System.out.println("Total maksimal kendaraan : "+totalmaksimalkendaraan+" | Sisa lahan parkir yang tersedia :"+totalsisakuota);
        System.out.println();

    }public static void Checkindexarray(String[] myArray,String totalkendaraan){
        int indexNow=0;
        for(int index=0;index<myArray.length;index++){
            if(myArray[index] !=null) {
                indexNow = index + 1;
            }
        }
        if(indexNow< myArray.length){
            myArray[indexNow] = totalkendaraan;
        }
    }
    public static void simpantotalkendaraan(int angka, String totalkendaraan){
        switch (angka){
            case 1:
                Checkindexarray(Lantai1,totalkendaraan);
                System.out.println("anda mendapatkan lantai 1");
                printinfokendaraan();
                break;
            case 2:
                Checkindexarray(Lantai2,totalkendaraan);
                System.out.println("anda mendapatkan Lantai 2");
                printinfokendaraan();
                break;
            case 3:
                Checkindexarray(Lantai3,totalkendaraan);
                System.out.println("anda mendapatkan Lantai 3");
                printinfokendaraan();
                break;
        }
    }

    public static void infokendaraan() {
        Scanner inputdata= new Scanner(System.in);
        while(true){
            System.out.print("plat nomor kendaraan :");
            String reksa = inputdata.nextLine();
            System.out.print("Bobot kendaraan :");
            String zidan = inputdata.nextLine();
            if(reksa.isBlank()){
                System.out.println("Plat nomor wajib diisi");
                infokendaraan();
            }
            if(zidan.isBlank()){
                System.out.println("Bobot kendaraan wajib diisi");
                infokendaraan();
            }else{
                Random hasilRandom = new Random();
                int jenisrandom = hasilRandom.nextInt(3)+1;
                simpantotalkendaraan(jenisrandom,zidan);
            }
        }
    }

    public static void main(String[] args) {
        infokendaraan();
    }
}















