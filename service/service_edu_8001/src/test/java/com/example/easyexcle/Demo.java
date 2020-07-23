package com.example.easyexcle;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demo {
    @ExcelProperty("姓名")
    String name;
    @ExcelProperty("性别")
    String sex;
}
