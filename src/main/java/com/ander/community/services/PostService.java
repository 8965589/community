package com.ander.community.services;

import com.ander.community.mappers.PostMapper;
import com.ander.community.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date 2019/3/12 12:19.
 */
@Service
public class PostService {
    @Autowired
    PostMapper postMapper;
    public void test(Post post) {
        postMapper.insertSelective(post);
    }
}
