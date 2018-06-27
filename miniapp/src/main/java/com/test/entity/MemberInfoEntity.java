package com.test.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by hackerdom on 2018.6.27.<br>
 */
@Table(name = "member_info")
@Data
public class MemberInfoEntity implements Serializable {

    @Id
    @Column(name = "member_id")
    private String memberId;

}
