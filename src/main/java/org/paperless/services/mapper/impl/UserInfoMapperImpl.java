package org.paperless.services.mapper.impl;

import org.paperless.persistence.entity.UserInfo;
import org.paperless.services.dtos.UserInfoDTO;
import org.paperless.services.mapper.UserInfoMapper;
import org.springframework.stereotype.Component;

@Component
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
