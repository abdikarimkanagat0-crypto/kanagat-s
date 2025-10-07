package club;



public class Player {
    String price;
    String position;
    int year;
    public Player() {
        System.out.println("player founded");
    }

    public Player(String price, String position, int year) {
        this.price = price;
        this.position = position;
        this.year = year;
    }

    public String getPrice() {
        return price;
    }
    public String getPosition(){
            return position;
    }
    public int getYear(){
            return year;
    }
     public void setPosition(String position){
            this.position=position;
     }
    public void setPrice(String price){
            this.price = price;
    }
    public void setYear(int year){
            this.year=year;
    }

    public String toString (){
        return year+" "+position+" "+price;
    }

}



