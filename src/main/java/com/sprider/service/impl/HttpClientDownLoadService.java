package com.sprider.service.impl;

import com.sprider.entity.Page;
import com.sprider.service.IDownLoadService;
import com.sprider.util.PageDownLoadUtil;

import java.io.IOException;

/**
 * Created by Administrator on 2016/11/30.
 */
public class HttpClientDownLoadService implements IDownLoadService{
    public Page downlad(String url) throws IOException {
        Page page=new Page();
        page.setContent(PageDownLoadUtil.getPageContent(url));
        return page;
    }
}
