package CHALLENGE1;

public class MenuItem {

    // 속 // 캡슐화
    private String name;
    private String info;
    private Double price;

    // 생
    MenuItem( String name, Double price, String info) {
        this.name = name;
        this.info = info;
        this.price = price;
    }
    //getter 캡슐화에 따른 간접접근 게터 생성
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
