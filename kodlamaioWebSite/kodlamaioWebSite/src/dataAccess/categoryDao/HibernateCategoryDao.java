package dataAccess.categoryDao;

import dataAccess.ICategoryDao;
import entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Hibernate ile veritabanından silindi.");
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernate ile veritabanı güncellendi");
    }

    @Override
    public Category findByname(String categoryName) {
        return null;
    }
}
