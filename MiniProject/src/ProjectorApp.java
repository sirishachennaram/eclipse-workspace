import java.util.*;

public class ProjectorApp {

    // Define Projector class with the provided attributes
    static class Projector {
        int projectorID;
        String brand;
        String model;
        String resolution;
        int brightness;

        // Constructor
        Projector(int projectorID, String brand, String model, String resolution, int brightness) {
            this.projectorID = projectorID;
            this.brand = brand;
            this.model = model;
            this.resolution = resolution;
            this.brightness = brightness;
        }

        @Override
        public String toString() {
            return "Projector ID: " + projectorID + ", Brand: " + brand + ", Model: " + model +
                    ", Resolution: " + resolution + ", Brightness: " + brightness;
        }
    }

    // List to store projectors
    static List<Projector> projectors = new ArrayList<>();
    static int nextProjectorID = 1;  // To auto-increment ProjectorID

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\nPROJECTOR MANAGEMENT APPLICATION");
            System.out.println("-------------------------------");
            System.out.println("1. Create New Projector");
            System.out.println("2. Retrieve All Projectors");
            System.out.println("3. Search Projector by Model");
            System.out.println("4. Update Projector Details");
            System.out.println("5. Delete Projector");
            System.out.println("6. About Projector App");
            System.out.println("0. Quit");
            System.out.println("Please select an option:");
            option = in.nextInt();
            in.nextLine();  // Consume the newline character

            switch (option) {

                case 1: // Create a new projector
                    System.out.println("Enter Projector Brand:");
                    String brand = in.nextLine();
                    System.out.println("Enter Projector Model:");
                    String model = in.nextLine();
                    System.out.println("Enter Projector Resolution:");
                    String resolution = in.nextLine();
                    System.out.println("Enter Projector Brightness:");
                    int brightness = in.nextInt();
                    in.nextLine();  // Consume the newline character

                    // Create a new Projector object and add to the list
                    Projector newProjector = new Projector(nextProjectorID++, brand, model, resolution, brightness);
                    projectors.add(newProjector);
                    System.out.println("New projector added successfully!");
                    break;

                case 2: // Retrieve all projectors
                    System.out.println("\nAll Projectors:");
                    if (projectors.isEmpty()) {
                        System.out.println("No projectors available.");
                    } else {
                        projectors.forEach(projector -> System.out.println(projector));
                    }
                    break;

                case 3: // Search projector by model
                    System.out.println("Enter Projector Model to Search:");
                    String searchModel = in.nextLine();
                    projectors.stream()
                            .filter(projector -> projector.model.equalsIgnoreCase(searchModel))
                            .findFirst()
                            .ifPresentOrElse(
                                    projector -> System.out.println(projector),
                                    () -> System.out.println("Projector not found.")
                            );
                    break;

                case 4: // Update projector details
                    System.out.println("Enter Projector ID to Edit:");
                    int editID = in.nextInt();
                    in.nextLine();  // Consume the newline character

                    // Search for the projector by ID
                    Optional<Projector> projectorOpt = projectors.stream()
                            .filter(projector -> projector.projectorID == editID)
                            .findFirst();

                    if (projectorOpt.isPresent()) {
                        Projector projector = projectorOpt.get();
                        System.out.println("Enter new Projector Brand (current: " + projector.brand + "):");
                        String newBrand = in.nextLine();
                        System.out.println("Enter new Projector Model (current: " + projector.model + "):");
                        String newModel = in.nextLine();
                        System.out.println("Enter new Projector Resolution (current: " + projector.resolution + "):");
                        String newResolution = in.nextLine();
                        System.out.println("Enter new Projector Brightness (current: " + projector.brightness + "):");
                        int newBrightness = in.nextInt();
                        in.nextLine();  // Consume the newline character

                        // Update the projector details
                        projector.brand = newBrand;
                        projector.model = newModel;
                        projector.resolution = newResolution;
                        projector.brightness = newBrightness;

                        System.out.println("Projector details updated successfully!");
                    } else {
                        System.out.println("Projector not found.");
                    }
                    break;

                case 5: // Delete a projector
                    System.out.println("Enter Projector ID to Remove:");
                    int removeID = in.nextInt();
                    in.nextLine();  // Consume the newline character

                    boolean removed = projectors.removeIf(projector -> projector.projectorID == removeID);
                    if (removed) {
                        System.out.println("Projector removed successfully.");
                    } else {
                        System.out.println("Projector not found.");
                    }
                    break;

                case 6: // About the Projector App
                    System.out.println("\nABOUT THE PROJECTOR APP");
                    System.out.println("------------------------");
                    System.out.println("Projector App is a simple application that allows users to manage projector details.");
                    System.out.println("Features include creating new projectors, viewing all projectors, searching projectors by model,");
                    System.out.println("updating projector details (brand, model, resolution, and brightness), and deleting projectors.");
                    System.out.println("This app is ideal for managing a small projector inventory.");
                    System.out.println("Developed using Java and basic data structures like ArrayList for projector management.");
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
