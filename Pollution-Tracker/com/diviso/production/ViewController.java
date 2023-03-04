package com.diviso.production;
import java.util.*;

public class ViewController
{
    TwoWheel twoWheel = new TwoWheel();
    FourWheel fourWheel = new FourWheel();
    SixWheel sixWheel = new SixWheel();
    Information inf = new Information();

    PollutionService pollutionService = new PollutionService();
    Scanner sc =new Scanner(System.in);

    public void viewInfo() {
        System.out.println("\t\t\t\t " + " Welcome To Performance Vehicle Service ");
        System.out.println("\t \t =======================================================" + "\n");
        System.out.println("1.Pollution Test 2.About Us 3.Exit");
        int choose1 = sc.nextInt();
        String button1 = "";
        do {
            switch (choose1) {
                case 1:
                    if (choose1 == 1) {
                        System.out.println("You Are Selected Pollution Test");
                        System.out.println("===============================" + "\n");
                        System.out.println("*** Enter Your Vehicle Details ***");
                        System.out.println("===========================" + "\n");
                        viewControl();
                        /*
                         if(regNo is already inside file )
                         -- sout("Sorry You Are Already Issued Before Six Month")
                         if(regNo is Valid)
                         -- Enter Your Brand Name.
                         -- Fill Today Date.
                         -- Completed Message.
                         -- sout(show Print Certificate)
                         -- Thank You Message.
                         -- toString needs to be fully meaningful
                         -- viewController->pollutionCenter->vehicles->add Cars
                        */
                    }

                case 2:
                    if (choose1 == 2) {
                        inf.showAboutPerformanceDetails();
                    }
                case 3 :
                {
                    if(choose1 == 3)
                    {

                    }
                }
            }
            System.out.println("Do You Want To Continue Press (Y/y)");
            button1 = sc.next();
        }
        while (button1.equals("Y") || button1.equals("y"));
    }

    public void viewControl()
    {
        String button2 = "";
        do
        {
            System.out.println("1.TwoWheel 2.FourWheel 3.SixWheel 4.Exit");
            int choose2 = sc.nextInt();
            switch(choose2)
            {
                case 1 :
                    if(choose2 == 1)
                    {
                        twoWheel.twoWheelConfig();
                    }

                case 2 :
                    if(choose2 == 2)
                    {
                        fourWheel.fourWheelConfig();
                    }

                case 3 :
                    if(choose2 == 3)
                    {
                        sixWheel.sixWheelConfig();
                    }
                case 4 :
                    if(choose2 == 4)
                    {
                        break;
                    }
            }
            System.out.println("Do You Want To Continue Press (Y/y)");
            button2 = sc.next();
        }
        while(button2.equals("Y") || button2.equals("y"));
    }

    @Override
    public String toString() {
        return "ViewController{" +
                "twoWheel=" + twoWheel +
                ", fourWheel=" + fourWheel +
                ", sixWheel=" + sixWheel +
                ", inf=" + inf +
                ", pollutionService=" + pollutionService +
                '}';
    }
}
