package com.mahabirgupta.springboot.learnjpaandhibernate.course.jdbc;

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
                            values(1, 'Learn AWS', 'Udemy');
                                        
                    """;

    //    Execute a query
    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
