package co.com.poli.springdata.controller;

import co.com.poli.springdata.entities.Course;
import co.com.poli.springdata.services.CourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

  @Autowired //Bin de la capa anterior "Service" para poder tener el obejto y trabajar con ese objeto en la pte clase
  private CourseService service;

  @GetMapping
  public List<Course> findAll(){
    return service.findAll();
  }

  @PostMapping
  public Course create(@RequestBody Course course){
    return service.create(course);
  }
}
