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

    //*******************************
    //Variables de la table Products
    //*******************************
    private static final String TABLE_PRODUCTS = "Products";
    private static final String COLUMN_IDPRODUCT = "idProduct";
    private static final String COLUMN_PRODUCT_NAME = "productName";
    private static final String COLUMN_CATEGORY = "category";
    private static final String COLUMN_QUANTITY = "quantity";

    //*******************************
    //Variables de la table ProvisionList
    //*******************************
    private static final String TABLE_PROVISION_LIST = "ProvisionList";
    private static final String COLUMN_ID_PRODUCT_PL = "idProduct";

    //*******************************
    //Variables de la table UserStatistics
    //*******************************
    private static final String TABLE_USER_STATISTICS = "UserStatistics";
    private static final String COLUMN_USERNAME_ST = "userName";
    private static final String COLUMN_CURRENT_PURCHASE_AMOUNT = "currentPurchaseAmount";
    private static final String COLUMN_LAST_PURCHASE_AMOUNT = "lastPurchaseAmount";
    private static final String COLUMN_TOTAL_PURCHASE_AMOUNT = "totalPurchaseAmount";



    public DataBase( Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // SQL QUERY TO CREATE TABLE USERS
        String CREATE_TABLE_USERS = "CREATE TABLE " + TABLE_USERS + "("
                +COLUMN_USERNAME + "TEXT PRIMARY KEY,"
                + COLUMN_PASSWORD + "TEXT,"
                + COLUMN_EMAIL + "TEXT,"
                + COLUMN_FIRSTNAME + "TEXT,"
                + COLUMN_LASTNAME +"TEXT )";
        db.execSQL(CREATE_TABLE_USERS);

        // SQL QUERY TO CREATE TABLE PRODUCTS
        String CREATE_TABLE_PRODUCTS = "CREATE TABLE " + TABLE_PRODUCTS + "("
                +COLUMN_IDPRODUCT+ "TEXT PRIMARY KEY,"
                + COLUMN_PRODUCT_NAME + "TEXT,"
                + COLUMN_CATEGORY + "TEXT,"
                + COLUMN_QUANTITY +"TEXT )";
        db.execSQL(CREATE_TABLE_PRODUCTS);

        // SQL QUERY TO CREATE TABLE PROVISON_LIST
        String CREATE_TABLE_PROVISONLIST = "CREATE TABLE " + TABLE_PROVISION_LIST + "("
                +COLUMN_ID_PRODUCT_PL+ "TEXT PRIMARY KEY)";
        db.execSQL(CREATE_TABLE_PROVISONLIST);

        // SQL QUERY TO CREATE TABLE USER_STATISTICS
        String CREATE_TABLE_USER_STATISTICS = "CREATE TABLE " + TABLE_USER_STATISTICS+ "("
                +COLUMN_USERNAME_ST+ "TEXT PRIMARY KEY,"
                + COLUMN_CURRENT_PURCHASE_AMOUNT + "INTEGER,"
                + COLUMN_LAST_PURCHASE_AMOUNT +"INTEGER,"
                +COLUMN_TOTAL_PURCHASE_AMOUNT +"INTEGER )";
        db.execSQL(CREATE_TABLE_USER_STATISTICS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
