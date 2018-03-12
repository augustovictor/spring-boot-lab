package augustovictor.com.github.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return Arrays.asList(
				new Topic("1", "Spring framework1", "Spring description1"),
				new Topic("2", "Spring framework2", "Spring description2"),
				new Topic("3", "Spring framework3", "Spring description3"),
				new Topic("4", "Spring framework4", "Spring description4")
				);
	}
}
