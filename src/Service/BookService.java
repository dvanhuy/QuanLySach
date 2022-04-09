
package Service;

import define.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import quanlysach.GetConnect;

public class BookService {
    public List<Book> getAllBook(){
        List<Book> books = new ArrayList<>();
        Connection connection = GetConnect.getConnection();
        String sql = "SELECT * FROM Sach";
        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();
            
            while( rs.next()) {
                Book book = new Book();
                
                book.setId(rs.getInt(1));// tên cột
                book.setTitle(rs.getString(2));
                book.setPrice(rs.getDouble(3));
                
                books.add(book);
            }
        } catch(SQLException e){
            System.out.println("lay lai du lieu loi");
        }
        return books;
    }
    
    public List<Book> getSelectBook(String ten){
        List<Book> books = new ArrayList<>();
        Connection connection = GetConnect.getConnection();
        String sql = "SELECT * FROM Sach WHERE title like N'%" + ten + "%'";
        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();
            
            while( rs.next()) {
                Book book = new Book();
                
                book.setId(rs.getInt(1));// tên cột
                book.setTitle(rs.getString(2));
                book.setPrice(rs.getDouble(3));
                
                books.add(book);
            }
        } catch(SQLException e){
            System.out.println("lay lai du lieu loi");
            return null;
        }
        return books;
    }
    
    public void deleteBook(int idbook)
    {
        Connection connection = GetConnect.getConnection();
        String sql = "DELETE Sach WHERE iD="+idbook;
        try{    
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
        } catch(SQLException e){
            System.out.println("Lỗi không thể xóa sách");
            System.out.println(e);
        }
    }
    
    public Book getdataIDBook(int id)
    {
        Connection connection = GetConnect.getConnection();
        String sql = "SELECT * FROM Sach WHERE iD="+id;
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            Book book = new Book();
            rs.next();
            book.setId(rs.getInt(1));
            book.setTitle(rs.getString(2));
            book.setPrice(rs.getDouble(3));
            return book;
        } catch(SQLException e){
            System.out.println("Lấy dữ liệu theo id sai");
            return null;
        }
    }
    
    
    public void updatedataIDBook(Book book)
    {
        Connection connection = GetConnect.getConnection();
        String sql = "UPDATE Sach set title=?,price=? WHERE iD=?";
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setDouble(2, book.getPrice());
            preparedStatement.setInt(3, book.getId());
            preparedStatement.execute();
            
        } catch(SQLException e){
            System.out.println("Cập nhật dữ liệu theo id sai");
            System.out.println(e);
        }
    }
    
    public void addBook(Book book)
    {
        Connection connection = GetConnect.getConnection();
        String sql = "INSERT INTO Sach values (?,?)";
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setDouble(2, book.getPrice());
            preparedStatement.execute();
            
        } catch(SQLException e){
            System.out.println("Thêm dữ liệu sai");
        }
    }
    
}
