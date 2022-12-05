package com.ky.servlet.media;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "ImagesServlet", value = "/images")
public class ImagesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path=getServletContext().getRealPath("/uploads");
        ArrayList<String> files=MediaFile.getFiles(path);
        PrintWriter pw=response.getWriter();
        response.setContentType("text/html");

        for(String item:files){
            pw.print(item);
            pw.print("<br>");
        }
    }
}
