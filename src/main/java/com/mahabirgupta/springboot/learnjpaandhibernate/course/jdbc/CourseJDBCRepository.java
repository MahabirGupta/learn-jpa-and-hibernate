package com.mahabirgupta.springboot.learnjpaandhibernate.course.jdbc;

import com.mahabirgupta.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//Create a package and class for Spring JDBC
@Repository //something which communicates with db
public class CourseJDBCRepository {
    //    Fire queries to db using Spring JDBC
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY =
//            text block
                    """
                            insert into course(id, name, author)
//                            values(1, 'Learn AWS', 'Udemy');
                            values(?, ?, ?); //use question marks instead of passing hard code values
                            
                                        
                    """;
    private static String DELETE_QUERY =
//            text block
            """
                    delete from course 
                    where id=?
                    
                                
            """;
    //    Execute a query
    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }
    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY,id);
    }
}
