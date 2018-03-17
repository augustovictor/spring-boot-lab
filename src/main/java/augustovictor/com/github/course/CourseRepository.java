package augustovictor.com.github.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
	public List<Course> findByTitle(String title);
	public List<Course> findByTopicId(String id);
}
