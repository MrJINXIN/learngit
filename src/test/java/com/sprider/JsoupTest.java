package com.sprider;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/1/15.
 */
public class JsoupTest {
    private Document doc;
    private String html;
    private String fileurl="D:\\work\\sprider\\src\\test\\java\\com\\sprider\\Example Domain.html";
    private Element root;
    @Test
    public void test01(){
        html="<html><head><title>First parse</title></head>"
                + "<body><p>Parsed HTML into a doc.</p></body></html>";
        doc= Jsoup.parse(html);
        System.out.println(doc.toString());
    }

    @Test
    public void test02(){
        html="<div><p>Lorem ipsum.</p>";
       // doc=Jsoup.parseBodyFragment(html);
        doc= Jsoup.parse(html);
        Element element=doc.body();
        System.out.println(element.toString());
    }

    @Test
    public void test03() throws IOException {
        doc=Jsoup.connect("http://example.com/").get();
        String title=doc.title();
        System.out.println("title="+title);
        System.out.println(doc.toString());
    }


    @Test
    public void test04() throws IOException {
        doc=Jsoup.connect("http://example.com").data("query","java").userAgent("Mozilla").cookie("auth","token")
        .timeout(3000).post();
        System.out.println(doc);
    }

    @Test
    public void test05() throws IOException {
        File input=new File(fileurl);
        doc=Jsoup.parse(input,"utf-8","http://example.com/");
        System.out.print(doc.toString());
    }

    @Test
    public void test06() throws IOException {
        File input=new File(fileurl);
        doc=Jsoup.parse(input,"utf-8","http://example.com/");
        Element content=doc.getElementById("content");
        Elements links=content.getElementsByTag("a");
        for(Element link:links){
            String linkHref=link.attr("href");
            System.out.println("linkHref="+linkHref);
            String linkText=link.text();
            System.out.println("linkText="+linkText);
        }
    }

    @Test
    public void test07() throws IOException {
        File input=new File(fileurl);
        doc=Jsoup.parse(input,"utf-8","http://example.com/");
        Elements links=doc.select("a[href]");
        Elements pngs=doc.select("img[src$=.png]");
        Element masthe=doc.select("div.masthead").first();
        Elements resultLinks=doc.select("h3.r > a");
    }

    @Test
    public void test08(){
        html = "<p>An <a href='http://example.com/'><b>example</b></a> link.<div>2365487</div></p>";
        Document doc=Jsoup.parse(html);
        Element link=doc.select("a").first();
        String text=doc.body().text();
        System.out.println(text);
        String linkhref=link.attr("href");
        System.out.println(linkhref);
        String linktext=link.text();
        System.out.println(linktext);
        String linkOuterH=link.outerHtml();
        System.out.println("linkOuterH===>"+linkOuterH);
    }


    //处理URLS
    @Test
    public void test09() throws IOException {
        doc=Jsoup.connect("http://www.open-open.com").get();
        Element link=doc.select("a").first();
        String relHref=link.attr("href");
        System.out.println("relHref"+relHref);
        String absHref=link.attr("abs:href");
        System.out.println("absHref="+absHref);
        link.absUrl("href");
    }

}
