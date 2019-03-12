package com.example.demo.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "categories")
public class Category {
    @Id
    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 是否菜单显示
     */
    @Column(name = "is_menu")
    private Boolean isMenu;

    /**
     * 是否显示
     */
    @Column(name = "is_show")
    private Boolean isShow;

    /**
     * 是否侧边栏显示
     */
    @Column(name = "is_slide")
    private Boolean isSlide;

    /**
     * 是否可用
     */
    private Boolean available;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    public Category(Integer id, String name, Boolean isMenu, Boolean isShow, Boolean isSlide, Boolean available, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.isMenu = isMenu;
        this.isShow = isShow;
        this.isSlide = isSlide;
        this.available = available;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Category() {
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
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取是否菜单显示
     *
     * @return is_menu - 是否菜单显示
     */
    public Boolean getIsMenu() {
        return isMenu;
    }

    /**
     * 设置是否菜单显示
     *
     * @param isMenu 是否菜单显示
     */
    public void setIsMenu(Boolean isMenu) {
        this.isMenu = isMenu;
    }

    /**
     * 获取是否显示
     *
     * @return is_show - 是否显示
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * 设置是否显示
     *
     * @param isShow 是否显示
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取是否侧边栏显示
     *
     * @return is_slide - 是否侧边栏显示
     */
    public Boolean getIsSlide() {
        return isSlide;
    }

    /**
     * 设置是否侧边栏显示
     *
     * @param isSlide 是否侧边栏显示
     */
    public void setIsSlide(Boolean isSlide) {
        this.isSlide = isSlide;
    }

    /**
     * 获取是否可用
     *
     * @return available - 是否可用
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * 设置是否可用
     *
     * @param available 是否可用
     */
    public void setAvailable(Boolean available) {
        this.available = available;
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
}