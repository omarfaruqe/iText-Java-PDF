import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by faruqe on 05/04/15.
 */
public class WorkingWithFonts {
    public static void main(String[] args) throws DocumentException, FileNotFoundException {
            Document doc = new Document();

            Font[] fonts={
                new Font(), new Font(Font.FontFamily.COURIER, 18,Font.BOLD, new BaseColor(100,100,100)),
                new Font(), new Font(Font.FontFamily.HELVETICA, 12,Font.ITALIC, new BaseColor(100,100,100)),
                new Font(), new Font(Font.FontFamily.SYMBOL, 20,Font.NORMAL, new BaseColor(100,100,100)),
                new Font(), new Font(Font.FontFamily.TIMES_ROMAN, 25,Font.BOLD, new BaseColor(0,100,100)),
                new Font(), new Font(Font.FontFamily.UNDEFINED, 16,Font.BOLD, new BaseColor(100,0,100)),
                new Font(), new Font(Font.FontFamily.COURIER, 17,Font.BOLD, new BaseColor(100,100,0)),
        };
        PdfWriter.getInstance(doc,new FileOutputStream("OutputFont.pdf"));
        doc.open();

        for(int i=0;i<fonts.length;i++){
            doc.add(new Paragraph("The Font Family is: "+fonts[i].getFamilyname()+". The font size is"+fonts[i].getSize(),fonts[i]));

        }
        doc.close();

    }
}
