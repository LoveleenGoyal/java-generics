package com.bridgelabz.resumeScreening;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningUtility {
    private List<Resume<? extends JobRole>> resumes = new ArrayList<>();

    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    public void displayResumes() {
        for (Resume<? extends JobRole> resume : resumes) {
            System.out.println(resume + " - Eligible: " + resume.isEligible());
        }
    }
}
