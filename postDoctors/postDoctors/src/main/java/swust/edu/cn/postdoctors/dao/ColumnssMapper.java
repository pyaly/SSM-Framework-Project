package swust.edu.cn.postdoctors.dao;

import swust.edu.cn.postdoctors.model.Columnss;

public interface ColumnssMapper {
    int deleteByPrimaryKey(Integer colmId);

    int insert(Columnss record);

    int insertSelective(Columnss record);

    Columnss selectByPrimaryKey(Integer colmId);

    int updateByPrimaryKeySelective(Columnss record);

    int updateByPrimaryKeyWithBLOBs(Columnss record);

    int updateByPrimaryKey(Columnss record);
}