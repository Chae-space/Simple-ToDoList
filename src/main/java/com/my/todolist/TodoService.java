package com.my.todolist;

// import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    JdbcTemplate jt;

    public List<TodoDto> readAll() {

        var list = jt.query("SELECT * from todolist", new TodoDtoRowMapper());
        return list;
    }

    public void createToDo(String content) {

        jt.update("insert into todolist(content) values(?)", content);
    }

    public TodoDto updateToDo(Integer id) {

        jt.update("update todolist set done = !done where id =?", id);
        var todo = jt.queryForObject("select * from todolist where id = ?", new TodoDtoRowMapper(), id);
        return todo;
    }

    public boolean deleteToDo(Integer id) {

        jt.update("delete from todolist where id = ?", id);
        return true;
    }
}
