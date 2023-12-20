package day06;

import java.util.Scanner;

public class S16_Menu {


    public static void giris() {

        System.out.println("Who is the lucky? Welcome to the application");
        System.out.println("Select the action you want to perform\n" +
                "1. Name entry\n" +
                "2. List lucky names\n" +
                "3. Exit\n" + "Your choice: " );

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()){
            int secim = scanner.nextInt();
            switch (secim){
                case 1 :
                    S14_Registration.register();
                    giris();
                    break;
                case 2 :
                    S15_Listing.printHappyUser(S14_Registration.usersList);
                    giris();
                    break;
                case 3 :
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Enter valid value");
            }


        }else{
            System.out.println("Please, enter NUMBER only");
            giris();
        }



    }
}
