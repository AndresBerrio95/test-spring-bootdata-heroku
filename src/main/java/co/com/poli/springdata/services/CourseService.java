package co.com.poli.springdata.services;

import co.com.poli.springdata.entities.Course;
import java.util.List;

public interface CourseService {

  List<Course> findAll();
  Course create(Course course);

}
