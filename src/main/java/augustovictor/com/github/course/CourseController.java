package augustovictor.com.github.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	public CourseService courseService;
	
	@RequestMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}
}
