package com.golong.bus.mapper;

import com.golong.bus.model.Tj_CodeScanbyBus;
import com.golong.bus.model.Tj_CodeScanbyBusExample;
import com.golong.bus.model.Tj_CodeScanbyBusWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tj_CodeScanbyBusMapper {
    long countByExample(Tj_CodeScanbyBusExample example);

    int deleteByExample(Tj_CodeScanbyBusExample example);

    int deleteByPrimaryKey(String fldTradeNo);

    int insert(Tj_CodeScanbyBusWithBLOBs record);

    int insertSelective(Tj_CodeScanbyBusWithBLOBs record);

    List<Tj_CodeScanbyBusWithBLOBs> selectByExampleWithBLOBs(Tj_CodeScanbyBusExample example);

    List<Tj_CodeScanbyBus> selectByExample(Tj_CodeScanbyBusExample example);

    Tj_CodeScanbyBusWithBLOBs selectByPrimaryKey(String fldTradeNo);

    int updateByExampleSelective(@Param("record") Tj_CodeScanbyBusWithBLOBs record, @Param("example") Tj_CodeScanbyBusExample example);

    int updateByExampleWithBLOBs(@Param("record") Tj_CodeScanbyBusWithBLOBs record, @Param("example") Tj_CodeScanbyBusExample example);

    int updateByExample(@Param("record") Tj_CodeScanbyBus record, @Param("example") Tj_CodeScanbyBusExample example);

    int updateByPrimaryKeySelective(Tj_CodeScanbyBusWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(Tj_CodeScanbyBusWithBLOBs record);

    int updateByPrimaryKey(Tj_CodeScanbyBus record);
}