import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        Document document=new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("OutputPdf.pdf"));

            document.open();

            Paragraph paragraph=new Paragraph();
            paragraph.add("This is super awesome");
            document.add(paragraph);

            document.close();

            System.out.println("Program Started");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Hello World!");
    }
}
