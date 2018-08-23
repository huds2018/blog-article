package com.hds.article.service.impl;

import com.hds.article.apiModel.ArticleRequest;
import com.hds.article.dao.ArticleMapper;
import com.hds.article.model.Article;
import com.hds.article.service.ArticleService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by admin on 2018/8/16.
 */
@Controller
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper mapper;

    @Override
    public Article getArticleById(@RequestBody ArticleRequest request) {
        Article article = mapper.getArticleById(request.getArticleId());
        return article;
    }
}
