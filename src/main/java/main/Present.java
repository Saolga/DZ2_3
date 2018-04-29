package main;

public abstract class Present{
    String name;
    double weight;
    double price;
    String uniq ;

    public String getName(){return name;}
    public double getWeight(){return weight;}
    public double getPrice(){return price;}
    public String getUniq(){return uniq;}

    public Present(String n, double w,double p,String u){
        name=n;
        weight=w;
        price=p;
        uniq=u;
    }
}


