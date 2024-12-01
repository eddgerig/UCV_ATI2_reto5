package com.lab3springbootTDD.controller;
import com.lab3springbootTDD.entity.Category;
import com.lab3springbootTDD.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class CategoryController {

    private CategoryService categoryService;
    ArrayList<Category> categoriesList;

    //Constructor de array vacio
    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = "/categories")
    @ResponseBody
    public ArrayList<Category> getAllCategories() {
        ArrayList<Category> categories = categoryService.getAllCategories();
        return categories;
    }

    @GetMapping(value = "/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello";
    }

    @GetMapping(value = "/categoriesListGenerate/{wantedSize}")
    @ResponseBody
    public ArrayList<Category> generateCategoriesList(int p_wantedSize) {
        ArrayList<Category> categories = new ArrayList<>();

        for (int i = 0; i < p_wantedSize; i ++){
            Category category = new Category((long) i, "Category " + i, "Description " + i);
            categories.add(category);
        }

        return categories;
    }

}