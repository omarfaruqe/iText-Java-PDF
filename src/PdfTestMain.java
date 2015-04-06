import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;

import java.io.FileOutputStream;
import java.util.Date;

/**
 * Created by faruqe on 05/04/15.
 */
public class PdfTestMain {
    public static void main(String[] args) throws Exception{
        Document document=new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));
        document.open();
        Image image=Image.getInstance("logo.png");
        document.add(new Paragraph("Image"));
        document.add(image);
        document.add(new Paragraph("Hello World", FontFactory.getFont(FontFactory.COURIER)));
        document.add(new Paragraph(new Date().toString()));
        document.add(new Paragraph("------------------------------------------------------------"));
        PdfPTable table=new PdfPTable(2);
        PdfPCell cell=new PdfPCell(new Paragraph("This is the title of the table"));
        cell.setColspan(4);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setBackgroundColor(BaseColor.CYAN);
        table.addCell(cell);
        table.addCell("Item1");
        table.addCell("Item2");
        table.addCell("Item3");
        table.addCell("Item4");
        document.add(table);

        List list=new List(true,20);
        list.add("First Item");
        list.add("Second Item");
        list.add("Third Item");
        list.add("Fourth Item");
        list.add("Fifth Item");
        document.add(list);

        document.close();


    }
}
