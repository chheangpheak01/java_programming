package classNObject.model;

public class Product {
    private Integer id;
    private String name;
    private String code;
    private Double price;
    private Integer quantity;
    public void setProduct(Integer prID,String prName,String prCode,Double prPrice,Integer prQuantity){
        id = prID;
        name = prName;
        code = prCode;
        price = prPrice;
        quantity = prQuantity;
    }
    public void getProduct(){
        System.out.println("ID -> " + id);
        System.out.println("Name -> " + name);
        System.out.println("Code -> " + code);
        System.out.println("Price -> " + price);
        System.out.println("Quantity -> " + quantity);
    }
}
