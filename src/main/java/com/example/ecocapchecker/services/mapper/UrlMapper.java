package com.example.ecocapchecker.services.mapper;

import com.example.ecocapchecker.entities.Application;
import com.example.ecocapchecker.entities.Url;
import com.example.ecocapchecker.services.dto.UrlDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {Application.class})
public interface UrlMapper extends EntityMapper<UrlDTO, Url> {

    @Mapping(source = "application.id", target = "applicationId")
    UrlDTO toDto(Url url);

    @Mapping(source = "applicationId", target = "application.id")
    @Mapping(target = "results", ignore = true)
    Url toEntity(UrlDTO urlDTO);

    default Url fromId(Long id) {
        if (id == null) {
            return null;
        }
        Url url = new Url();
        url.setId(id);
        return url;
    }
}
