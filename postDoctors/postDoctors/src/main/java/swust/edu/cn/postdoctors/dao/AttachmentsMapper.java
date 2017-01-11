package swust.edu.cn.postdoctors.dao;

import swust.edu.cn.postdoctors.model.Attachments;

public interface AttachmentsMapper {
    int deleteByPrimaryKey(Integer attaId);

    int insert(Attachments record);

    int insertSelective(Attachments record);

    Attachments selectByPrimaryKey(Integer attaId);

    int updateByPrimaryKeySelective(Attachments record);

    int updateByPrimaryKeyWithBLOBs(Attachments record);

    int updateByPrimaryKey(Attachments record);
}