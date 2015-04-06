import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

/**
 * Created by faruqe on 05/04/15.
 */
public class DocumentSizes {
   public static void main(String[] args) {
       Document document=new Document();
       Rectangle rect=new Rectangle(PageSize.A4);
       document.setPageSize(rect);
       try {

           PdfWriter.getInstance(document, new FileOutputStream("OutputPdf.pdf"));

           document.open();

           Paragraph paragraph=new Paragraph();
           paragraph.add("This is super awesome\nThis is another page");
           document.add(paragraph);

           document.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}