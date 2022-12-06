import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      int sicaklik;
        System.out.print("Hava Kaç derece ? ");
        sicaklik = input.nextInt();
        if (sicaklik<=5){
            System.out.print(sicaklik + " derecede sadece kayak yapılır");
        } else if (sicaklik<=15) {
            System.out.println(sicaklik + " derecede çok güzel sinemaya gidilir");
        } else if (sicaklik<=25) {
            System.out.println(sicaklik + " derecede çok güzel piknik yapılmaz mı !");
        } else  {
            System.out.println(sicaklik+" derecede çok güzel yüzülür ferahlar insan");
        }
    }
}