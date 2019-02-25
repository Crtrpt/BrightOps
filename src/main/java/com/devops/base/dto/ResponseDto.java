package com.devops.base.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author jzx
 * @date 2019/01/31 11:05
 * @Description:
 */
@Data
public class ResponseDto<T> implements Serializable {
    Integer code;
    String msg;
    T data;
}
