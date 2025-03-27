package com.bridgelabz.resumeScreening;

public class Resume<T extends JobRole> {
    private String candidateName;
    private int candidateExperience;
    private String candidateSkills;
    private T jobRole;

    public Resume(String candidateName, int candidateExperience, String candidateSkills, T jobRole) {
        this.candidateName = candidateName;
        this.candidateExperience = candidateExperience;
        this.candidateSkills = candidateSkills;
        this.jobRole = jobRole;
    }

    public boolean isEligible() {
        return candidateExperience >= jobRole.getExperienceRequired() && candidateSkills.contains(jobRole.getRequiredSkills());
    }

    @Override
    public String toString() {
        return "Candidate: " + candidateName + ", Applying for: " + jobRole + " (Experience: " + candidateExperience + " years, Skills: " + candidateSkills + ")";
    }
}
