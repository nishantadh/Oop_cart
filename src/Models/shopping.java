package Models;

public class shopping {
    int id;
    String shopname;
    int[] price;

    public shopping(int id, String shopname, int[] price) {
        this.id = id;
        this.shopname = shopname;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public void displayinformation() {
        int id = this.id;
        String shopname = this.shopname;
        int[] price = this.price;
        int totalprice = 0;
        for (int i = 0; i < price.length; i++) {
            int pp = price[i];
            totalprice = totalprice + pp;
        }
        System.out.println(id + " Cart has a total bill of Rs " + totalprice);
    }
}