package com.example.demo18;

import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

import javax.websocket.server.ServerEndpoint;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@SpringBootApplication
//@ServerEndpoint("/websocket/{userName}")
//@EnableWebSocketMessageBroker
//@EnableWebSocket3
public class Demo18Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo18Application.class, args);
        System.out.println(12);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        String date = sdf.format(LocalDate.now().toString());
        String date2 = sdf.format(new Date());
//        System.out.println(date);
//        System.out.println(LocalDate.now().format().toString());
        System.out.println("1:"+new Date());
        System.out.println("2:"+LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        try {
            String fileName =  new String(("固定资产").getBytes("UTF-8"),"ISO-8859-1") + ".xlsx";
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String str = "123456789";
        System.out.println(LocalDateTime.now());
        System.out.println(str.substring(str.length()-4,str.length()));
        System.out.println((Duration.between(LocalDateTime.now(),LocalDateTime.now().plusDays(1).plusMinutes(5)).getSeconds()+1)%60);
        System.out.println(LocalDateTime.now().isAfter(LocalDateTime.now().plusMinutes(5)));
//        LocalDateTime d1=LocalDateTime.of(2021,4,29,1,46,40);
//        LocalDateTime d2=LocalDateTime.of(2021,4,29,3,26,30);
//        Duration d3 = Duration.between(d1, d2);
//        System.out.println(d2.isBefore(d1));
//        System.out.println(d3.toHours());
//        System.out.println(d3.toMinutes()%60);
//        System.out.println(ChronoUnit.HOURS.between(d1,d2));
//        System.out.println(ChronoUnit.MINUTES.between(d1,d2));
//        System.out.println(d1.until(d2,ChronoUnit.DAYS));
//        System.out.println(d1.until(d2,ChronoUnit.HOURS));
//        System.out.println(d1.until(d2,ChronoUnit.MINUTES));
        StringBuffer str1=new StringBuffer();
        String str11=null;
        String str2 = "";
        String str3 = " ";
        System.out.println(str1.append("cccddd"));
        System.out.println(str1.insert(1,"eee"));
        System.out.println(str11+"cccddd");
        if(StrUtil.isNotBlank(str1)){
            System.out.println(1);
        }
        if(StrUtil.isNotEmpty(str1)){
            System.out.println(2);
        }
        if(StrUtil.isNotBlank(str2)){
            System.out.println(3);
        }
        if(StrUtil.isNotEmpty(str2)){
            System.out.println(4);
        }
        if(StrUtil.isNotBlank(str3)){
            System.out.println(5);
        }
        if(StrUtil.isNotEmpty(str3)){
            System.out.println(6);
        }
        System.out.println(str1+str2);
    }

}
