package dataAccess.instructorDao;

import dataAccess.IInstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("JDBC ile veritabanından silindi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("JDBC ile veritabanı güncellendi.");
    }
}
