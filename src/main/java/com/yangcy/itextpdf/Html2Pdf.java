package com.yangcy.itextpdf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class Html2Pdf 
{
    public static void main( String[] args ) throws DocumentException, IOException
    {
      // step 1
    	Document document = new Document();
        // step 2
    	PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("周胜.pdf"));
        // step 3
        document.open();
        // step 4
        System.err.println(Html2Pdf.class.getClassLoader().getResource("").getPath());
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream(Html2Pdf.class.getClassLoader().getResource("").getPath()+"周胜.html"));	
        
        //step 5
         document.close();

        System.out.println( "PDF Created!" );
    }
}