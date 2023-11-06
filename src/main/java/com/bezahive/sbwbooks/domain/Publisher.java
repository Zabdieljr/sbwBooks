package com.bezahive.sbwbooks.domain;

// add entity annotation

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.HashSet;
import java.util.Set;

@Entity
// add table annotation
@Table(name = "publisher")

// add entity auditing listener annotation
@EntityListeners(AuditingEntityListener.class)
public class Publisher {

    //
    @Id
    // add generated value annotation
    @GeneratedValue(strategy = GenerationType.AUTO)
    // add column annotation
    @Column(name = "publisher_id")
        private Long id;
    // add publishername, address, city, state, zipCode
    @Column(name = "publisher_name")
    private String publisherName;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;

    @Column(name = "zip_code")
    private String zipCode;

// author to books JPA mapping
    // add OneToMany annotation mapped by books
    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL)
    private Set<Book> books = new HashSet<>();

  // add constructor
    public Publisher() {
    }

    public Publisher(Long id, String publisherName, String address, String city, String state, String zipCode, Set<Book> books) {
        this.id = id;
        this.publisherName = publisherName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.books = books;
    }
    // add getter and setter for books

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    // add hashcode and equals methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;
        // add id comparison not null
        return id != null ? id.equals(publisher.id) : publisher.id == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (publisherName != null ? publisherName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (books != null ? books.hashCode() : 0);
        return result;
    }

    // add toString method

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", books=" + books +
                '}';
    }
}
