import java.io.*;

public class BufferedCopyComparison {
    public static void main(String[] args) throws IOException {
        File source = new File("largefile.txt");
        File destBuffered = new File("copy_buffered.txt");
        File destUnbuffered = new File("copy_unbuffered.txt");

        long startBuffered = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destBuffered))) {
            byte[] buffer = new byte[4096];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        }
        long timeBuffered = System.nanoTime() - startBuffered;

        long startUnbuffered = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destUnbuffered)) {
            byte[] buffer = new byte[4096];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        }
        long timeUnbuffered = System.nanoTime() - startUnbuffered;

        System.out.println("Buffered Time: " + timeBuffered / 1_000_000 + " ms");
        System.out.println("Unbuffered Time: " + timeUnbuffered / 1_000_000 + " ms");
    }
}