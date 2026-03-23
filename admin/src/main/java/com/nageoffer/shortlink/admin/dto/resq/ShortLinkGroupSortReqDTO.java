package com.nageoffer.shortlink.admin.dto.resq;

import lombok.Data;

@Data
public class ShortLinkGroupSortReqDTO {

    /**
     * 分组ID
     */
    private String gid;

    /**
     * 排序
     */
    private Integer sortOrder;
}
