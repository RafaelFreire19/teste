package entities;

public class Product {
    public String name;
    public  double price;
    public int quantily;

    public double totalValueInStock(){
        return price*quantily;

    }
    public void addProducts (int quantily){
        this.quantily+=quantily;
    }
    public void removeProducts(int quantily){
        this.quantily-=quantily;
    }
    public String toString(){
        return name
                +", $ "
                +String.format("%.2f", price)
                +", "
                +quantily
                +" units, Total : $"
                +String.format("%.2f",totalValueInStock());
    }
}
