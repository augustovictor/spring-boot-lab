package augustovictor.com.github.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	public CourseService courseService;
	
	@RequestMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}
	
	@RequestMapping("/courses/{id}")
	public Course getCourse(@PathVariable Integer id) {
		return this.courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/courses")
	public void addCourse(@RequestBody Course course) {
		this.courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/courses/{id}")
	public void updateCourse(@PathVariable Integer id, @RequestBody Course course) {
		this.courseService.updateCourse(id, course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/courses/{id}")
	public void deleteCourse(@PathVariable Integer id) {
		this.courseService.delete(id);
	}
}
