package augustovictor.com.github.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import augustovictor.com.github.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	public CourseService courseService;
	
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getCourses(@PathVariable String topicId) {
		return this.courseService.getCourses(topicId);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{title}")
	public List<Course> getCoursesByTitle(@PathVariable String topicId) {
		return this.courseService.getCourses(topicId);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String topicId, @PathVariable Integer id) {
		return this.courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
	public void addCourse(@PathVariable String topicId, @RequestBody Course course) {
		course.setTopic(new Topic(topicId, "", ""));
		this.courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}courses/{id}")
	public void updateCourse(@PathVariable String topicId, @PathVariable Integer id, @RequestBody Course course) {
		this.courseService.updateCourse(topicId, id, course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String topicId, @PathVariable Integer id) {
		this.courseService.delete(topicId, id);
	}
}
