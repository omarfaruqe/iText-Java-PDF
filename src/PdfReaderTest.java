import com.itextpdf.text.pdf.PdfReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by faruqe on 05/04/15.
 */
public class PdfReaderTest {

    public static void main(String[] args) {
        try {
            PdfReader reader = new PdfReader(new FileInputStream("OutputPdf.pdf"));

            System.out.println("PDF Version: "+reader.getPdfVersion());
            System.out.println("Number of pages: "+reader.getNumberOfPages());
            System.out.println("File Length: "+reader.getFileLength());
            System.out.println("Is it encrypted? "+reader.isEncrypted());
            System.out.println("Width of Page 1: "+reader.getPageSize(1).getWidth());
            System.out.println("Height of page 1: "+reader.getPageSize(1).getHeight());
            System.out.println("Rotaion of Page 1: "+reader.getPageRotation(1));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
