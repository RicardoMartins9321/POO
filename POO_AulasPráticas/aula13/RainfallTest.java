package aula13;
import java.io.FileReader;
import java.io.IOException;
import java.io.IOError;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class RainfallTest {

   public static List<RainfallInfo> loadData(String filePath) {
    List<RainfallInfo> data = null;
    try{  
    // 1) Read the file and add RainfallInfo objects to a list.
      data = new ArrayList<>(); // Create a new ArrayList to store the data

      Scanner scanner = new Scanner(new FileReader(filePath));

      if (scanner.hasNextLine()) {
         String header = scanner.nextLine();
         if (!header.toLowerCase().contains("rainfall")) {
            return null; // Return null if the header does not contain the word "rainfall"
         }
      }
      
      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] parts = line.split(",");

         LocalDate date = LocalDate.parse(parts[0]);
         String location = parts[1];
         double rainfall = Double.parseDouble(parts[2]);

         RainfallInfo info = new RainfallInfo(date, location, rainfall);
         data.add(info);
      }

      scanner.close();
      } catch (IOException e) {
         throw new IOError(e.getCause()); // Repackage as error
      }
      return data;
   }
   
   public static void printLocationData(List<RainfallInfo> data, String loc) {
      System.out.printf("Rainfall for location %s:\n", loc);
      for (RainfallInfo info : data) {
         if (info.location().equals(loc)) {
            System.out.println(info.rainfall());
         }
      }
   }

   public static Map<Month, Double> totalPerMonth(List<RainfallInfo> data) {
      Map<Month, Double> rainfallPerMonth = new HashMap<>();
      for (RainfallInfo info : data) {
         Month month = info.date().getMonth();
         double rainfall = rainfallPerMonth.getOrDefault(month, 0.0);
         rainfall += info.rainfall();
         rainfallPerMonth.put(month, rainfall);
      }
      return rainfallPerMonth;
   }

   public static void printMapSorted(Map<Month, Double> map) {
      Map<Month, Double> sortedMap = new TreeMap<>(map);
      for (Map.Entry<Month, Double> entry : sortedMap.entrySet()) {
         System.out.printf("%s: %.2f\n", entry.getKey(), entry.getValue());
      }
   }

   public static void main(String[] args) {
      // Load the file data to the list
      List<RainfallInfo> rainfallData = loadData("rainfall_data.csv");
      if (rainfallData == null) {
         System.out.println("Invalid file format. Header must contain 'rainfall'.");
         return;
      }
      System.out.printf("Data size: %d\n", rainfallData.size());
      System.out.printf("Data hash: %d\n", rainfallData.hashCode());
      System.out.println();

      // Show data for a single town
      printLocationData(rainfallData, "Braga");
      System.out.println();

      // Find total rainfall per month
      Map<Month, Double> rainfallPerMonth = totalPerMonth(rainfallData);

      // Print sorted results
      printMapSorted(rainfallPerMonth);
   }
}

