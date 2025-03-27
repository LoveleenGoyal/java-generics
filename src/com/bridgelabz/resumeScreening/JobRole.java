package com.bridgelabz.resumeScreening;

public abstract class JobRole {
    private String jobTitle;
    private String requiredSkills;
    private int experienceRequired;

    public JobRole(String jobTitle, String requiredSkills, int experienceRequired) {
        this.jobTitle = jobTitle;
        this.requiredSkills = requiredSkills;
        this.experienceRequired = experienceRequired;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getRequiredSkills() {
        return requiredSkills;
    }

    public int getExperienceRequired() {
        return experienceRequired;
    }

    @Override
    public String toString() {
        return jobTitle + " (Skills: " + requiredSkills + ", Experience: " + experienceRequired + " years)";
    }
}

// Specific job roles
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer", "Java, Python, Algorithms", 2);
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist", "Machine Learning, Python, SQL", 3);
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager", "Leadership, Agile, Market Analysis", 5);
    }
}
