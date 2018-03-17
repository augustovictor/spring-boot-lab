package augustovictor.com.github.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		this.courseRepository
				.findByTopicId(topicId)
				.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(Integer id) {
		return this.courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		this.courseRepository.save(course);
	}

	public void updateCourse(String topicId, Integer id, Course course) {
		this.courseRepository.save(course);
	}

	public void delete(String topicId, Integer id) {
		this.courseRepository.delete(id);
	}

	public List<Course> getCoursesByTitle(String title) {
		return this.courseRepository.findByTitle(title);
	}
}
