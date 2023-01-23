package com.example.LibraryManagementSystem.Repository;

import com.example.LMSbackend.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {

}
