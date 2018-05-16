package by.hren.apps.resipeproject.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categotyName;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;
}
