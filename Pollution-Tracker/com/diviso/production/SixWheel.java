package com.diviso.production;

import java.util.*;
import java.util.Date;

public class SixWheel extends Vehicle
{
    Scanner sc = new Scanner(System.in);
    Date date =new Date();

    public void sixWheelConfig()
    {
        System.out.println("Enter Your Six-Wheel's Registration Number : ");
        setRegNo(sc.nextLine());
        if(getRegNo()==getRegNo())
        {
            System.out.println("Sorry You Are Already Issued Before In Between Six Month");
        }
        System.out.println("Enter Your Six-Wheel's BrandName : ");
        setBrandName(sc.nextLine());
        System.out.println("Enter Today's Date : ");
        //setDate(sc.nextLine());
    }

    @Override
    public String toString() {
        return "SixWheel{" +
                "date=" + date +
                '}';
    }
}
