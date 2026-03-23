package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.GroupDO;
import com.nageoffer.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;
import com.nageoffer.shortlink.admin.dto.resq.ShortLinkGroupSortReqDTO;
import com.nageoffer.shortlink.admin.dto.resq.ShortLinkGroupUpdateReqDTO;

import java.util.List;

public interface GroupService extends IService<GroupDO> {
    void saveGroup(String name);
    List<ShortLinkGroupRespDTO>listGroup();

    void updateGroup(ShortLinkGroupUpdateReqDTO requestParam);

    void deleteGroup(String gid);

    void sortGroup(List<ShortLinkGroupSortReqDTO> requestParam);
}
