public class Practice15_2 {

    public String readFile(String folder, String file) {
        if (!folder.endsWith("\\")) {
            folder += "\\";
        }
        return folder + file;
    }
}
