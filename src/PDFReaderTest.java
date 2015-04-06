import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by faruqe on 05/04/15.
 */
public class PDFReaderTest {
    public static void main(String[] args) throws DocumentException, IOException {
        Document doc = new Document();

        Font[] fonts={
                new Font(), new Font(Font.FontFamily.COURIER, 18,Font.BOLD, new BaseColor(100,100,100)),
                new Font(), new Font(Font.FontFamily.HELVETICA, 12,Font.ITALIC, new BaseColor(100,100,100)),
                new Font(), new Font(Font.FontFamily.SYMBOL, 20,Font.NORMAL, new BaseColor(100,100,100)),
                new Font(), new Font(Font.FontFamily.TIMES_ROMAN, 25,Font.BOLD, new BaseColor(0,100,100)),
                new Font(), new Font(Font.FontFamily.UNDEFINED, 16,Font.BOLD, new BaseColor(100,0,100)),
                new Font(), new Font(Font.FontFamily.COURIER, 17,Font.BOLD, new BaseColor(100,100,0)),
        };
        PdfWriter.getInstance(doc, new FileOutputStream("OutputFont.pdf"));
        doc.open();

        for(int i=0;i<fonts.length;i++){
            doc.add(new Paragraph("The Font Family is: "+fonts[i].getFamilyname()+". The font size is"+fonts[i].getSize(),fonts[i]));

        }
        doc.close();

        PdfReader reader = new PdfReader(new FileInputStream("OutputFont.pdf"));

        System.out.println("PDF Version: "+reader.getPdfVersion());
        System.out.println("Number of pages: "+reader.getNumberOfPages());
        System.out.println("File Length: "+reader.getFileLength());
        System.out.println("Is it encrypted? " + reader.isEncrypted());
        System.out.println("Width of Page 1: " + reader.getPageSize(1).getWidth());
        System.out.println("Height of page 1: " + reader.getPageSize(1).getHeight());
        System.out.println("Rotaion of Page 1: "+reader.getPageRotation(1));

    }
}
