package com.diviso.production;

import java.util.*;

public class ViewController
{
    Information inf = new Information();
    Scanner sc =new Scanner(System.in);

    public void viewInfo() {
        System.out.println("\t\t\t\t " + " Welcome To Performance Vehicle Service ");
        System.out.println("\t \t =======================================================" + "\n");
        System.out.println("1.Pollution Test 2.About Us ");
        int choose = sc.nextInt();
        String button = "";
        do {
            switch (choose) {
                case 1:
                    if (choose == 1) {
                        System.out.println("You Are Selected Pollution Test");
                        System.out.println("===============================" + "\n");
                        System.out.println("*** Enter Your Details ***");
                        System.out.println("1.TwoWheel 2.FourWheel 3.FourWheel");
                        /*-- Enter Your Registration Number.
                         if(regNo is already inside file )
                         -- sout("Sorry You Are Already Issued Before Six Month")
                         if(regNo is Valid)
                         -- Enter Your Brand Name.
                         -- Fill Today Date.
                         -- Completed Message.
                         -- sout(show Print Certificate)
                         -- Thank You Message.
                        */
                    } else {
                        System.out.println("Oops!");
                    }

                case 2:
                    if (choose == 2) {
                        inf.showAboutPerformanceDetails();
                    } else {
                        System.out.println("Oops!");
                    }
            }
            System.out.println("Do You Want To Continue Press (Y/y)");
            button = sc.next();
        }
        while (button.equals("Y") || button.equals("y"));
    }
}
