package com.demoproject.giflib.data;

import com.demoproject.giflib.model.Category;
import com.demoproject.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(0, "funny"),
            new Category(1, "tech"),
            new Category(2, "people")
    );

    public Category findById(int id) {
        for(Category category: ALL_CATEGORIES) {
            if(category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }
}
