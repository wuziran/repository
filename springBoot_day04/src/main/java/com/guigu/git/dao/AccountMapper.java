package com.guigu.git.dao;

import com.guigu.git.pojo.Account;
import com.guigu.git.pojo.AccountExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AccountMapper {
    int countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int deleteByPrimaryKey(String cardno);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(String cardno);
    int login(Account a);
    String findMoney(String cardno);
    int update(String cardno);
    int updateA(Account a);
    int updateB(Account a);
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);
    int update1(String cardno);
    int updateByPrimaryKey(Account record);
}