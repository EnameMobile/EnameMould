package com.ename.www.mould.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Yx on 2015/10/27.
 */
public class Http {
    public static final String CHARSET = "UTF_8";

    public static String get(String urlAddress) throws IOException {
        URL url = new URL(urlAddress);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("get");

       try {
           if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
               BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
               String inputLine;
               StringBuilder response = new StringBuilder();
               while ((inputLine = reader.readLine()) != null) {
                   response.append(inputLine);
               }
               reader.close();
               return response.toString();
           } else {
               throw new IOException("NetWork Error - response code: " + con.getResponseCode());
           }
       } finally {
           con.disconnect();
       }
    }
}
