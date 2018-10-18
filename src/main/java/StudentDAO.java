import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
   String jdbcDriver;
   String dbUrl;
   String dbUser;
   String dbPassword;

    /* DB에 값을 넣어주기 */
    public void add(Student student){
        Connection conn = null;
        PreparedStatement ps = null;

        try{
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            String sql = "INSERT INTO TB_Student(name, korean, english, math) " +
                    "VALUES (?, ?, ?, ?)";
            ps =  conn.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setInt(2, student.getKorean());
            ps.setInt(3, student.getEnglish());
            ps.setInt(4,student.getMath());
            int count = ps.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                conn.close();
            }catch (Exception ex){ }
        }
    }

    /* DB에서 값 받아오기 */
    public List<Student> getList(){

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Student> list = new ArrayList<>();

        try{
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            String sql = "SELECT name, korean, english, math FROM TB_Student";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Student student = new Student();
                student.setName(rs.getString(1));
                student.setKorean(rs.getInt(2));
                student.setEnglish(rs.getInt(3));
                student.setMath(rs.getInt(4));
                list.add(student);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                conn.close();
            }catch (Exception ex){ }
        }
        return list;
    }

    public void setJdbcDriver(String jdbcDriver) {
        this.jdbcDriver = jdbcDriver;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
}
