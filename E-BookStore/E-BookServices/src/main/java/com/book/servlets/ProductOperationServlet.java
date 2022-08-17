package com.book.servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.hibernate.SessionFactory;

import com.book.dao.BookDao;
import com.book.dao.CategorieDao;
import com.book.entity.Book;
import com.book.entity.Categories;
import com.book.helper.FactoryProvider;

@WebServlet(name = "ProductOperationServlet", urlPatterns = { "/author" })
@MultipartConfig
public class ProductOperationServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String cat = req.getParameter("operation");
			if (cat.trim().equals("categories")) {
				String aname= req.getParameter("cname");
				Categories author = new Categories();
				author.setAname(aname);
				CategorieDao categorieDao = new CategorieDao(FactoryProvider.getFactory());
				categorieDao.saveCategory(author);
				HttpSession session = req.getSession();
				session.setAttribute("msg", "Categorie Add Successfully");
				resp.sendRedirect("addcategoriesauthor.jsp");
			} else if (cat.trim().equals("book")) {
				String pname = req.getParameter("bname");
				String bdate = req.getParameter("bdate");
				int bpage = Integer.parseInt(req.getParameter("bpage"));
				long bmrp = Long.parseLong(req.getParameter("bmrp"));
				String written = req.getParameter("written");
		        Part part = req.getPart("pimg");
		        Part pdf = req.getPart("pdf");
				int cid = Integer.parseInt(req.getParameter("categories"));
				Book book = new Book();
				book.setBname(pname);
				book.setBpublisheddate(bdate);
				book.setBpage(bpage);
			 book.setBmrp(bmrp);
			 book.setWritten(written);
		    	book.setBimg(part.getSubmittedFileName());
		    	book.setPdf(pdf.getSubmittedFileName());
				// get category by id
			CategorieDao authorDao = new CategorieDao(FactoryProvider.getFactory());
				Categories categoriesById = authorDao.getCategoryById(cid);
				book.setCategories(categoriesById);
				

				// save product
				BookDao bookDao = new BookDao(FactoryProvider.getFactory());
				bookDao.saveProduct(book);
				
				  //pic upload
		    	//get path
				String path = req.getRealPath("images")+File.separator+"product"+File.separator+part.getSubmittedFileName();
				System.out.println(path);
				//uploading 
				try {
				FileOutputStream fos = new FileOutputStream(path);
                InputStream is = part.getInputStream();
                //read data 
                byte[] data = new byte[is.available()];
                is.read(data);
                //writing data
                fos.write(data);
                fos.close();
				}catch (Exception e) {
				e.printStackTrace();
				}
				//pdf upload
				String path1 = req.getRealPath("images")+File.separator+"product"+File.separator+pdf.getSubmittedFileName();
				System.out.println(path);
				//uploading 
				try {
				FileOutputStream fos = new FileOutputStream(path1);
                InputStream is = part.getInputStream();
                //read data 
                byte[] data = new byte[is.available()];
                is.read(data);
                //writing data
                HttpSession hs= req.getSession();
                hs.setAttribute("path", path1);
                fos.write(data);
                fos.close();
				}catch (Exception e) {
				e.printStackTrace();
				}
				///
				HttpSession session = req.getSession();
				session.setAttribute("msg", "Book Add Successfully");
				resp.sendRedirect("addbookauthor.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void CategorieDao(SessionFactory factory) {
		// TODO Auto-generated method stub

	}
}
