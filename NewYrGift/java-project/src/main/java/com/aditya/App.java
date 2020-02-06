package com.aditya;

import java.util.*;
import java.io.*;

public class App 
{
    public static void main(String[] args)
    {
        int qty;double wt;double pr;String typ;
        Scanner sc=new Scanner(System.in);
        //Dark Chocolates
        System.out.println("Enter no. of types Dark Chocolates:");
        int n_drk_choc=sc.nextInt();
        Dark_Chocolate drk=new Dark_Chocolate(n_drk_choc);
        System.out.println("Enter Dark Chocolate details:");
        for(int ind=0;ind<n_drk_choc;ind++)
        {
            System.out.println("Enter type="); typ=sc.next();
            drk.set_type(ind,typ);
            System.out.println("Enter quantity(no.)="); qty=sc.nextInt();
            drk.set_quantity(ind,qty);
            System.out.println("Enter unit weight(gm)="); wt=sc.nextDouble();
            drk.set_wt(ind,wt);
            System.out.println("Enter unit price(Rs)="); pr=sc.nextDouble();
            drk.set_price(ind,pr);
        }
        //Milk Chocolates
        System.out.println("Enter no. of types Milk Chocolates:");
        int n_milk_choc=sc.nextInt();
        Milk_Chocolate milk=new Milk_Chocolate(n_milk_choc);
        System.out.println("Enter Milk Chocolate details:");
        for(int ind=0;ind<n_milk_choc;ind++)
        {
            System.out.println("Enter type="); typ=sc.next();
            milk.set_type(ind,typ);
            System.out.println("Enter quantity(no.)="); qty=sc.nextInt();
            milk.set_quantity(ind,qty);
            System.out.println("Enter unit weight(gm)="); wt=sc.nextDouble();
            milk.set_wt(ind,wt);
            System.out.println("Enter unit price(Rs)="); pr=sc.nextDouble();
            milk.set_price(ind,pr); 
        }
        //Candies
        System.out.println("Enter no. of types Candies:");
        int n_candies=sc.nextInt();
        Sweets candies=new Sweets(n_candies);
        System.out.println("Enter Candies details:");
        for(int ind=0;ind<n_candies;ind++)
        {
            System.out.println("Enter type="); typ=sc.next();
            candies.set_type(ind,typ);
            System.out.println("Enter quantity(no.)="); qty=sc.nextInt();
            candies.set_quantity(ind,qty);
            System.out.println("Enter unit weight(gm)="); wt=sc.nextDouble();
            candies.set_wt(ind,wt);
            System.out.println("Enter unit price(Rs)="); pr=sc.nextDouble();
            candies.set_price(ind,pr); 
        }
        //Other sweets
        System.out.println("Enter no. of types other Sweets:");
        int n_others=sc.nextInt();
        Sweets others=new Sweets(n_others);
        System.out.println("Enter Other Sweet details:");
        for(int ind=0;ind<n_others;ind++)
        {
            System.out.println("Enter type="); typ=sc.next();
            others.set_type(ind,typ);
            System.out.println("Enter quantity(no.)="); qty=sc.nextInt();
            others.set_quantity(ind,qty);
            System.out.println("Enter unit weight(gm)="); wt=sc.nextDouble();
            others.set_wt(ind,wt);
            System.out.println("Enter unit price(Rs)="); pr=sc.nextDouble();
            others.set_price(ind,pr); 
        }
        //Dark Chocolates stored
        drk.display();
        //Milk Chocolates stored
        milk.display();
        //Candies stored
        System.out.println("Candies collection...");
        candies.display();
        //Other Sweets Stored
        System.out.println("Other Sweets collection");
        others.display();
        double total_wt=drk.totalWt()+milk.totalWt()+candies.totalWt()+others.totalWt();
        System.out.println("Total Weight of Gifts:"+total_wt);
        double total_cost=drk.totalCost()+milk.totalCost()+candies.totalCost()+others.totalCost();
        System.out.println("Total Price of Gifts:"+total_cost);
    }
}


 class Chocolate implements New_Year_Gift
{
    double wts[];double prices[];int quantities[];String types[];
    Chocolate(int n)
    {
        wts=new double[n];
        prices=new double[n];
        quantities=new int[n];
        types=new String[n];
    }
    public double get_wt(int ind)
    {
        return(wts[ind]);
    }
    public void set_wt(int ind,double wt)
    {
        wts[ind]=wt;
    }
    public double get_price(int ind)
    {
        return(prices[ind]);
    }
    public void set_price(int ind,double price)
    {
        prices[ind]=price;
    }
    public double get_quantity(int ind)
    {
        return(quantities[ind]);
    }
    public void set_quantity(int ind,int quantity)
    {
        quantities[ind]=quantity;
    }
    public void set_type(int ind,String type)
    {
        types[ind]=type;
    }  
    public String get_type(int ind)
    {
        return(types[ind]);
    }
    double total_wts()
    {   
        double sum=0.0;
        for(int ind=0;ind<wts.length;ind++)
            sum+=wts[ind]*quantities[ind];
        return(sum);
    }
    double total_prices()
    {   
        double sum=0.0;
        for(int ind=0;ind<prices.length;ind++)
            sum+=prices[ind]*quantities[ind];
        return(sum);
    }
    int total_quantities()
    {   
        int sum=0;
        for(int ind=0;ind<quantities.length;ind++)
            sum+=quantities[ind];
        return(sum);
    }
}

class Dark_Chocolate extends Chocolate
{
    Dark_Chocolate(int n)
    {
       super(n); 
    }
    void display()
    {
        System.out.println("Dark Chocolate collections...");
        for(int ind=0;ind<wts.length;ind++)
        {
            System.out.print(get_type(ind)+","+get_wt(ind)+"gm,Rs "+get_price(ind)+" each,"+get_quantity(ind)+" pieces...");
            System.out.println("Total="+(get_price(ind)*get_quantity(ind)));
        }
        System.out.println("Total for Dark Chocolates.....");
        System.out.println("Wt="+total_wts()+"gm,Price=Rs "+total_prices()+",Qty="+total_quantities());
    }
    double totalWt()
    {
        return(total_wts());
    }
    double totalCost()
    {
        return(total_prices());
    }
}   

class Milk_Chocolate extends Chocolate
{
    Milk_Chocolate(int n)
    {
       super(n); 
    }
    void display()
    {
        System.out.println("Milk Chocolate collections...");
        for(int ind=0;ind<wts.length;ind++)
        {
            System.out.print(get_type(ind)+","+get_wt(ind)+"gm,Rs "+get_price(ind)+" each,"+get_quantity(ind)+" pieces...");
            System.out.println("Total="+(get_price(ind)*get_quantity(ind)));
        }
        System.out.println("Total for Milk Chocolates.....");
        System.out.println("Wt="+total_wts()+"gm,Price=Rs "+total_prices()+",Qty="+total_quantities());
    }
    double totalWt()
    {
        return(total_wts());
    }
    double totalCost()
    {
        return(total_prices());
    }
}   

interface New_Year_Gift
{
    double get_wt(int ind); 
    void set_wt(int ind,double wt);
    double get_price(int ind);
    void set_price(int ind,double price);
    double get_quantity(int ind);
    void set_quantity(int ind,int quantity);
    void set_type(int ind,String type);
    String get_type(int ind);    
}

class Sweets implements New_Year_Gift
{
    double wts[];double prices[];int quantities[];String types[];
    Sweets(int n)
    {
        wts=new double[n];
        prices=new double[n];
        quantities=new int[n];
        types=new String[n];
    }
    public double get_wt(int ind)
    {
        return(wts[ind]);
    }
    public void set_wt(int ind,double wt)
    {
        wts[ind]=wt;
    }
    public double get_price(int ind)
    {
        return(prices[ind]);
    }
    public void set_price(int ind,double price)
    {
        prices[ind]=price;
    }
    public double get_quantity(int ind)
    {
        return(quantities[ind]);
    }
    public void set_quantity(int ind,int quantity)
    {
        quantities[ind]=quantity;
    }
    public void set_type(int ind,String type)
    {
        types[ind]=type;
    }  
    public String get_type(int ind)
    {
        return(types[ind]);
    }
    double total_wts()
    {   
        double sum=0.0;
        for(int ind=0;ind<wts.length;ind++)
            sum+=wts[ind]*quantities[ind];
        return(sum);
    }
    double total_prices()
    {   
        double sum=0.0;
        for(int ind=0;ind<prices.length;ind++)
            sum+=prices[ind]*quantities[ind];
        return(sum);
    }
    int total_quantities()
    {   
        int sum=0;
        for(int ind=0;ind<quantities.length;ind++)
            sum+=quantities[ind];
        return(sum);
    }
    void display()
    {
        for(int ind=0;ind<wts.length;ind++)
        {
            System.out.print(get_type(ind)+","+get_wt(ind)+"gm,Rs "+get_price(ind)+" each,"+get_quantity(ind)+" pieces...");
            System.out.println("Total="+(get_price(ind)*get_quantity(ind)));
        }
        System.out.println("Total.....");
        System.out.println("Wt="+total_wts()+"gm,Price=Rs "+total_prices()+",Qty="+total_quantities()); 
    }
    double totalWt()
    {
        return(total_wts());
    }
    double totalCost()
    {
        return(total_prices());
    }
}
    

