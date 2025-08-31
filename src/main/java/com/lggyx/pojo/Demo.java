package com.lggyx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Demo实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demo {
    private Integer id; //ID
    private String name; //名称
    private String description; //描述
    private String category; // 分类
    private String content; // 内容
    private String image; //图片url
    private LocalDateTime createTime; //创建时间
    private LocalDateTime updateTime; //更新时间
    private Integer status;//状态 0停用 1启用
}
