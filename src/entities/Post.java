package entities;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String contect;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<Comment>();
	
	public Post() {
		
	}

	public Post(Date moment, String title, String contect, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.contect = contect;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContect() {
		return contect;
	}

	public void setContect(String contect) {
		this.contect = contect;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getTitle() + "\n");
		sb.append(getLikes());
		sb.append(" Likes - ");
		sb.append(sdf.format(getMoment()) + "\n");
		sb.append(getContect() + "\n");
		sb.append("Comments: " + "\n");
		for(Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		
		
		return sb.toString();
	}

}
