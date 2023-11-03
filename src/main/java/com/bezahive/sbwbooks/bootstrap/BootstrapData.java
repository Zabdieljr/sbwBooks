package com.bezahive.sbwbooks.bootstrap;


import com.bezahive.sbwbooks.domain.Author;
import com.bezahive.sbwbooks.domain.Book;
import com.bezahive.sbwbooks.repositories.AuthorRepository;
import com.bezahive.sbwbooks.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// add component annotation
// add implements CommandLineRunner
@Component
public class BootstrapData implements CommandLineRunner {
    // add author and book repositories
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    // add constructor
    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    // add run method
    @Override
    public void run(String... args) throws Exception {
        // add author and book objects
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        // save author and book objects to repositories
        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);
        // add another author named rod
        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        // add another book named noEJB
        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("54757585");


        // save author and book objects to repositories
        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        // create association between author and book initialize the books to an empty hashset
        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);
        // add books to author
        dddSaved.getAuthors().add(ericSaved);
        noEJBSaved.getAuthors().add(rodSaved);


        //persist the data
        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
    // save repositories
        System.out.println( "************************Started in Bootstrap******************************" );
        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());


    }



}
