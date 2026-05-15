package organizer;

import java.io.File;

public class FileOrganizer {

    public void organize(String folderPath) {

        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path!");
            return;
        }

        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found.");
            return;
        }

        for (File file : files) {

            if (file.isFile()) {

                String category =
                        FileUtils.getCategory(file.getName());

                File categoryFolder =
                        new File(folderPath +
                        File.separator +
                        category);

                if (!categoryFolder.exists()) {
                    categoryFolder.mkdir();
                }

                File destination =
                        new File(categoryFolder,
                        file.getName());

                boolean moved =
                        file.renameTo(destination);

                if (moved) {
                    System.out.println(
                        "Moved: " +
                        file.getName() +
                        " -> " +
                        category
                    );
                } else {
                    System.out.println(
                        "Failed to move: " +
                        file.getName()
                    );
                }
            }
        }

        System.out.println("Organization completed!");
    }
}