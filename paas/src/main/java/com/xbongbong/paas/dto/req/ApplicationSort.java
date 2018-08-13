package com.xbongbong.paas.dto.req;


import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author: wufeng
 * @date: 2018/8/10 16:04
 * @desrcption: 应用排序类
 */
public class ApplicationSort implements Serializable {

    private static final long serialVersionUID = 6319569704482893968L;


    @NotNull(message = "id不能为空")
    private Long id;

    @NotNull(message = "排序不能为空")
    private Integer sort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
