package com.stream;

public class News {

	int newsId;
	String postedbyUser , commentedByUser , comment;
	
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedbyUser() {
		return postedbyUser;
	}
	public void setPostedbyUser(String postedbyUser) {
		this.postedbyUser = postedbyUser;
	}
	public String getCommentedByUser() {
		return commentedByUser;
	}
	public void setCommentedByUser(String commentedByUser) {
		this.commentedByUser = commentedByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public News(int newsId, String postedbyUser, String commentedByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedbyUser = postedbyUser;
		this.commentedByUser = commentedByUser;
		this.comment = comment;
	}
	public News() {
		super();
		
	}
	
	
}
