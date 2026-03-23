package com.nageoffer.shortlink.admin.dto.resq;

import lombok.Data;

@Data
public class ShortLinkGroupUpdateReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名
     */
    private String name;
}
