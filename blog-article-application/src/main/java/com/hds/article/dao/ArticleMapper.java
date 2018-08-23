package com.hds.article.dao;

import com.hds.article.model.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by admin on 2018/8/21.
 */
@Mapper
public interface ArticleMapper {
    Article getArticleById(String id);
}
