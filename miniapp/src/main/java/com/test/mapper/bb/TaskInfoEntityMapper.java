package com.test.mapper.bb;

import com.test.entity.TaskInfoEntity;
import com.test.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface TaskInfoEntityMapper extends BaseMapper<TaskInfoEntity> {

    @Select("SELECT * FROM task_info WHERE task_id = #{taskId}")
    @Results(id = "task_info", value = {
            @Result(property = "taskId", column = "task_id"),
            @Result(property = "taskGroup", column = "task_group"),
            @Result(property = "setDate", column = "set_date")
    })
    TaskInfoEntity findTaskInfoEntityByTaskId(@Param("taskId") String taskId);

}
