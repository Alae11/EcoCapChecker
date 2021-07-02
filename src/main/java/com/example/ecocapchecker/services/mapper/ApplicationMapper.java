package com.example.ecocapchecker.services.mapper;

import com.example.ecocapchecker.entities.Application;
import com.example.ecocapchecker.services.dto.ApplicationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {})
public interface ApplicationMapper extends EntityMapper<ApplicationDTO, Application> {

    @Mapping(target = "urls", ignore = true)
    Application toEntity(ApplicationDTO applicationDTO);


    default Application fromId(Long id) {
        if (id == null) {
            return null;
        }
        Application app = new Application();
        app.setId(id);
        return app;
    }
}
