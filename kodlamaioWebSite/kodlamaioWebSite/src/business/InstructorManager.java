package business;

import dataAccess.IInstructorDao;
import entities.Instructor;
import logging.ILogger;

import java.util.List;

public class InstructorManager {
    private IInstructorDao instructorDao;
    private Instructor instructor;
    private List<ILogger> loggers;

    public InstructorManager(IInstructorDao instructorDao, Instructor instructor, List<ILogger> loggers) {
        this.instructorDao = instructorDao;
        this.instructor = instructor;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for (ILogger logger: loggers) {
            logger.log(instructor.getFirstName() + instructor.getLastName());
        }
    }
    public void delete(Instructor instructor){
        instructorDao.delete(instructor);
        for (ILogger logger: loggers) {
            logger.log(instructor.getFirstName() + instructor.getLastName());
        }
    }
    public void update(Instructor instructor){
        instructorDao.update(instructor);
        for (ILogger logger: loggers) {
            logger.log(instructor.getFirstName() + instructor.getLastName());
        }
    }

}
