import java.util.ArrayList;
import java.util.Scanner;
//abstraction
//polymorphism method overriding
public abstract class product_Info {
    Scanner scanner = new Scanner(System.in);
    Login_Info info = new Login_Info();
    static ArrayList<String> product_list = new ArrayList<>();
    static ArrayList<String> product_dis = new ArrayList<>();
    static  ArrayList<String> contact_n = new ArrayList<>();
    void add(){
        product_list.add("Soap");
        product_list.add("Mobile");
        product_dis.add("Dettol.........");
        product_dis.add("RealMe........");
        contact_n.add("0144456");
        contact_n.add("0123526");
    }

    static void view(){
        for(int i=0; i<product_list.size(); i++){
            System.out.printf("%d.Name: %s    Discription:%s      Number: %s\n",i+1,product_list.get(i),product_dis.get(i),contact_n.get(i));
        }
    }
}
