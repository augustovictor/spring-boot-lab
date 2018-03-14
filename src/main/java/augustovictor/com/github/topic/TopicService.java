package augustovictor.com.github.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("1", "Spring framework1", "Spring description1"),
			new Topic("2", "Spring framework2", "Spring description2"),
			new Topic("3", "Spring framework3", "Spring description3"),
			new Topic("4", "Spring framework4", "Spring description4")
			));
	
	public List<Topic> getTopics() {
		return this.topics;
	}

	public Topic getTopic(String id) {
		return topics
				.stream()
				.filter(t -> t.getId().equals(id))
				.findFirst()
				.get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
}
