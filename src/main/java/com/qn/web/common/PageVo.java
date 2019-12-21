package com.qn.web.common;


import lombok.Data;

/**
 * 分页公共参数
 * @author LLL
 *
 */
@Data
public class PageVo {




    //页面容量
    private Integer pageSize;

    //当前页
    private Integer pageNum;

    //总数量
    private Long total;

    //总页数
    private Integer pages;


}
