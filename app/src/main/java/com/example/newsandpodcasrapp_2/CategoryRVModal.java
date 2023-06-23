package com.example.newsandpodcasrapp_2;

public class CategoryRVModal {

    private String category;
    private  String CategoryImageurl;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryImageurl() {
        return CategoryImageurl;
    }

    public void setCategoryImageurl(String categoryImageurl) {
        CategoryImageurl = categoryImageurl;
    }

    public CategoryRVModal(String category, String categoryImageurl) {
        this.category = category;
        CategoryImageurl = categoryImageurl;
    }
}
