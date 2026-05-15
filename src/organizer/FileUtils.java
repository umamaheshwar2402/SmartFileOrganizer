package organizer;

public class FileUtils {

    public static String getCategory(String fileName) {

        String extension = "";

        int lastDot = fileName.lastIndexOf(".");

        if (lastDot > 0) {
            extension =
                fileName.substring(lastDot + 1)
                .toLowerCase();
        }

        switch (extension) {

            case "jpg":
            case "jpeg":
            case "png":
            case "gif":
                return "Images";

            case "mp4":
            case "mkv":
            case "avi":
                return "Videos";

            case "pdf":
            case "doc":
            case "docx":
            case "txt":
                return "Documents";

            case "mp3":
            case "wav":
                return "Music";

            case "zip":
            case "rar":
                return "Archives";

            default:
                return "Others";
        }
    }
}