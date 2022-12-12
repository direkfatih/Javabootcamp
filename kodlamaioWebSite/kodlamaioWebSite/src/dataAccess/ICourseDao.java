package dataAccess;

import entities.Course;

public interface ICourseDao {
    public void add(Course course);
    public void delete(Course course);
    public void update(Course course);
    Course findByName(String coursName);
}
