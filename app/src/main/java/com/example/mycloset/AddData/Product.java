package com.example.mycloset.AddData;

import android.widget.EditText;

public class Product {
    private String ViewOptions;
    private String TakeAPhoto;

    public Product(EditText etViewOptions, EditText etTakeAPhoto) {
    }

    public Product(String viewOptions, String takeAPhoto) {
        ViewOptions = viewOptions;
        TakeAPhoto = takeAPhoto;
    }

    public String getViewOptions() {
        return ViewOptions;
    }

    public void setViewOptions(String viewOptions) {
        ViewOptions = viewOptions;
    }

    public String getTakeAPhoto() {
        return TakeAPhoto;
    }

    public void setTakeAPhoto(String takeAPhoto) {
        TakeAPhoto = takeAPhoto;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ViewOptions=" + ViewOptions +
                ", TakeAPhoto='" + TakeAPhoto + '\'' +
                '}';
    }
}
