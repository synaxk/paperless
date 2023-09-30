package org.paperless.services.impl;

import org.paperless.persistence.repository.UserInfoRepository;
import org.paperless.services.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfoServiceImpl {
    @Autowired
    private UserInfoRepository userInfoRepository;
    @Autowired
    private UserInfoMapper userInfoMapper;
}
