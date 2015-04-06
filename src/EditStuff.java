import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by faruqe on 05/04/15.
 */

public class EditStuff {
    public static void main(String[] args) throws Exception {
        PdfReader reader=new PdfReader("OutputFont.pdf");

        PdfStamper stamper=new PdfStamper(reader,new FileOutputStream("EditTest.pdf"));

    }
}
