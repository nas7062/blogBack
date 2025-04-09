package com.blog.kms.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.kms.dao.PostDao;
import com.blog.kms.dto.CategoryPostCount;
import com.blog.kms.dto.Post;

@Service
public class PostService {

	@Autowired
	private PostDao postDao;

	public List<Post> getAllPost() throws Exception {
		return postDao.getAllPost();
	}
	public List<CategoryPostCount> getCategoryAll() throws Exception {
		return postDao.getCategoryAll();
	}
	public void addPost(Post post) throws Exception {
		postDao.addPost(post);
	}
	public List<Post> getPostByCategory(String category) throws Exception {
		return postDao.getPostByCategory(category);
	}
	
	public Post getPostById(Long  id) throws Exception {
		return postDao.getPostById(id);
	}
	
}
