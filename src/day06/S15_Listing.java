package day06;

import java.util.ArrayList;
import java.util.Random;

public class S15_Listing {
    public static void printHappyUser(ArrayList<S13_User> usersList) {

        if (usersList.isEmpty()){
            System.out.println("List is empty");
            return;

        }
        Random random = new Random();
        int randomIndex = random.nextInt(usersList.size());

        S13_User luckyUser = usersList.get(randomIndex);

        System.out.println(luckyUser.name+" --> You are lucky user!! "+
                "You were born on " + luckyUser.birthDate);



    }




}
