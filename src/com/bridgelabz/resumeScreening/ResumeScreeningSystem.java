package com.bridgelabz.resumeScreening;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>("Loveleen", 3, "Java, Python, Algorithms", new SoftwareEngineer());
        Resume<DataScientist> dataScientistResume = new Resume<>("Yagyata", 2, "Machine Learning, Python, SQL", new DataScientist());
        Resume<ProductManager> productManagerResume = new Resume<>("Sakshi", 6, "Leadership, Agile, Market Analysis", new ProductManager());

        ResumeScreeningUtility screeningSystem = new ResumeScreeningUtility();
        screeningSystem.addResume(softwareEngineerResume);
        screeningSystem.addResume(dataScientistResume);
        screeningSystem.addResume(productManagerResume);

        System.out.println("Resume Screening Results:");
        screeningSystem.displayResumes();
    }
}
