package com.jf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jf.pojo.book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface bookDao  extends BaseMapper<book>{

}
