package com.test.mapper.aa;

import com.test.entity.MemberInfoEntity;
import com.test.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface MemberInfoEntityMapper extends BaseMapper<MemberInfoEntity> {

    @Select("SELECT * FROM member_info WHERE member_id = #{member_id}")
    @Results(id = "member_info", value = {
            @Result(property = "memberId", column = "member_id")

    })
    MemberInfoEntity findMemberInfoEntityByMemberId(@Param("member_id") String memberId);

}
