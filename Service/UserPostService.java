package com.example.demo.Service;

import com.example.demo.Entity.UserPost;
import com.example.demo.Repository.UserPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserPostService {

    private final UserPostRepository userPostRepository;

    @Autowired
    public UserPostService(UserPostRepository userPostRepository) {
        this.userPostRepository = userPostRepository;
    }


    public ArrayList<UserPost> AddNewPost(UserPost userPost){
        userPostRepository.save(userPost);
        //retrievePostFromDB();
        ArrayList<UserPost> result = retrievePostFromDB();
        return result;
    }

    public ArrayList<UserPost> retrievePostFromDB(){
        ArrayList<UserPost> result = userPostRepository.findAll();
        return result;
    }

    public ArrayList<UserPost> deletePostFromDB(UUID postID){
        userPostRepository.deleteById(postID);

        ArrayList<UserPost> result =  retrievePostFromDB();
        return result;
    }



}
