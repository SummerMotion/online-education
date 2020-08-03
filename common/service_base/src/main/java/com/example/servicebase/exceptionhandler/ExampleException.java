package com.example.servicebase.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor  //生成有参数构造方法
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)//生成无参数构造
public class ExampleException extends RuntimeException {
    private Integer code;//状态码
    private String msg;//异常信息
}
