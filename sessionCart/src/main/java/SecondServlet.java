import java.io.*;
import java.util.Arrays;
import java.util.List;
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SecondServlet extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{  
    try{  
  
    	response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        HttpSession session=request.getSession(false);  
        Object n= session.getAttribute("product");  

        
        out.print("Hello "+ n); 
    out.close();  
 
         }catch(Exception e){System.out.println(e);}  
    }
}  