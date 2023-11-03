package com.bezahive.sbwbooks.domain;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
// add programmer comments
/**
 * Zabdiel Arenas 2023
 * https://github.com/Zabdieljr/sbwBooks
 */

// add Entity annotation to make this class a JPA entity
@Entity
//add entity auditing listener annotation
@EntityListeners(AuditingEntityListener.class)
// add @Table annotation to specify the table name
@Table(name = "books")
public class Book {

    // add Id annotation to make this field the primary key
    @Id
    // add GeneratedValue annotation to generate the value of the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // add Column annotation to specify the column name
    @Column(name = "id")
    private Long id;

    // private String title and ibsn
    // add Column annotation to specify the column name
    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;


    //add Temporal TimeStamp annotation and a @CreatedDate annotation to specify the createdDate column name
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdDate;

    // add ManyToMany annotation mapped by authors
    @ManyToMany
    // add JoinTable annotation to specify the join table name
    @JoinTable(name = "book_author", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))

    private Set<Author> authors= new HashSet<>();



    //add getter and setter for authors
    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    // add default constructor
    public Book() {
    }
    // add parameterized constructor
    public Book(Long id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
    }
    // add getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    // add toString method
    @Override
    public String toString() {
        return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + "]";
    }
    // add equals and hashCode methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Book))
            return false;
        return id != null && id.equals(((Book) obj).getId());
    }

}
