package com.example.easyexcle;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

public class EasyListener extends AnalysisEventListener<Demo> {
    @Override
    public void invoke(Demo demo, AnalysisContext analysisContext) {
        System.out.println(demo);
    }

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println(headMap);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("结果");
    }
}
