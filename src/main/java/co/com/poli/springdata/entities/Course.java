package co.com.poli.springdata.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "courses")
public class Course extends EntityBase{

  @Column(name = "name")
  private String name;

  @JsonBackReference //No maneja la consulta,, asíevitar una entidad ciclica
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "instructor_id") //Relacion con la primaria de la tabla instructor
  private Instructor instructor;

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
