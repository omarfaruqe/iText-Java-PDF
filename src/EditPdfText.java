import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;

/**
 * Created by faruqe on 05/04/15.
 */
public class EditPdfText {
    public static void main(String[] args) {
        try {
            PdfReader reader = new PdfReader(new FileInputStream("Fonts.pdf"));
            //System.out.println(reader.isTampered());
            PdfStamper stamper=new PdfStamper(reader, new FileOutputStream("Fonts2.pdf"));
            //System.out.println(reader.isTampered());

            Map<String, String> info=reader.getInfo();
            info.put("Author","Omar Faruqe Test");
            info.put("Title", "Fontsss");
            info.put("Subject","Working with fonts is fun uyeaah");

            stamper.setMoreInfo(info);

            stamper.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
