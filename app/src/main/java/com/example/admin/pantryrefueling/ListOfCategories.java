package com.example.admin.pantryrefueling;

import java.util.LinkedList;
import java.util.Iterator;

public class ListOfCategories {

    private LinkedList<Categories> categoriesList;

    public ListOfCategories(){

        categoriesList = new LinkedList<Categories>();
    }

    //gettings
    public void getCategoriesList(){
        Iterator<Categories> it = categoriesList.iterator();
        while (it.hasNext()){
            Categories tmpCat = it.next();
            System.out.println("*********************"+tmpCat.getCategoryName()+"*********************");
            tmpCat.getProductList();
        }
        System.out.println("*********************");
    }
    //settings
    public void addCategory(Categories c){
        categoriesList.add(c);
    }
    public void addProductToCategory(Categories c, Products p){
        Iterator<Categories> it = categoriesList.iterator();
        while (it.hasNext()){
            Categories tmpCat = it.next();
            if (tmpCat.getCategoryName().equals(c.getCategoryName())) {
                tmpCat.addProduct(p);
                break;
            }
        }
    }
    public void removecCategory(Categories c){
        categoriesList.remove(c);
    }
    public void removeProductFromCategory(Categories c, Products p) {
        Iterator<Categories> it = categoriesList.iterator();
        while (it.hasNext()) {
            Categories tmpCat = it.next();
            if (tmpCat.getCategoryName().equals(c.getCategoryName())) {
                tmpCat.removeProduct(p);
                break;
            }

        }
    }
    public int getCategoriesListSize() {

        return categoriesList.size();
    }


}