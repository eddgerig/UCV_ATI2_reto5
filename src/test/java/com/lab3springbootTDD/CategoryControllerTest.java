package com.lab3springbootTDD;

import com.lab3springbootTDD.controller.CategoryController;
import com.lab3springbootTDD.entity.Category;
import com.lab3springbootTDD.service.CategoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CategoryControllerTest {
    int wantedSize = 3;
    @Mock
    CategoryService myTestcategoryService = new CategoryService();

    @InjectMocks
    private CategoryController myTestcategoryController;


    @BeforeEach
    public void setUp() {
        myTestcategoryController = new CategoryController(myTestcategoryService);
    }

    @Test
    void whenSayHello_shouldReturnStringHello() {
        String result = myTestcategoryController.sayHello();
        assertEquals("Hello", result);
    }

    private ArrayList<Category> getListOfCategories() {
        ArrayList<Category> categories = new ArrayList<>();

        Category category = new Category(1L, "Category 1", "Description 1");
        categories.add(category);

        category = new Category(2L, "Category 2", "Description 2");
        categories.add(category);

        category = new Category(3L, "Category 3", "Description 3");
        categories.add(category);

        return categories;
    }

    @Test
    void whenGetAllCategories_shouldCallServiceAndReturnTheCorrectList() {
        try {
            ArrayList<Category> expected = this.getListOfCategories();
            doReturn(expected).when(myTestcategoryService).getAllCategories();
            myTestcategoryController.generateCategoriesList(wantedSize);
            ArrayList<Category> result = myTestcategoryController.getAllCategories();
            System.out.println("expected=" + expected.size() + ", result=" +  result.size());

            verify(myTestcategoryService, times(1)).getAllCategories();

            assertEquals(expected, result);
        } catch (RuntimeException e) { //Verificar que se lanzó la excepción esperada
            assertEquals(RuntimeException.class, e.getClass());
        }


    }

}