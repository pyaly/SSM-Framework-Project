package swust.edu.cn.postdoctors.dao;

import swust.edu.cn.postdoctors.model.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer artiId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer artiId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}