package com.lggyx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 这是一个返回结果的类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    /**
     * 状态码 1 代表成功; 0 代表失败
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private Object data;
    /**
     * 增删改 成功返回结果
     */
    public static Result success() {
        return new Result(1, "success", null);
    }
    /**
     * 查询 成功返回结果
     */
    public static Result success(Object data) {
        return new Result(1, "success", data);
    }
    /**
     * 失败返回结果
     */
    public static Result error(String  msg) {
        return new Result(0, msg, null);
    }
}
