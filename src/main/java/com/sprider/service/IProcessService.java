package com.sprider.service;

import com.sprider.entity.Page;
import org.htmlcleaner.XPatherException;

import java.io.IOException;

/**
 * Created by Administrator on 2016/11/30.
 * 页面解析方法
 */
public interface IProcessService {

    public void process(Page page) throws XPatherException, IOException;
}
