package com.berknbilgc.daily.business.services;

import com.berknbilgc.daily.business.dto.DailyDto;
import com.berknbilgc.daily.data.entity.DailyEntity;

import java.util.List;
import java.util.Map;

public interface IDailyServices {

    DailyDto entityToDto(DailyEntity registerEntity);

    DailyEntity dtoToEntity(DailyDto registerDto);

    //CREATE
    DailyDto createDaily(DailyDto registerDto);

    //LIST
    List<DailyDto> listDaily();

    //FIND
    DailyDto findDaily(Long id);

    //DELETE
    Map<String,Boolean> deleteDaily( Long id);

    //UPDATE
    DailyDto updateDaily(Long id, DailyDto registerDto);
}
