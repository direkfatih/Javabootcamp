package dataAccess.courseDao;

import dataAccess.ICourseDao;
import entities.Course;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Hibernate ile veritabanından silindi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate ile veritabanı güncellendi.");
    }

    @Override
    public Course findByName(String coursName) {
        return null;
    }
}
