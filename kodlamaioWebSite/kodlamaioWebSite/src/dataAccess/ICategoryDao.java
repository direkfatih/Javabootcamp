package dataAccess;

import entities.Category;

public interface ICategoryDao {
    public void add(Category category);
    public void delete(Category category);
    public void update(Category category);

    Category findByname(String categoryName);
}
