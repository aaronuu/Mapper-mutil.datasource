package com.test.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by hackerdom on 2018.6.27.<br>
 */
@Table(name = "task_info")
@Data
public class TaskInfoEntity implements Serializable {

    @Id
    @Column(name = "task_id")
    private String taskId;

}
