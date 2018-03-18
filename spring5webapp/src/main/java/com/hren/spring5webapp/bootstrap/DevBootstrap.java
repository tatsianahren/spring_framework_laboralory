package com.hren.spring5webapp.bootstrap;

import com.hren.spring5webapp.model.Author;
import com.hren.spring5webapp.model.Book;
import com.hren.spring5webapp.model.Publisher;
import com.hren.spring5webapp.repositories.AuthorRepository;
import com.hren.spring5webapp.repositories.BookRepository;
import com.hren.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by hren69 on 18.3.18.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
                        PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Publisher p1 = new Publisher("Joe", "NY");
        Publisher p2 = new Publisher("Jack", "AL");
        Publisher p3 = new Publisher("Harper Collins", "NY");
        Publisher p4 = new Publisher("Worx", "NY");

        publisherRepository.save(p1);
        publisherRepository.save(p2);
        publisherRepository.save(p3);
        publisherRepository.save(p4);

        Author eric = new Author("Eric", "Evance");
        Book ddd = new Book("Domain Data Design", "1234", p3);

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEjb = new Book("J2EE Development without EJB", "1111", p4);
        eric.getBooks().add(noEjb);

        authorRepository.save(rod);
        bookRepository.save(noEjb);
    }


}
