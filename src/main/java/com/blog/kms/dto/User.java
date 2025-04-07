package com.blog.kms.dto;

public class User {
	
	private int id;
	private String nickname,email,password,descript,profileImage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String nickname, String email, String password, String descript, String profileImage) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.email = email;
		this.password = password;
		this.descript = descript;
		this.profileImage = profileImage;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nickname=" + nickname + ", email=" + email + ", password=" + password
				+ ", descript=" + descript + ", profileImage=" + profileImage + "]";
	}
	
}
