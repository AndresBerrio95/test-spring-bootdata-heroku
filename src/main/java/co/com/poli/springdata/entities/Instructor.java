package co.com.poli.springdata.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "instructors")
public class Instructor extends EntityBase{

  @Column(name = "name")
  private String name;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "email")
  private String email;

  @JsonManagedReference //El manejador, quien va a dirigir la consulta
  @OneToMany(mappedBy = "instructor", cascade = CascadeType.PERSIST)
  private List<Course> courses;

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
