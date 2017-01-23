package com.sprider.service;

import com.sprider.entity.Page;

import java.io.IOException;

/**
 * 页面下载接口
 * Created by Administrator on 2016/11/30.
 */
public interface IDownLoadService {
    public Page downlad(String url) throws IOException;
}
