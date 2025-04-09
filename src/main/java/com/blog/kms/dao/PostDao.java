package com.blog.kms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.blog.kms.dto.CategoryPostCount;
import com.blog.kms.dto.Post;

@Mapper
public interface PostDao {
	 List<Post> getAllPost() throws Exception;
	 List<CategoryPostCount> getCategoryAll() throws Exception;
	 void addPost(Post post) throws Exception;
	 List<Post> getPostByCategory(String category) throws Exception;
	 Post getPostById(Long  id) throws Exception;
}
