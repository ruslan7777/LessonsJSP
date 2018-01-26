package demotest; /**
 * Created by RUSLAN77 on  23.01.2018 in Ukraine
 */
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class guruTag extends SimpleTagSupport{
    public void doTag() throws JspException,IOException
    {
        JspWriter out = getJspContext().getOut();
        out.println("Guru Tag");

        
    }

}
