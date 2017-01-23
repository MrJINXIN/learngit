package com.sprider.start;

import com.sprider.entity.Page;
import com.sprider.service.IDownLoadService;
import com.sprider.service.IProcessService;
import com.sprider.service.impl.HttpClientDownLoadService;
import com.sprider.service.impl.AQYProcessService;
import org.htmlcleaner.XPatherException;

import java.io.IOException;

/**
 * 爬虫执行入口类（电视剧）
 * Created by Administrator on 2016/11/30.
 */
public class StartDSJCount {
    private IDownLoadService downLoadService;
    private IProcessService processService;//解析页面


    public IProcessService getProcessService() {
        return processService;
    }

    public void setProcessService(IProcessService processService) {
        this.processService = processService;
    }

    public IDownLoadService getDownLoadService() {
        return downLoadService;
    }

    public void setDownLoadService(IDownLoadService downLoadService) {
        this.downLoadService = downLoadService;
    }

    public static void main(String[] args) throws IOException, XPatherException {
        StartDSJCount dsj=new StartDSJCount();
        dsj.setDownLoadService(new HttpClientDownLoadService());
        //下载页面
        String url="http://www.iqiyi.com/a_19rrh9zcq1.html";
        Page page=dsj.downloadPage(url);
        System.out.println(page.getContent());
        //页面解析
        dsj.setProcessService(new AQYProcessService());
        dsj.processPage(page);
    }

    /**
     * 页面解析
     * */
    public void processPage(Page page) throws XPatherException, IOException {
        this.processService.process(page);
    }

    public Page downloadPage(String url) throws IOException {
        return this.downLoadService.downlad(url);
    }
}
