import java.util.*;

public class ProjectorApp {
    
    static class Project {
        String projectName;
        String projectDescription;
        double budget;
        
        Project(String projectName, String projectDescription, double budget) {
            this.projectName = projectName;
            this.projectDescription = projectDescription;
            this.budget = budget;
        }
        
        @Override
        public String toString() {
            return "Project Name: " + projectName + ", Description: " + projectDescription + ", Budget: " + budget;
        }
    }
    
    static List<Project> projects = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\nPROJECTOR APPLICATION");
            System.out.println("----------------------");
            System.out.println("1. Create New Project");
            System.out.println("2. Retrieve All Projects");
            System.out.println("3. Search Project by Name");
            System.out.println("4. Update Project Details");
            System.out.println("5. Delete Project");
            System.out.println("6. About Projector App");
            System.out.println("0. Quit");
            System.out.println("Please select an option:");
            option = in.nextInt();
            in.nextLine();  // Consume the newline character
            
            switch (option) {
                
                case 1: // Create a new project
                    System.out.println("Enter Project Name:");
                    String name = in.nextLine();
                    System.out.println("Enter Project Description:");
                    String description = in.nextLine();
                    System.out.println("Enter Project Budget:");
                    double budget = in.nextDouble();
                    in.nextLine();  // Consume the newline character
                    
                    projects.add(new Project(name, description, budget));
                    System.out.println("New project added successfully!");
                    break;
                    
                case 2: // Retrieve all projects
                    System.out.println("\nAll Projects:");
                    if (projects.isEmpty()) {
                        System.out.println("No projects available.");
                    } else {
                        projects.forEach(project -> System.out.println(project));
                    }
                    break;
                    
                case 3: // Search project by name
                    System.out.println("Enter Project Name to Search:");
                    String searchName = in.nextLine();
                    projects.stream()
                            .filter(project -> project.projectName.equalsIgnoreCase(searchName))
                            .findFirst()
                            .ifPresentOrElse(
                                    project -> System.out.println(project),
                                    () -> System.out.println("Project not found.")
                            );
                    break;
                    
                case 4: // Update project details
                    System.out.println("Enter Project Name to Edit:");
                    String editName = in.nextLine();
                    Optional<Project> projectOpt = projects.stream()
                            .filter(project -> project.projectName.equalsIgnoreCase(editName))
                            .findFirst();
                    
                    if (projectOpt.isPresent()) {
                        Project project = projectOpt.get();
                        System.out.println("Enter new Project Description (current: " + project.projectDescription + "):");
                        String newDescription = in.nextLine();
                        System.out.println("Enter new Project Budget (current: " + project.budget + "):");
                        double newBudget = in.nextDouble();
                        in.nextLine();  // Consume the newline character
                        
                        project.projectDescription = newDescription;
                        project.budget = newBudget;
                        System.out.println("Project details updated successfully!");
                    } else {
                        System.out.println("Project not found.");
                    }
                    break;
                    
                case 5: // Delete a project
                    System.out.println("Enter Project Name to Remove:");
                    String removeName = in.nextLine();
                    boolean removed = projects.removeIf(project -> project.projectName.equalsIgnoreCase(removeName));
                    if (removed) {
                        System.out.println("Project removed successfully.");
                    } else {
                        System.out.println("Project not found.");
                    }
                    break;
                    
                case 6: // About the Projector App
                    System.out.println("\nABOUT THE PROJECTOR APP");
                    System.out.println("------------------------");
                    System.out.println("Projector App is a simple application that allows users to manage project details.");
                    System.out.println("Features include creating new projects, viewing all projects, searching projects by name,");
                    System.out.println("updating project details (description and budget), and deleting projects from the system.");
                    System.out.println("This app is ideal for small project management or tracking purposes.");
                    System.out.println("Developed using Java and utilizes basic data structures like ArrayList for project management.");
                    break;
                    
                case 0: // Quit the application
                    System.out.println("Thank you for using the Projector App.");
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                    
                default: // Invalid option
                    System.out.println("Invalid Option! Please try again.");
                    break;
            }
        } while (option != 0);
    }
}
