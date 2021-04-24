import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.util.Arrays;
import java.util.List;

  
public class FirstServlet extends HttpServlet {  
  
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{  
    try{  
    	 response.setContentType("text/html");  
         PrintWriter out = response.getWriter(); 
    
    String[] products = request.getParameterValues("product");
	List list = Arrays.asList(products);

	 HttpSession session=request.getSession();  
     session.setAttribute("product",list);  
     out.print("Your products => "+ list);
     out.print("<form action='servlet2' method='post'>");  
     out.print("<input type='submit' value='CheckOut'>");  
     out.print("</form>");  
               
    out.close();  
  
        }catch(Exception e){System.out.println(e);}  
  }  
}  

