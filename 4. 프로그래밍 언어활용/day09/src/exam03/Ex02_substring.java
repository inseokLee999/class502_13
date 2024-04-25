package exam03;

public class Ex02_substring {
    public static void main(String[] args) {
        String fileName = "image.png";
        String extension = fileName.substring(6);
        System.out.println(extension);
        String extension2= fileName.substring(fileName.length() - 3);
        System.out.println(extension2);
    }
}
