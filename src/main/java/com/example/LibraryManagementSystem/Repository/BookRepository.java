package com.example.LibraryManagementSystem.Repository;

import com.example.LMSbackend.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
