package com.leaf.account.ui;

import com.leaf.account.model.UploadInfo;

import cn.bmob.v3.BmobQuery;

/**
 * Created by Weiping on 2016/1/27.
 */

public class MyQuery {

    private int task;
    public BmobQuery<UploadInfo> query;

    public int getTask() {
        return task;
    }

    public void setTask(int task) {
        this.task = task;
    }
}
