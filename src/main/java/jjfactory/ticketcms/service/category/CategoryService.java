package jjfactory.ticketcms.service.category;

import jjfactory.ticketcms.domain.category.Category;

import java.util.List;

public interface CategoryService {
    Category findById(Long id);
    List<Category> findAll();
    void save(Category category);
    void deleteById(Long id);
}
