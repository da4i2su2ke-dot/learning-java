import java.util.HashMap;

interface Printable {
    void printInfo();
}

class Product implements Printable{
    String name;
    int price;
    Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void printInfo(){
        System.out.print(this.name + ":" + this.price + "円");
    }
}


class Main {

    public static void main(String[]args){
    HashMap<String , Product>products = new HashMap<>();
    products.put("りんご", new Product("りんご", 100));
    products.put("ステーキ", new Product("ステーキ", 3000));
    products.put("コーヒー", new Product("コーヒー", 500));

    for(String key: products.keySet()){
        products.get(key).printInfo();
        if (products.get(key).getPrice() >= 1000){
            System.out.println("高級");
        } else {
            System.out.println("普通");      
        }
    }
    }
}
