package com.binbinsheng.xfg.dev.tech.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Response<T> implements Serializable {
    private String code;
    private String info;
    private T data;
}
