package com.hemanth.HemanthResumeService.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ResumeService {

    public Map<String, String> getAboutInfo() {
        return Map.of(
                "Name", "Hemanth Kumar Kokkula",
                "Profession", "Java Backend Developer",
                "Professional Sumary", "I am a results-oriented Software Engineer with expertise in Java, " +
                        "Spring Boot, and REST APIs. With hands-on experience in designing, " +
                        "developing, and maintaining internal applications, " +
                        "I specialize in crafting scalable backend solutions." +
                        " I am proficient in utilizing Java and Spring Boot to create efficient, " +
                        "high-performance systems. In addition, " +
                        "I have extensive experience with ERP tools like Live Compare, Solman, and SNP, " +
                        "and am skilled at producing clear process documentation and user training materials. " +
                        "As a Backup Scrum Master in Agile environments, " +
                        "I excel in managing user stories, facilitating team collaboration," +
                        " and ensuring project delivery. My passion lies in delivering " +
                        "innovative solutions and continually driving process improvement.",
                "Experience", "6 months",
                "Location","TX, US",
                "Email", "kokkula.hemanth1@gmail.com"
        );
    }

    public Map<String, Object> getEducationInfo() {
        return Map.of(
                "Masters", Map.of(
                        "Degree", "Master of Science (Ms)",
                        "Field of Study", "Computer and Information Sciences",
                        "University", "Texas A&M University - Commerce",
                        "Year of Graduation", "2023",
                        "Grade", "CGPA: 8.2/10",
                        "Location", "Texas, USA",
                        "Certifications", "Advanced Java, Cloud Computing, Machine Learning"
                ),
                "Bachelors", Map.of(
                        "Degree", "Bachelor of Technology (B.Tech)",
                        "Field of Study", "Mechanical Engineering",
                        "University", "Jawaharlal Nehru Technological University (JNTUH)",
                        "Year of Graduation", "2021",
                        "Grade", "CGPA: 8.7/10",
                        "Location", "Hyderabad, India"
                )
        );
    }

    public List<Map<String, String>> getProjects() {
        return List.of(
                Map.of(
                        "Project Name", "Interactive Backend Portfolio",
                        "Description", "A comprehensive backend API showcasing various concepts like microservices, multithreading, Spring Boot, and Swagger integration."
                ),
                Map.of(
                        "Project Name", "E-commerce API",
                        "Description", "A fully functional e-commerce backend with features like product management, user authentication, and order processing."
                ),
                Map.of(
                        "Project Name", "Blog Management System",
                        "Description", "A system for managing blog posts, with features such as CRUD operations, user authentication, and commenting system."
                )
        );
    }

    public Map<String, Object> getProfessionalExperience() {
        return Map.of(
                "Company", "Johnson&Johnson IT",
                "Position", "Java Backend Developer",
                "Duration", "July 2023 - Present",
                "Domain", "HealthCare",
                "Responsibilities", Map.of(
                        "Feature Development", "Developed new and creative features for the internal app in the J&J System",
                        "Analysis", "Conducted comprehensive analysis of the current application to identify areas for enhancement",
                        "Design Solutions", "Proposed design solutions in alignment with provided requirements",
                        "Collaboration", "Collaborated closely with a team of designers and fellow team members",
                        "Software Architecture", "Executed alterations to the existing software architecture",
                        "Coding", "Wrote code in accordance with specified requirements",
                        "Testing", "Executed thorough testing, troubleshoot and resolve identified bugs",
                        "Deployment", "Participated actively in the deployment of code changes",
                        "Ongoing Support", "Provided ongoing support for the application once it is live"
                ),
                "Additional Responsibilities", Map.of(
                        "ERP Support", "Contributed to the ERP tools team with a focus on Live Compare, Solman, SNP and other ERP related SAP tools",
                        "Documentation", "Assisted in ERP tool-related tasks, including process documentation and troubleshooting",
                        "Project Support", "Supported the team in achieving project goals, dedicating approximately 30% of work time to ERP tools"
                ),
                "Professional Development", Map.of(
                        "Tutorial", "Developed a tutorial on raising Iris tickets to improve internal support",
                        "Process Documentation", "Created process documentation and user training materials",
                        "Team Knowledge", "Enhanced team knowledge and streamlined internal service procedures"
                ),
                "Backup Scrum Master", Map.of(
                        "Scrum Master Role", "Assumed responsibilities of Scrum Master, including creating and managing user stories",
                        "Task Management", "Assigned tasks and tracked progress using Scrum methodologies",
                        "Facilitation", "Facilitated team meetings and ensured adherence to Agile principles",
                        "Impediment Resolution", "Assisted in resolving impediments and supporting the team’s productivity"
                )
        );
    }

}
