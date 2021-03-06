package com.learn.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.learn.springboot.entity.Loan;
import com.learn.springboot.entity.LoanExample;

public interface LoanMapper {
    int countByExample(LoanExample example);

    int deleteByExample(LoanExample example);

    int deleteByPrimaryKey(String id);

    int insert(Loan record);

    int insertSelective(Loan record);

    List<Loan> selectByExampleWithBLOBs(LoanExample example);

    List<Loan> selectByExample(LoanExample example);

    Loan selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Loan record, @Param("example") LoanExample example);

    int updateByExampleWithBLOBs(@Param("record") Loan record, @Param("example") LoanExample example);

    int updateByExample(@Param("record") Loan record, @Param("example") LoanExample example);

    int updateByPrimaryKeySelective(Loan record);

    int updateByPrimaryKeyWithBLOBs(Loan record);

    int updateByPrimaryKey(Loan record);
}