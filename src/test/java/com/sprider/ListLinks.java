package com.sprider;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.omg.CORBA.Object;

/**
 * Created by Administrator on 2017/1/15.
 */
public class ListLinks {
    public void linksTest(String[] args){
        Validate.isTrue(args.length==1,"usage:supply url to fetch");
        String url = args[0];
       // print("Fetching %s...", url);

    }


    public void print(String msa, Object... args){
        System.out.println(String.format(msa,args));
    }

    public  String trims(String s,int width){
        if (s.length()>width){
            return s.substring(0,width-1)+".";
        }else{
            return s;
        }
    }

}
