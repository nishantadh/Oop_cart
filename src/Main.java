import Models.shopping;

public class Main {
    public static void main(String[] args) {

        shopping cart1;
        cart1= new shopping(1, "nis house", new int[] {120000 , 600000});

        shopping cart2;
        cart2 = new shopping(2, "nis house",new int[] {240000 , 56000});

        shopping cart3;
        cart3 = new shopping(3,"nis house",new int[] {59000 , 80000});
        cart1.displayinformation();
        cart2.displayinformation();
        cart3.displayinformation();




    }
}
