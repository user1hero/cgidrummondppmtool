package com.cgidrummond.ppmtool.exceptions;

public class ProjectIdExceptionResponse {

    private String ProjectIdentifier ;

    public ProjectIdExceptionResponse(String projectIdentifier){
        this.ProjectIdentifier = projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        ProjectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return ProjectIdentifier;
    }
}
