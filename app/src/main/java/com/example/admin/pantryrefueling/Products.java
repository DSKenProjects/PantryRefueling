package com.example.admin.pantryrefueling;

public class Products {
    private String idProduct;
    private String productName;
    private String category;
    private String quantity;
    //private String[] quantityOption = {"empty","half-full","full"};

    public Products(String idP, String pName, String category, String quantity){
        this.idProduct = idP;
        this.productName = pName;
        this.category = category;
        this.quantity = quantity;
    }

    //gettings
    public String getIdProduct(){
        return this.idProduct;
    }
    public String getProductName(){
        return this.productName;
    }
    public String getCategory(){
        return this.category;
    }
    public String getQuantity(){
        return this.quantity;
    }
    //settings
    public void setIdProduct(String newId){
        this.idProduct = newId;
    }
    public void setProductName(String newProdName){
        this.productName = newProdName;
    }
    public void setCategory(String newCat){
        this.category = newCat;
    }
    public void setQuantity(String newQty){
        this.quantity = newQty;
    }

}
