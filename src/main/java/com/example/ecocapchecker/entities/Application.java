package com.example.ecocapchecker.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity@Data@NoArgsConstructor@AllArgsConstructor
public class Application {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String logo;
    @OneToMany(targetEntity=Url.class, mappedBy="application")
    private List<Url> urls;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }
}
