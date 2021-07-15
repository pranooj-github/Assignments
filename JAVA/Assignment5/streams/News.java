package streams;

public class News {
	int newsid;
	String postedByUser,commentedByuser,comment;
	
	public News(int newsid, String postedByUser, String commentedByuser, String comment) {
		super();
		this.newsid = newsid;
		this.postedByUser = postedByUser;
		this.commentedByuser = commentedByuser;
		this.comment = comment;
	}
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentedByuser() {
		return commentedByuser;
	}
	public void setCommentedByuser(String commentedByuser) {
		this.commentedByuser = commentedByuser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsid=" + newsid + ", postedByUser=" + postedByUser + ", commentedByuser=" + commentedByuser
				+ ", comment=" + comment + "]";
	}
	
	
}
