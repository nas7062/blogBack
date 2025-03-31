package com.blog.kms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blog.kms.dto.CategoryPostCount;
import com.blog.kms.dto.Post;
import com.blog.kms.service.PostService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin("http://localhost:5173")
public class PostController {

	@Autowired
	private PostService postService;
	
	@GetMapping("getAllPost")
	public ResponseEntity<List<Post>> getAllPost() {
	    try {
	        // 서비스에서 모든 게시글을 조회
	        List<Post> posts = postService.getAllPost();
	        System.out.println(posts);
	        // 정상적으로 조회한 게시글 리스트를 200 OK 상태로 반환
	        return ResponseEntity.ok(posts);
	    } catch (Exception e) {
	        // 서버 에러 발생 시 500 상태 코드 반환
	        return ResponseEntity.status(500).build();
	    }
	}
	
	@PostMapping("addPost")
	public ResponseEntity<String> addPosts(@RequestBody Post post) {
	    try {
	        postService.addPost(post);
	        return ResponseEntity.ok("글 작성완료");
	    } catch (Exception e) {
	        // 서버 에러 발생 시 500 상태 코드 반환
	    	  e.printStackTrace();
	        return ResponseEntity.status(500).build();
	    }
	}
	
	@GetMapping("getPostByCategory/{category}")
	public ResponseEntity<List<Post>> getPostByCategory(@PathVariable String category) {
		try {
	        // 서비스에서 모든 게시글을 조회
	        List<Post> posts = postService.getPostByCategory(category);
	        System.out.println(posts);
	        // 정상적으로 조회한 게시글 리스트를 200 OK 상태로 반환
	        return ResponseEntity.ok(posts);
	    } catch (Exception e) {
	        // 서버 에러 발생 시 500 상태 코드 반환
	        return ResponseEntity.status(500).build();
	    }
	}
	
	@GetMapping("getCategoryAll")
	public ResponseEntity<List<CategoryPostCount>> getCategoryAll() {
		 try {
			 List<CategoryPostCount> category  =postService.getCategoryAll();
			 System.out.println(category);
		        return ResponseEntity.ok(category);
		    } catch (Exception e) {
		        // 서버 에러 발생 시 500 상태 코드 반환
		    	  e.printStackTrace();
		        return ResponseEntity.status(500).build();
		    }
	}
	
	
}
