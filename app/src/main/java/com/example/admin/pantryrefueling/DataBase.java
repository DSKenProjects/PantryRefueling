package com.example.admin.pantryrefueling;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper {

    private static String DB_NAME  = "PantryRefuelingDB";
    private static int DB_VERSION = 1;


    //*******************************
    // Variables de la table Users
    //*******************************
    private static final String TABLE_USERS = "Users";
    private static final String COLUMN_USERNAME = "username";
    private static final String COLUMN_PASSWORD = "password";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_FIRSTNAME = "firstname";
    private static final String COLUMN_LASTNAME = "lastname";
    private static final String COLUMN_ROLE = "role";

    //*******************************
    //Variables de la table Products
    //*******************************
    private static final String TABLE_PRODUCTS = "Products";
    private static final String COLUMN_IDPRODUCT = "idProduct";
    private static final String COLUMN_PRODUCT_NAME = "productName";
    private static final String COLUMN_CATEGORY = "category";
    private static final String COLUMN_QUANTITY = "quantity";

    //*******************************
    //Variables de la table Categories
    //*******************************
    private static final String TABLE_CATEGORIES = "Categories";
    private static final String COLUMN_IDCATEGORY = "idCategory";
    private static final String COLUMN_CATEGORY_NAME = "categoryName";


    //*******************************
    //Variables de la table Categories
    //*******************************

    public DataBase( Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
