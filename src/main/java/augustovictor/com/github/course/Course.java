package augustovictor.com.github.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import augustovictor.com.github.topic.Topic;

@Entity
public class Course {
	
	@Id
	private int id;
	private String title;
	private String description;
	
	@ManyToOne
	private Topic topic;
	
	public Course() {}
	
	public Course(int id, String title, String description, String topicId) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.topic = new Topic(topicId, "New topic", "New topic desc");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
