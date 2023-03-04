package com.diviso.production;
import java.util.*;

public class FourWheel extends Vehicle
{
    Scanner sc = new Scanner(System.in);

    public void fourWheelConfig()
    {
        System.out.println("Enter Your Four-Wheel's Registration Number : ");
        setRegNo(sc.nextLine());
        if(getRegNo()==getRegNo())
        {
            System.out.println("Sorry You Are Already Issued Before In Between Six Month");
        }
        System.out.println("Enter Your Four-Wheel's BrandName : ");
        setBrandName(sc.nextLine());
        System.out.println("Enter Today's Date : ");
        //setDate(sc.nextLine());
    }

    @Override
    public String toString() {
        return "FourWheel{}";
    }
}
