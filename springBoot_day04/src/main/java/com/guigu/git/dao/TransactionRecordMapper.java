package com.guigu.git.dao;

import com.guigu.git.pojo.QueryVO;
import com.guigu.git.pojo.TransactionRecord;
import com.guigu.git.pojo.TransactionRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TransactionRecordMapper {
    int countByExample(TransactionRecordExample example);

    int deleteByExample(TransactionRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TransactionRecord record);

    int insertSelective(TransactionRecord record);

    List<TransactionRecord> selectByExample(TransactionRecordExample example);
    List<TransactionRecord> select(QueryVO v);
    int count(QueryVO v);
    TransactionRecord selectByPrimaryKey(Integer id);
    
    int updateByExampleSelective(@Param("record") TransactionRecord record, @Param("example") TransactionRecordExample example);

    int updateByExample(@Param("record") TransactionRecord record, @Param("example") TransactionRecordExample example);

    int updateByPrimaryKeySelective(TransactionRecord record);

    int updateByPrimaryKey(TransactionRecord record);
}