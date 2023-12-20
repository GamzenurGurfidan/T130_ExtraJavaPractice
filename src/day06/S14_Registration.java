package day06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class S14_Registration {
    /*
           Sansli Kullanici Belirleme Uygulamasi

        Kulanıcıların adini ve dogum tarihini girerek bir ArrayListe ekleyen
        ve sonrasında birini random şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
        Bunun için;
         1 - Bir user class oluşturun fields: name , birthDate (LocalDate cinsinden)
         2 - Registration class oluşturun, icinde register method olusturun
        ve Kullanıcıdan user ismini ve dogum tarihini alarak ArrayList e ekleyin
         3 - Listing class oluşturun ve printHappyUsers isminde bir metod ekleyerek
        ArrayListteki userlardan random sansli kisiyi yazdıran metodu oluşturun.
         4 - Menu class olustur
         5 - Runner class
    */
    static ArrayList<S13_User> usersList = new ArrayList<>();

    public static void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String isim = scanner.nextLine();

        System.out.println("Enter your birthdate (in yyyy-MM-dd format)");
        String date = scanner.nextLine();
        LocalDate birthdate = LocalDate.parse(date);

        S13_User user = new S13_User(isim, birthdate);
        usersList.add(user);

        System.out.println("kayıt alındııı....");

    }
}
