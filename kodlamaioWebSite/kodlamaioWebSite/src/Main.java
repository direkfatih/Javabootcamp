import business.CourseManager;
import dataAccess.courseDao.HibernateCourseDao;
import dataAccess.courseDao.JdbcCourseDao;
import entities.Category;
import entities.Course;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.ILogger;
import logging.MailLogger;

public class Main {
    public static void main(String[] args) throws Exception{
        ILogger[] loggers = {};

        Course course1 = new Course(1,"Java",15,"Engin Demirog","Proglamlama","java.jpg");
        Course course2 = new Course(2,"C#",10,"Engin Demirog","Proglamlama","C#.jpg");
        Course course3 = new Course(3,".NET",15,"Engin Demirog","Proglamlama",".NET.jpg");
        Course course4 = new Course(4,"JavaScript",20,"Engin Demirog","Proglamlama","JavaScript.jpg");
        Course course5 = new Course(5,"Java+React",25,"Engin Demirog","Proglamlama","Java+React.jpg");
        Course course6 = new Course(6,"Proglamlamaya Giriş",30,"Engin Demirog","Proglamlama","Giriş.jpg");

        Category category1 = new Category(1,"Proglamla");

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);
    }
}