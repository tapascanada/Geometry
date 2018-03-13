/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import java.util.Scanner;

/**
 *
 * @author PC7
 */
public class Circle {
    private int radius;
    private double area;
    private double cercom;
    /**
     * Constructor is a special method
     * 1. Name should be same as Class name
     * 2. No return type
     * 3. Used to initialize the variables
     * 4. Must be public
     * 5. A class can have multiple constructor
     * @param radius 
     */
    public Circle(){
        radius = 0;
        area=0;
        cercom=0;
    }
    public Circle(int radius){
        this.radius = radius;
        area =0;
        cercom = 0;
    }
    public Circle(int radius,double area,double cercom){
        this.radius = radius;
        this.area =area;
        this.cercom = cercom;        
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextInt();     
    }
    public void area(){
        area = 3.14 * radius * radius;
        System.out.println("The area of circle is "+area);
    }
    public void cercom(){
        cercom = 2 * 3.14 * radius;
        System.out.println("The cercomference of circle is "+cercom);        
    }
}
