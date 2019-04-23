package com.guigu.emp.dao;

import com.guigu.emp.pojo.Emp;
import com.guigu.emp.pojo.EmpExample;
import com.guigu.emp.pojo.QueryVO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EmpMapper {
    int countByExample(EmpExample example);

    int deleteByExample(EmpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);
    int deleteEmp(int[] id);
    List<Emp> selectByExample(EmpExample example);
    List<Emp> select(QueryVO vo);
    int count(QueryVO vo);
    Emp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
    
    int Empadd(Emp record);
}