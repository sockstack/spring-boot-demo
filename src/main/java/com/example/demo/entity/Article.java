package com.example.demo.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "articles")
public class Article {
    @Id
    private Integer id;

    private String title;

    private String desc;

    /**
     * 分类id
     */
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    private String content;

    public Article(Integer id, String title, String desc, Integer categoryId, Date createdAt, Date updatedAt, String content) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.categoryId = categoryId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.content = content;
    }

    public Article() {
        super();
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * 获取分类id
     *
     * @return category_id - 分类id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置分类id
     *
     * @param categoryId 分类id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}