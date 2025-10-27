package Lv3;

public class MenuItem {

    // 속
    public String name;
    public String info;
    public Double price;

    // 생
    MenuItem( String name, Double price, String info) {
        this.name = name;
        this.info = info;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getInfo() {
        return info;
    }
}
