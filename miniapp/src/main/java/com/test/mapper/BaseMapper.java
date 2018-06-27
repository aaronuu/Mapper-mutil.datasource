package com.test.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by zhangyu on 2018/1/12.<br>
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
