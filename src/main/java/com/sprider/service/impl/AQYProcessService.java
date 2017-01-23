package com.sprider.service.impl;

import com.sprider.entity.Page;
import com.sprider.service.IProcessService;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/11/30.
 * 优酷页面解析实现类
 * 使用htmlcleaner
 */
public class AQYProcessService implements IProcessService {
    private Document doc;
    public void process(Page page) throws XPatherException, IOException {
       doc = Jsoup.parse(new File("D:\\work\\sprider\\src\\main\\java\\com\\sprider\\service\\impl\\AQIHtml.html"),"utf-8","http://www.iqiyi.com/a_19rrh9zcq1.html");
        page.setTvname(doc.select(".crumb-item > a").get(3).text());
        page.setAllnumber(doc.select(".playAll-def").text());//获取总播放量
        Elements upDownWraps=doc.select("#upDownWrap > a");
        page.setAgainstnumber(upDownWraps.get(1).text());//设置踩
        page.setSupportnumber(upDownWraps.get(0).text());//设置顶
        page.setCollectnumber(doc.select("#widget-playcount").get(0).text());
        page.setAllnumber(doc.select("#widget-playcount").get(0).text());
    }

    public static void main(String args[]) throws IOException, XPatherException {
        AQYProcessService apy=new AQYProcessService();
        apy.process(new Page());
    }

}
