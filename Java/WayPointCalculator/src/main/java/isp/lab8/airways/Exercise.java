package isp.lab8.airways;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercise {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        List<Waypoint> waypoints = new ArrayList<>();
        int choice = 0;
        FilesAndFolders ff = new FilesAndFolders();
        System.out.println("The name of the folder to save the waypoints: ");
        String nf = scanner.next();
        FilesAndFolders.createFolder(nf);
        WaypointDistanceCalculator wcc = new WaypointDistanceCalculator();
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add a waypoint");
            System.out.println("2. Create a new route");
            System.out.println("3. The distance between 2 waypoints");
            System.out.println("4. Delete a route");
            System.out.println("5. List all routes");
            System.out.println("6. Exit");
            String n;
            double lon,lat;
            int alt;
            choice = scanner.nextInt();

            switch (choice) {
                case 1: System.out.println("The name of the waypoint");
                        n = scanner.next();
                        System.out.println("The Latitude: ");
                        lon = scanner.nextDouble();
                        System.out.println("The Longitude: ");
                        lat = scanner.nextDouble();
                        System.out.println("The Altitude: ");
                        alt = scanner.nextInt();
                        Waypoint waypoint = new Waypoint(n,lon,lat,alt);
                        waypoints.add(waypoint);
                    break;
                case 2:
                    System.out.println("The name of the route: ");
                    String route = scanner.next();
                    FilesAndFolders.createFolder(route);
                    System.out.println("The name of the first waypoint: ");
                    String w1 = scanner.next();
                    Waypoint ww1;
                    ww1 = FilesAndFolders.getFilesFromFolder(w1,nf);
                    double longit = ww1.getLongitude();
                    double latid = ww1.getLatitude();
                    System.out.println("The name of the second waypoint: ");
                    String w2 = scanner.next();
                    Waypoint ww2;
                    ww2 = FilesAndFolders.getFilesFromFolder(w2,nf);
                    double longit1 = ww2.getLongitude();
                    double latid1 = ww2.getLatitude();
                    Double dist =  WaypointDistanceCalculator.calculateDistance(latid,longit,latid1,longit1);
                    //System.out.println("Distanta: " + WaypointDistanceCalculator.calculateDistance(latid,longit,latid1,longit1));
                    FilesAndFolders.writeFile2(route,route,dist);
                    break;
                case 3:
                    System.out.println("Name of the route: ");
                    String rt = scanner.next();
                    System.out.println(FilesAndFolders.readFile(rt,rt));
                    break;
                case 4:
                    System.out.println("Name of the route to delete: ");
                    File rt1 = new File(scanner.next());
                    FilesAndFolders.deleteFolder(rt1);
                    System.out.println("File deleted.. ");
                    break;
                case 5:
                    System.out.println("Listing the files:");
                    FilesAndFolders.listFilesInFolder("");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }
            FilesAndFolders.getFilesInFolder(waypoints,nf);

        }

    }
}
