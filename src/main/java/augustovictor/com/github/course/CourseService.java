package augustovictor.com.github.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getCourses() {
		return Arrays.asList(
              new Course(1, "Course 1", "Desc course 1")
          );
	}
	
	public Course getCourse(Integer id) {
		return this.courseRepository.findOne(id);
	}
}
