package org.ibase4j.dao.sys;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.ibase4j.core.base.BaseMapper;
import org.ibase4j.model.sys.SysDic;

public interface SysDicMapper extends BaseMapper<SysDic> {
    List<Long> selectIdByMap(@Param("cm") Map<String, Object> params);
}