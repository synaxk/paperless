package org.paperless.service.mapper.impl;

import org.paperless.persistence.entity.UserInfo;
import org.paperless.service.dtos.UserInfoDTO;
import org.paperless.service.mapper.UserInfoMapper;

public class UserInfoMapperImpl extends AbstractMapper<UserInfo, UserInfoDTO> implements UserInfoMapper {
    @Override
    public UserInfoDTO toDto(UserInfo userInfo) {
        return null;
    }

    @Override
    public UserInfo toEntity(UserInfoDTO userInfoDTO) {
        return null;
    }
}
