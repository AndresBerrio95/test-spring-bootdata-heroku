package co.com.poli.springdata.services;

import co.com.poli.springdata.entities.Course;
import co.com.poli.springdata.repository.CourseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImp implements CourseService{

  @Autowired
  private CourseRepository repository;

  @Override
  public List<Course> findAll() {
    return repository.findAll();
  }

  @Override
  public Course create(Course course) {
    return repository.save(course);
  }
}
