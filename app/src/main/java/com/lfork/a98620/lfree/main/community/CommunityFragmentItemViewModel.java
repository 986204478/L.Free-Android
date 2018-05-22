package com.lfork.a98620.lfree.main.community;

import android.content.Intent;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;

import com.lfork.a98620.lfree.base.BaseViewModel;
import com.lfork.a98620.lfree.userinfo.UserInfoActivity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CommunityFragmentItemViewModel extends BaseViewModel implements Serializable {
    private String article;
    private int articleId;
    private int publisherId;  //发布人id
    private String articleTime;
    private List<String> imageUriList;
    private String headImgUri;
    private String headName;

    public String getHeadImgUri() {
        return headImgUri;
    }

    public void setHeadImgUri(String headImgUri) {
        this.headImgUri = headImgUri;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(String articleTime) {
        this.articleTime = articleTime;
    }

    public List<String> getImageUriList() {
        return imageUriList;
    }

    public void setImageUriList(List<String> imageUriList) {
        this.imageUriList = imageUriList;
    }
}
