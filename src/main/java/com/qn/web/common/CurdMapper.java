package com.qn.web.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用mapper工具类
 * @author LLL
 */
public interface CurdMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
