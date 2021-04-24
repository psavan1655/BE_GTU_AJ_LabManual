import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SecondServlet extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    Cookie ck1[]=request.getCookies();  
    out.print("Hello "+ ck1[0].getValue() + " " + ck1[1].getValue());  
    
    out.close();  
 
         }catch(Exception e){System.out.println(e);}  
    }
}  