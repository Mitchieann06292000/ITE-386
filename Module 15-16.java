import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the image file path: ");
        String imagePath = scanner.nextLine();
        String detectedDisease = callImageRecognitionSystem(imagePath);
        String report = generateReport(detectedDisease);
        System.out.println(report);
        scanner.close();
    }
    
    public static String callImageRecognitionSystem(String imagePath) {
        String disease = "Powdery Mildew";
        return disease;
    }
    
    public static String generateReport(String detectedDisease) {
        StringBuilder report = new StringBuilder();
        report.append("Crop Disease Detection Report\n");
        report.append("==============================\n");
        
        if (detectedDisease.equals("Powdery Mildew")) {
            report.append("Detected Disease: Powdery Mildew\n");
            report.append("Treatment: Apply fungicides and improve air circulation.\n");
            report.append("Prevention: Ensure proper spacing between plants and avoid overhead watering.\n");
        } else if (detectedDisease.equals("Downy Mildew")) {
            report.append("Detected Disease: Downy Mildew\n");
            report.append("Treatment: Use fungicides and remove infected leaves.\n");
            report.append("Prevention: Water in the morning and ensure good air flow.\n");
        } else {
            report.append("Detected Disease: " + detectedDisease + "\n");
            report.append("No specific treatment information available.\n");
        }
        
        report.append("==============================\n");
        return report.toString();
    }
}
