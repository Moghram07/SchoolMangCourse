package com.example.schoolmangexcersize.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Course {

    @Id
    private Integer id;

    private String name;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;
}
