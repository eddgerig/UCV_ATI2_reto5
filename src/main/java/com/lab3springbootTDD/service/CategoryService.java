package com.lab3springbootTDD.service;

import com.lab3springbootTDD.entity.Category;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Service
public class CategoryService {

    private ArrayList<Category> categoriesList = new ArrayList<Category>();

    public ArrayList<Category> getAll() {
        return new ArrayList<Category>();
    }

    public void setCategoriesList(ArrayList<Category> p_categoriesList) {
        this.categoriesList = p_categoriesList;
    }

    public ArrayList<Category> getAllCategories() {
        return  this.categoriesList;
    }

}
