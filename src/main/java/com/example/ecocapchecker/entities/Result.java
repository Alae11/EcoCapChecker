package com.example.ecocapchecker.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity@Data@NoArgsConstructor@AllArgsConstructor
public class Result {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double score;
    private double empreinteCo2;
    private int nbRequests;
    private int nmElementDom;
    private int poidss;
    private String auditsPassed;
    private String auditsDiagnostics;
    private boolean greenHosting;
    private Date date;
    @ManyToOne
    @JoinColumn( name="idUrl", nullable=false )
    private Url url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getEmpreinteCo2() {
        return empreinteCo2;
    }

    public void setEmpreinteCo2(double empreinteCo2) {
        this.empreinteCo2 = empreinteCo2;
    }

    public int getNbRequests() {
        return nbRequests;
    }

    public void setNbRequests(int nbRequests) {
        this.nbRequests = nbRequests;
    }

    public int getNmElementDom() {
        return nmElementDom;
    }

    public void setNmElementDom(int nmElementDom) {
        this.nmElementDom = nmElementDom;
    }

    public int getPoidss() {
        return poidss;
    }

    public void setPoidss(int poidss) {
        this.poidss = poidss;
    }

    public String getAuditsPassed() {
        return auditsPassed;
    }

    public void setAuditsPassed(String auditsPassed) {
        this.auditsPassed = auditsPassed;
    }

    public String getAuditsDiagnostics() {
        return auditsDiagnostics;
    }

    public void setAuditsDiagnostics(String auditsDiagnostics) {
        this.auditsDiagnostics = auditsDiagnostics;
    }

    public boolean isGreenHosting() {
        return greenHosting;
    }

    public void setGreenHosting(boolean greenHosting) {
        this.greenHosting = greenHosting;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }
}
