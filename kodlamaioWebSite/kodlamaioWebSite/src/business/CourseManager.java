package business;

import dataAccess.ICourseDao;
import entities.Course;
import logging.ILogger;


public class CourseManager {
    private ICourseDao courseDao;
    private Course course;
    private ILogger[] loggers;

    public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
        this.courseDao = courseDao;
        this.course = course;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception{
        if (courseDao.findByName(course.getName()) != null){
            throw new Exception("Kurs ismi tekrar edemez.");
        }
        if (course.getUnitprice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }
        courseDao.add(course);

        for (ILogger logger: loggers) {
            logger.log(course.getName());
        }
    }
    public void delete(Course course){
        courseDao.delete(course);
        for (ILogger logger: loggers) {
            logger.log(course.getName());
        }
    }
    public void update(Course course){
        courseDao.update(course);
        for (ILogger logger: loggers) {
            logger.log(course.getName());
        }
    }
}
