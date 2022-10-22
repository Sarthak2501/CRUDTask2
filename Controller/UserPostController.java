package com.example.demo.Controller;


import com.example.demo.Entity.UserPost;
import com.example.demo.Service.UserPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/user-post")
public class UserPostController {

    private final UserPostService userPostService;

    @Autowired
    public UserPostController(UserPostService userPostService) {
        this.userPostService = userPostService;
    }


    @PostMapping(path = "/save")
    public ArrayList<UserPost> uploadPost(@RequestBody UserPost body){
        ArrayList<UserPost> result =  userPostService.AddNewPost(body);
        return result;
    }

    @GetMapping(path = "/getPost")
    public ArrayList<UserPost> retrieveAllPost(){
        ArrayList<UserPost> result =  userPostService.retrievePostFromDB();
        return result;
    }

    @DeleteMapping(path = "/delete")
    public ArrayList<UserPost> deleteParticularPost(@PathVariable("postID")UUID postID){
        ArrayList<UserPost> result = userPostService.deletePostFromDB(postID);
        return result;
    }


}
