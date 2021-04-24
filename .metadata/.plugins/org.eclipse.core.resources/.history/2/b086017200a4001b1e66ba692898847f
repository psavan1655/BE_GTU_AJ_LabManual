import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class FirstServlet extends HttpServlet {  
  
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String fn=request.getParameter("firstName");  
    
    String ln=request.getParameter("lastName");  
    out.print("Welcome "+ fn + " "+ ln + " to my gorgeous website. :)");  

  
    Cookie ck1=new Cookie("firstName",fn);  
    response.addCookie(ck1);
    
    Cookie ck2=new Cookie("lastName",ln);  
    response.addCookie(ck2); 

    //creating submit button
    out.print("<form action='servlet2' method='post'>");  
    out.print("<input type='submit' value='go'>");  
    out.print("</form>");  
          
    out.close();  
  
        }catch(Exception e){System.out.println(e);}  
  }  
}  
