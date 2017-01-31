package net.eviera.pruebas.springboot.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourceRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);  //find + By + prop (findByName) | find + By + propClass + prop (findByTopicId)

}
