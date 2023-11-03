package com.bezahive.sbwbooks.domain;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
    * Zabdiel Arenas 2023
     * https://github.com/Zabdieljr/sbwBooks
    */
@Entity
//add entity auditing listener annotation
@EntityListeners(AuditingEntityListener.class)
// add table annotation
@Table(name = "author")


public class Author {

    // add id annotation
    @Id
    // add generated value annotation
    @GeneratedValue(strategy = GenerationType.AUTO)
    // add column annotation
    @Column(name = "author_id")
    private Long id;

    // add column annotation
    @Column(name = "first_name")
    private String firstName;

    // add column annotation
    @Column(name = "last_name")
    private String lastName;

    //add Temporal createdDate timestamp annotation
    @Column(name = "created_date", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    // add createdDate field
    // add CreatedDate annotation
    @CreatedDate
    private Date createdDate;

    // author to books JPA mapping
    // add ManyToMany annotation mapped by authors
    @ManyToMany(mappedBy = "authors", cascade = CascadeType.ALL)
    private Set<Book> books = new HashSet<>();

    // add getter and setter for books
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    // add default constructor


        public Author() {
    }
    // add parameterized constructor
    public Author(Long id, String firstName, String lastName) {
        // add this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // add getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        return "Author [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + "]";
    }

    // add equals and hashcode methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Author))
            return false;
        return id != null && id.equals(((Author) obj).getId());
    }



}
