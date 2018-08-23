package com.hds.article.apiModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by admin on 2018/8/21.
 */
@ApiModel(value = "文章请求实体", description = "文章查询请求实体")
public class ArticleRequest {
    @ApiModelProperty(value = "文章id")
    private String articleId;
    @ApiModelProperty(value = "发布时间")
    private String releaseTime;

    public ArticleRequest(String articleId, String releaseTime) {
        this.articleId = articleId;
        this.releaseTime = releaseTime;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public ArticleRequest() {
    }
}
