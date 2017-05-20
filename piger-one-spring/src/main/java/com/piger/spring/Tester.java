package com.piger.spring;

import org.omg.PortableInterceptor.INACTIVE;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by pigercc.liang on 2017/5/12.
 */
public class Tester {

    public static void main1(String[] args) {

        Map<Integer,String> map =new TreeMap<Integer, String>();

        map.put(5,"555");
        map.put(6,"666");
        map.put(3,"3333");
        System.out.println(map);

        List<String> sortList =new ArrayList<String>();
        int beforeValue=0;
        for(int key:map.keySet())
        {
            if(key>beforeValue)
            {
                sortList.add(0,map.get(key));
            }else
            {
                sortList.add(sortList.size(),map.get(key));
            }
            beforeValue=key;
        }

        List<String> list =new ArrayList<String>();
        list.add("22");
        list.add("11");
        list.add("33");
        System.out.println(list);

    }

    public static void main(String[] args) {

        List<Integer> list =new ArrayList<Integer>(5);

        list.add(101);
        list.add(150);
        list.add(99);
        list.add(100);
        Collections.sort(list,Collections.<Integer>reverseOrder());
        System.out.println(list);

        try
        {
            String a="0.1sf";
            int b =(int)(1/Double.valueOf(a));
            System.out.println(b);

            System.out.println((0 == 10%b));
        }catch (Exception e)
        {
            e.printStackTrace();
        }



    }
}
