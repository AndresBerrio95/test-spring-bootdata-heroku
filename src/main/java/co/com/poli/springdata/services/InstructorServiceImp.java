package co.com.poli.springdata.services;

import co.com.poli.springdata.entities.Instructor;
import co.com.poli.springdata.repository.InstructorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorServiceImp implements InstructorService{

  @Autowired
  private InstructorRepository repository;

  @Override
  public List<Instructor> findAll() {
    return repository.findAll();
  }

  @Override
  public Instructor create(Instructor instructor) {
    return repository.save(instructor);
  }
}
