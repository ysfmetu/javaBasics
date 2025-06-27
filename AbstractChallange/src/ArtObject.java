public class ArtObject extends ProductForSale{
    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override

    public void showDetail() {
        System.out.println("seçmiş olduğunuz : "+type+ " adlı ürün en güzel ürünlerden biridir");
        System.out.printf("ürünün birim fiyatı %8.2f TL %n",price);
        System.out.println(description);
    }
}
