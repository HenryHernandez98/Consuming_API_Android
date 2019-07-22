package com.example.consuming_api_rest.models;

import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("id")
    private  int id;
    private  int ProductID;
    private  String ProductName;
    private  int  SupplierID;
    private  int  CategoryID;
    private  String QuantityPerUni;
    private  float UnitPrice;
    private  int  UnitsInStock;
    private  int  UnitsOnOrder;
    private  int ReorderLevel;
    private  Boolean  Discontinued;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getQuantityPerUni() {
        return QuantityPerUni;
    }

    public void setQuantityPerUni(String quantityPerUni) {
        QuantityPerUni = quantityPerUni;
    }

    public float getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        UnitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return UnitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        UnitsInStock = unitsInStock;
    }

    public int getUnitsOnOrder() {
        return UnitsOnOrder;
    }

    public void setUnitsOnOrder(int unitsOnOrder) {
        UnitsOnOrder = unitsOnOrder;
    }

    public int getReorderLevel() {
        return ReorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        ReorderLevel = reorderLevel;
    }

    public Boolean getDiscontinued() {
        return Discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        Discontinued = discontinued;
    }



}
