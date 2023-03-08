package com.diviso.production;
import com.diviso.launch.*;
import java.util.*;
import java.text.*;

public class ViewController
{
    private int choose1;
    private int choose2;
    private String button1 = "";
    private String button2 = "";
    private boolean check = true;
    private String dateString;

    public void setChoose1(int choose1) {this.choose1 = choose1;}
    public int getChoose1() {return choose1;}

    public void setChoose2(int choose2) {this.choose2 = choose2;}
    public int getChoose2() {return choose2;}

    public void setButton1(String button1) {this.button1 = button1;}
    public String getButton1() {return button1;}

    public void setButton2(String button2) {this.button2 = button2;}
    public String getButton2() {return button2;}

    public void setCheck(boolean check) {this.check = check;}
    public boolean getCheck() {return check;}

    public void setDateString(String dateString) {this.dateString = dateString;}
    public String getDateString() {return dateString;}

    PollutionService pollutionService = new PollutionService();
    Vehicle vehicle = new Vehicle();
    VehicleInfo vehicleInfo = new VehicleInfo();
    TwoWheel twoWheel = new TwoWheel();
    FourWheel fourWheel = new FourWheel();
    SixWheel sixWheel = new SixWheel();
    Information inf = new Information();

    Date date = new Date();
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    //String dateString = scanner.nextLine();
    //Date date = df.parse(dateString);
    //System.out.println(date);
    Scanner sc =new Scanner(System.in);

    /*for(int i = 0; i<100; i++)
    {
        pollutionService.add(vehicle);
    }
    */
    
    public void viewInfoOne() {
        System.out.println("\t\t\t\t " + " Welcome To Performance Vehicle Service ");
        System.out.println("\t \t =======================================================" + "\n");
        System.out.println("1.Pollution Test 2.About Us 3.Exit");
    }

    public void viewControl() throws ParseException {
        setChoose1(sc.nextInt());

        while (getCheck()){
            switch (getChoose1()) {
                case 1:
                    if (getChoose1() == 1) {
                        System.out.println("You Are Selected Pollution Test");
                        System.out.println("===============================" + "\n");
                        System.out.println("*** Enter Your Vehicle Details ***");
                        System.out.println("==================================" + "\n");
                        viewInfoTwo();
                        viewInsideControl();
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
                    if (getChoose1() == 2) {
                        inf.showAboutPerformanceDetails();
                    }
                case 3 :
                {
                    if(getChoose1() == 3)
                    {
                        check = false;
                        break;
                    }
                    break;
                }
                default :
                    System.out.println("Oops!");
            }
            System.out.println("Do you want to continue press (y) or Want to exit press (n) ");
            setButton1(sc.nextLine());
            if(getButton1().equals("n"))
            {
                break;
            }
        }
    }

    public void viewInfoTwo()
    {
        System.out.println("1.TwoWheel 2.FourWheel 3.SixWheel 4.Exit");
        System.out.println("========================================");
    }

    public void viewInsideControl() throws ParseException {

        setChoose2(sc.nextInt());

        while(getCheck()){
            switch (getChoose2()) {
                case 1:
                    if (getChoose2() == 1) {
                        twoWheelConfig();
                    }

                case 2:
                    if (getChoose2() == 2) {
                        fourWheelConfig();
                    }

                case 3:
                    if (getChoose2() == 3) {
                        sixWheelConfig();
                    }
                case 4:
                    if (getChoose2() == 4) {
                        check = false;
                        break;
                    }
                    break;
                default:
                    System.out.println("Oops!");
            }
            System.out.println("Do you want to continue press (y) or Want to exit press (n) ");
            setButton2(sc.nextLine());

            if(getButton2().equals("n"))
            {
                break;
            }
        }
    }

    public void twoWheelConfig() throws ParseException {
        try
        {
            System.out.println("Enter Your Two-Wheel's Registration Number : ");
            twoWheel.setRegNo(sc.nextLine());

            if(twoWheel.getRegNo() == twoWheel.getRegNo())
            {
                System.out.println("Sorry You Are Already Issued Before In Between Six Month");
            }

            System.out.println("Enter Your Two-Wheel's BrandName : ");
            twoWheel.setBrandName(sc.nextLine());

            System.out.println("Enter Today's Date : ");
            setDateString(sc.nextLine());
            date = df.parse(getDateString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("Code Is Completed!");
        }
        }

    public void fourWheelConfig() throws ParseException {
        try
        {
            System.out.println("Enter Your Four-Wheel's Registration Number : ");
            fourWheel.setRegNo(sc.nextLine());

            if(fourWheel.getRegNo() == fourWheel.getRegNo())
            {
                System.out.println("Sorry You Are Already Issued Before In Between Six Month");
            }

            System.out.println("Enter Your Four-Wheel's BrandName : ");
            fourWheel.setBrandName(sc.nextLine());

            System.out.println("Enter Today's Date : ");
            setDateString(sc.nextLine());
            date = df.parse(getDateString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("Code Is Completed!");
        }
    }

    public void sixWheelConfig() throws ParseException
    {
        try {
            System.out.println("Enter Your Six-Wheel's Registration Number : ");
            sixWheel.setRegNo(sc.nextLine());

            if(sixWheel.getRegNo() == sixWheel.getRegNo())
            {
                System.out.println("Sorry You Are Already Issued Before In Between Six Month");
            }

            System.out.println("Enter Your Six-Wheel's BrandName : ");
            sixWheel.setBrandName(sc.nextLine());

            System.out.println("Enter Today's Date : ");
            setDateString(sc.nextLine());
            date = df.parse(getDateString());
            //sixWheel.setUpdatedDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Code Is Complete!");
        }
    }

    public void printVehiclePollution() {
        System.out.println(twoWheel);
        System.out.println(fourWheel);
        System.out.println(sixWheel);
    }
}
