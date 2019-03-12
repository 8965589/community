package com.ander.community.controller;

import com.ander.community.models.Post;
import com.ander.community.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2019/3/12 12:17.
 */
@RestController
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("/postTest")
    public ResponseEntity postTest(@RequestBody Post post) {
        postService.test(post);
        return ResponseEntity.ok().build();
    }

}
