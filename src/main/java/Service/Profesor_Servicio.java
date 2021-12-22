package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
public class Profesor_Servicio {
    static public void queryN1()throws SQLException {
        Connection conexion= queryN2();
        try{
            String queryString= "Select* from profesor order by nombre desc";

            try(PreparedStatement STMT = conexion.prepareStatement(queryString)){
                try (ResultSet RS= STMT.executeQuery()){
                    int TotalDeColumnas= RS.getMetaData().getColumnCount();
                    while(RS.next()){
                        for (int  i=1; i<=TotalDeColumnas;i++){
                            System.out.print(RS.getObject(i));
                            System.out.print("\t");
                        }
                        System.out.println("  ");
                    }
                }
            }
        }

        catch(SQLException ErrorDeConexion){
            System.err.println(ErrorDeConexion.getErrorCode());

            if (conexion !=null){
                try {
                    conexion.close();
                }catch(SQLException Errordeconexion){
                    System.err.println(Errordeconexion.getErrorCode());
                }
            }
        }
    }

}
*/

