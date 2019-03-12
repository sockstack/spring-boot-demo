package com.example.demo.entity;

import javax.persistence.*;

@Table(name = "article_tag")
public class ArticleTag {
    /**
     * 文章id
     */
    @Column(name = "articale_id")
    private Integer articaleId;

    /**
     * 标签id
     */
    @Column(name = "tag_id")
    private Integer tagId;

    public ArticleTag(Integer articaleId, Integer tagId) {
        this.articaleId = articaleId;
        this.tagId = tagId;
    }

    public ArticleTag() {
        super();
    }

    /**
     * 获取文章id
     *
     * @return articale_id - 文章id
     */
    public Integer getArticaleId() {
        return articaleId;
    }

    /**
     * 设置文章id
     *
     * @param articaleId 文章id
     */
    public void setArticaleId(Integer articaleId) {
        this.articaleId = articaleId;
    }

    /**
     * 获取标签id
     *
     * @return tag_id - 标签id
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 设置标签id
     *
     * @param tagId 标签id
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}