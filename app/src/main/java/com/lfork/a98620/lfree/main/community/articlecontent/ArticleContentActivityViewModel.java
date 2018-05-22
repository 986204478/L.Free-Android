package com.lfork.a98620.lfree.main.community.articlecontent;

import android.app.Activity;

import com.lfork.a98620.lfree.base.BaseViewModel;
import com.lfork.a98620.lfree.data.DataSource;
import com.lfork.a98620.lfree.data.community.remote.CommunityRemoteDataSource;
import com.lfork.a98620.lfree.main.community.CommunityCallback;
import com.lfork.a98620.lfree.main.community.CommunityComment;
import com.lfork.a98620.lfree.main.community.CommunityFragmentItemViewModel;

import java.util.List;

public class ArticleContentActivityViewModel extends BaseViewModel {
    private Activity context;
    private int articleId;

    public ArticleContentActivityViewModel(Activity context, int articleId) {
        this.context = context;
        this.articleId = articleId;
    }

    public void loadData(CommunityCallback callback, boolean isRefresh) {
        if (articleId != -1) {
            CommunityRemoteDataSource.getINSTANCE().getCommentList(new DataSource.GeneralCallback() {
                @Override
                public void succeed(Object data) {
                    if (isRefresh) {
                        callback.callback(data, 3);
                    } else {
                        callback.callback(data, 1);
                    }
                }

                @Override
                public void failed(String log) {
                    callback.callback(null, 2);
                }
            }, articleId);
        } else {
            callback.callback(null, 2);
        }
    }
}
