package main;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args){
        /*Подарок из разных сладостей (Candy, Jellybean, etc.)
         У каждой сладости есть название, вес, цена и свой уникальный параметр.
         Выводится общий вес подарка, стоимость
         и информацию о всех сладостях в подарке.
         */
        Scanner sc=new Scanner(System.in);
        Present pr[]=new Present[10];       //задаём подарок
        pr[0]=new Candy();
        pr[1]=new Jellybean();
        pr[2]=new Chocolate();
        pr[3]=new Cake();
        pr[4]=new Candy(0.04,1.1);
        pr[5]=new Jellybean(0.04,0.5);
        pr[6]=new Cake();
        pr[7]=new Chocolate();
        pr[8]=new Candy();
        pr[9]=new Chocolate();

        double price=0,weight=0;
        System.out.println("Present contains:");
        for(int i=0;i<pr.length;++i){
            price+=pr[i].getPrice();
            weight+=pr[i].getWeight();
            System.out.println((i+1) + ". "+pr[i].getName()+", " + pr[i].getUniq());
        }
        System.out.println("Present price: "+price);
        System.out.println("Present weight: " +weight+" kg");

        sc.close();
    }
}
