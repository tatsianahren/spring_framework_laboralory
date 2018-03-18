package com.hren.spring5webapp.repositories;

import com.hren.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hren69 on 18.3.18.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
