package Oil;

public class Oil {
    private   int money;
    Oil(){
        System.out.println("emmpty oil object");
    }
    Oil(String place)
    {
        System.out.println("object from " + place);
    }
    Oil (String country,String city){
        System.out.printf("objects from: %s\n city: %s\n",country,city);
    }

    void setMoney(int money){
        this.money=money;
    }
    public double getMoney() {
        return money* 0.68;
    }
}
