package com.zhxy.dao;

import com.zhxy.domain.WenjuanBanji;

public interface WenjuanBanjiMapper {
    int insert(WenjuanBanji record);

    int insertSelective(WenjuanBanji record);
}