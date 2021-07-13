public class Product {
    private int id;
    private String brand;
    private String name;
    public long price;
    
    public Product() {
    }

    public Product(int id, String brand, String name, long price) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

@Override
public String toString() {
    // TODO Auto-generated method stub
    return "ID"+id + " - " + brand + " - " + name + " - " + price + " VNĐ ";
}
}
