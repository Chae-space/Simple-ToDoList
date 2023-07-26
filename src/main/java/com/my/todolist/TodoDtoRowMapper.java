package com.my.todolist;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class TodoDtoRowMapper implements RowMapper<TodoDto> {
    @Override
    public TodoDto mapRow(ResultSet rs, int rowNum) throws SQLException {

        TodoDto todoDto = new TodoDto(0,"",false);

        todoDto.setId(rs.getInt("id"));
        todoDto.setContent(rs.getString("content"));
        todoDto.setDone(rs.getBoolean("done"));

        return todoDto;
    }
}