package com.example.admin.pantryrefueling;
import java.util.ArrayList;

public class Categories {


    private String idCategory;
    private String categoryName;
    private ArrayList<Products> productsList;

    public Categories(String idC){
        this.idCategory = idC;
        productsList = new ArrayList<Products>();
    }
    public Categories(String idC, String cName){
        this.idCategory = idC;
        this.categoryName = cName;
        productsList = new ArrayList<Products>();
    }

    //gettings
    public String getIdCategory(){
        return this.idCategory;
    }
    public String getCategoryName(){
        return this.categoryName;
    }
    public void getProductList(){
        for(int i=0; i<productsList.size(); i++){
            System.out.println(productsList.get(i).getProductName());
        }
    }

    //settings
    public void setIdCategory(String newId){
        this.idCategory = newId;
    }
    public void setCategoryName(String newCategoryName){
        this.categoryName = newCategoryName;
    }
    public void addProduct(Products p){
        productsList.add(p);
    }
    public void removeProduct(Products p){
        productsList.remove(p);
    }
}
