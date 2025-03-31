package com.blog.kms.dto;

public class CategoryPostCount {
	private String category;
	private int postCount;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPostCount() {
		return postCount;
	}
	public void setPostCount(int postCount) {
		this.postCount = postCount;
	}
	public CategoryPostCount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryPostCount(String category, int postCount) {
		super();
		this.category = category;
		this.postCount = postCount;
	}
	@Override
	public String toString() {
		return "CategoryPostCount [category=" + category + ", postCount=" + postCount + "]";
	}
	
}
