package com.example.easyexcle;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class EasyExcelTest {
    public static void main(String[] args){
        String file="E:\\a.xlsx";
       // EasyExcel.write(file,Demo.class).sheet("学生列表").doWrite(getData());
        EasyExcel.read(file,Demo.class,new EasyListener()).sheet("学生列表").doRead();
    }
    public static List<Demo> getData(){
        List<Demo> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            String name="Lisy"+i;
            String sex=i%2==0?"b":"g";
            Demo demo=new Demo(name,sex);
            list.add(demo);
        }
        return list;
    }
}
