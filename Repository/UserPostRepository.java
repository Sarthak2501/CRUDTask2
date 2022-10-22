package com.example.demo.Repository;

import com.example.demo.Entity.UserPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserPostRepository extends JpaRepository<UserPost, UUID>{

    ArrayList<UserPost> findAll();
    UserPost save(UserPost post);

}
