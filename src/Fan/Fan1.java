package Fan;

public class Fan1 {
    String Type;
    String Brand;
    String Model;
    String Color;
    String Speed;
    String Weight;
    String Price;

    public Fan1(String type,String brand,String model,String color,String speed,String weight,String price){
        this.Type = type;
        this.Brand=brand;
        this.Model=model;
        this.Color=color;
        this.Speed=speed;
        this.Weight=weight;
        this.Price=price;


    }

    void display(){
        System.out.println("Type :"+Type);
        System.out.println("Brand:"+Brand);
        System.out.println("Model:"+Model);
        System.out.println("Color:"+Color);
        System.out.println("Speed:"+Speed);
        System.out.println("Weight: "+Weight);
        System.out.println("Price: "+Price);
    }


}
