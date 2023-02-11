import java.io.Console;
import java.util.Scanner;



public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe(km):");
        int km = input.nextInt();
        double total = (km*0.10);
        System.out.print("Yaşınız:");
        int age = input.nextInt();
        System.out.println("Tek Yön ise>1\nGidiş-Dönüş ise>2");
        int islem =input.nextInt();
        if(age>0 && km>0){
            if(islem==1){
                if(age<12)
                    System.out.println("Toplam Tutar:"+(total*0.50));
                else if(age>=12&&age<=24)
                    System.out.println("Toplam Tutar:"+(total*0.90));
                else if(age>=65)
                    System.out.println("Toplam Tutar:"+(total*0.70));
                else
                    System.out.println("Toplam Tutar:"+(total));

            }
            else if(islem==2){

                if(age<12)
                    System.out.println("Toplam Tutar:"+(total*2*0.50*0.80));
                else if(age>=12&&age<=24)
                    System.out.println("Toplam Tutar:"+(total*2*0.90*0.80));
                else if(age>=65)
                    System.out.println("Toplam Tutar:"+(total*2*0.70*0.80));
                else
                    System.out.println("Toplam Tutar:"+(total*2*0.80));
            }
            else
                System.out.println("Lütfen Doğru İşlem Seçiniz");

        }
        else
            System.out.println("Hatalı Giriş Yaptınız");









    }
}




