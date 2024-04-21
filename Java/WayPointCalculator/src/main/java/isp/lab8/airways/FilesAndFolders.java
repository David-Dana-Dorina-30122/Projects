package isp.lab8.airways;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

    public class FilesAndFolders implements Serializable {

        public static void createFolder(String folder){
            File d = new File(folder);
            d.mkdirs();
        }

            public static void writeFile2(String folderPath, String fileName, double content){
                File folder = new File(folderPath);
                if (!folder.exists()) {
                    folder.mkdirs();
                }

                File file = new File(folder, fileName);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    writer.write(Double.toString(content));
                    System.out.println("File written successfully.");
                } catch (IOException e) {
                    System.out.println("Failed to write the file.");
                    e.printStackTrace();
                }
            }

        public static void getFilesInFolder(List<Waypoint> wp ,String folder) {
            for (Waypoint waypoint : wp) {
                String filePath = folder + "/" + waypoint.getName() + ".dat";
                try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
                    outputStream.writeObject(waypoint);
                    //System.out.println("Waypoint saved: " + waypoint.getName());
                } catch (IOException e) {
                    System.out.println("Failed to save waypoint: " + waypoint.getName());
                    e.printStackTrace();
                }
            }
        }

        public static Waypoint getFilesFromFolder(String waypoint ,String folderP) {
            File folder = new File(folderP);
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().equalsIgnoreCase(waypoint + ".dat")) {
                        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                            return (Waypoint) inputStream.readObject();
                        } catch (IOException | ClassNotFoundException e) {
                            System.out.println("Failed to load waypoint: " + waypoint);
                            e.printStackTrace();
                        }
                    }
                }
            }
            return null;
        }
        public static String readFile(String folderPath, String fileName) {
            File file = new File(folderPath, fileName);
            StringBuilder content = new StringBuilder();

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            } catch (IOException e) {
                System.out.println("Failed to read the file.");
                e.printStackTrace();
            }

            return content.toString();
        }

        public static void listFilesInFolder(String folderPath) {
            File folder = new File(folderPath);

            if (folder.exists() && folder.isDirectory()) {
                File[] files = folder.listFiles();

                if (files != null) {
                    for (File file : files) {
                        if (file.isDirectory()) {
                            System.out.println(file.getName());
                        }
                    }
                }
            } else {
                System.out.println("Folder does not exist or is not a directory.");
            }
        }

        public static void deleteFolder(File file) {
            File[] contents = file.listFiles();
            if (contents != null) {
                for (File f : contents) {
                    deleteFolder(f);
                }
            }
            file.delete();
        }

    }

