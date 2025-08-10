package Movie;

public class Movie {
    private int id;// 电影id
    private String name;
    private double price;
    private String actro;

    //定义一个有参构造器
    public Movie(int id, String name, double price, String actro) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.actro = actro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public String getActro() {
        return actro;
    }

    public void setActro(String actro) {
        this.actro = actro;
    }

    public Movie(){


    }

}
