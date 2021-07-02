package com.example.ecocapchecker.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity@Data@NoArgsConstructor@AllArgsConstructor
public class Url {
    @Id@GeneratedValue
    private Long id;
    private String name;
    @OneToMany(targetEntity=Result.class, mappedBy="url")
    private List<Result> results;
    @ManyToOne
    @JoinColumn(name="idApplication", nullable=false )
    private Application application;

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

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
}
