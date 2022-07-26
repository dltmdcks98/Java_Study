package com.lsc.jul26nw.main;

import org.xmlpull.v1.XmlPullParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


//
public class Main {
    public static void main(String[] args) {
        String addr = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4141062000";
        try{
            URL u= new URL(addr);
            HttpURLConnection huc = (HttpURLConnection) u.openConnection();

            InputStream is = huc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String line = null;

            //외부 라이브러리 사용
            XmlPullParser xxp;
            while((line = br.readLine()) != null){

                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
