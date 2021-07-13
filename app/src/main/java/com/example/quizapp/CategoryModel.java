package com.example.quizapp;

public class CategoryModel {

    public String imageUrl,title;

    public  CategoryModel(String imageUrl, String title) {
        this.imageUrl = imageUrl;
        this.title = title;

    }

    public String getImageUrl(){
        return imageUrl;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl=imageUrl;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }


}
