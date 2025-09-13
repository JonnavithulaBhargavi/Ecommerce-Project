package com.project.service;

import com.project.entity.Category;
import com.project.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository crepo;

    // Save a category
    public void saveCategory(Category c) {
        crepo.save(c);
    }

    // Fetch all categories
    public List<Category> getAll() {
        return crepo.findAll();
    }

    // Delete category by ID
    public void deletebyId(int id) {
        crepo.deleteById(Integer.valueOf(id));
    }

    // Fetch category by ID
    public Optional<Category> fetchbyId(int id) {
        return crepo.findById(Integer.valueOf(id));
    }
}