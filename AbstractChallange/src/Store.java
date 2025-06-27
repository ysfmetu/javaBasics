import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale>storeProducts=new ArrayList<>();

    public static void main(String[] args) {
       storeProducts.add(new ArtObject("PASTEL ",1580,"pastel tablo çalışmasıdır"));
       storeProducts.add(new ArtObject("ELİŞİ ",5980,"el çalışması olarak üretilmiştir"));
       listProducts();
    }

    public static void listProducts(){
        for(var item:storeProducts){
            System.out.println("-".repeat(30));
            item.showDetail();
        }


    }
}