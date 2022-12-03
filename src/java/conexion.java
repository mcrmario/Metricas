import java.sql.Connection;
import java.sql.DriverManager;
 

public class conexion{
    
    private static String url= "jdbc:mysql://localhost:3306/marvent1?useUnicode=true&useJDBCCompliantTimezonneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static String usuario= "root";
    private static String clave="123";       
    
    public static Connection Conexion(){
    Connection conexion =null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver se ha cargado con exito");
        conexion= DriverManager.getConnection(url,usuario,clave);
        System.out.println("Conexión realizada con exito");
        }
        catch(Exception e){
                System.out.println("No se ha podido establecer conexión con la base de datos "+e.getMessage());
    
            }   
    
    return conexion;
    }
    
    public static void main (String [] args){
    
    Conexion();
    }
}