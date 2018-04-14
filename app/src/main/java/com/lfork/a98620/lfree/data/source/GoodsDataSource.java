package com.lfork.a98620.lfree.data.source;

import com.lfork.a98620.lfree.data.DataSource;
import com.lfork.a98620.lfree.data.entity.Category;
import com.lfork.a98620.lfree.data.entity.Goods;
import com.lfork.a98620.lfree.data.entity.GoodsDetailInfo;

import java.util.List;

/**
 * Created by 98620 on 2018/3/23.
 **/

public interface GoodsDataSource extends DataSource {
    void getGoodsList(GeneralCallback<List<Goods>> callback, String cursor, int categoryId);

    void getCategories(GeneralCallback<List<Category>> callback);

    void refreshData();

    void getGoods(GeneralCallback<GoodsDetailInfo> callback, int goodsId);

    void uploadGoods(GeneralCallback<String> callback, Goods g);

}