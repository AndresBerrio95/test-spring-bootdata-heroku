package co.com.poli.springdata.services;

import co.com.poli.springdata.entities.Instructor;
import java.util.List;

public interface InstructorService {

  List<Instructor> findAll();
  Instructor create(Instructor instructor);

}
