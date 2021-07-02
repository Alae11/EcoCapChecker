package com.example.ecocapchecker.services.mapper;

import com.example.ecocapchecker.entities.Application;
import com.example.ecocapchecker.entities.Result;
import com.example.ecocapchecker.services.dto.ResultDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {Application.class})
public interface ResultMapper extends EntityMapper<ResultDTO, Result>{

    @Mapping(source = "url.id", target = "urlId")
    ResultDTO toDto(Result result);

    @Mapping(source = "urlId", target = "url.id")
    Result toEntity(ResultDTO resultDTO);

    default Result fromId(Long id) {
        if (id == null) {
            return null;
        }
        Result result = new Result();
        result.setId(id);
        return result;
    }
}
