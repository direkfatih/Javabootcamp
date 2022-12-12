package business;


import dataAccess.ICategoryDao;
import entities.Category;
import logging.ILogger;

import java.util.List;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private Category category;
    private List<ILogger> loggers;

    public CategoryManager(ICategoryDao categoryDao, Category category, List<ILogger> loggers) {
        this.categoryDao = categoryDao;
        this.category = category;
        this.loggers = loggers;
    }
    public void add(Category category) throws Exception {
        if (categoryDao.findByname(category.getName())!=null);
        categoryDao.add(category);
        for (ILogger logger: loggers) {
            logger.log(category.getName());
        }
    }
    public void delete(Category category){
        categoryDao.delete(category);
        for (ILogger logger: loggers) {
            logger.log(category.getName());
        }
    }
    public void update(Category category){
        categoryDao.update(category);
        for (ILogger logger: loggers) {
            logger.log(category.getName());
        }
    }
}
