package com.newspaper.newswebsite.service;

import com.newspaper.newswebsite.domain.Category;
import com.newspaper.newswebsite.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CategoryServiceImpl  implements CategoryService{


    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @Transactional
    public void addCategory(Category category) {
        categoryRepository.save(category);

    }
}
