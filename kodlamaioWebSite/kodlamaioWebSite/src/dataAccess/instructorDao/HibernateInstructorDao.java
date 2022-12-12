package dataAccess.instructorDao;

import dataAccess.IInstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Hibernate ile veritabanından silindi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Hibernate ile veritabanı güncellendi.");
    }
}
