

public class SanPham {

    private String name;
    private double price;


    public SanPham(double price, String name) {
        this.name = name;
        this.price = price;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SanPham{" + "name : " + name + ", price : " + price + '}';
    }
    
    
    
    
    

}
