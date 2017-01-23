package com.sprider.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by Administrator on 2016/11/30.
 * 页面下载工具类
 * @author 2016-11-30
 */
public class PageDownLoadUtil {

    public static String getPageContent(String url) throws IOException {
        HttpClientBuilder builder= HttpClients.custom();
        CloseableHttpClient client=builder.build();
        HttpGet request=new HttpGet(url);
        CloseableHttpResponse response=client.execute(request);
        String content="";
        HttpEntity entety=response.getEntity();
        content=EntityUtils.toString(entety);//获取页面内容
        return content;
    }

    public static void main(String[] args) throws IOException {
        String url="http://www.iqiyi.com/a_19rrh9zcq1.html";
        String content=PageDownLoadUtil.getPageContent(url);
        System.out.println(content);
    }
}
