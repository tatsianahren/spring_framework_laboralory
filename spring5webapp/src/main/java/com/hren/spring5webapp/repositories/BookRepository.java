package com.hren.spring5webapp.repositories;

import com.hren.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hren69 on 18.3.18.
 */
public interface BookRepository extends CrudRepository<Book, Long > {
}
