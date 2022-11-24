package datos;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author danil
 */
public class Dt_Usuario {
    
    // Atributos
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    
    // Metodos
    
    @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT usuarioID, rolID, nombreUsuario , clave, estado FROM Usuario", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Usuario> listarUsuario(){
        ArrayList<Usuario> listUsuario = new ArrayList<Usuario>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Usuario u = new Usuario();
                u.setUsuarioID(rs.getInt("usuarioID"));
                u.setRolID(rs.getInt("rolID"));
                u.setNombreUsuario(rs.getString("nombreUsuario"));
                u.setClave(rs.getString("clave"));
                u.setEstado(rs.getInt("estado"));
                listUsuario.add(u);
            }
        }catch(SQLException e){
            System.out.println("Error en listarCountries(): "+e.getMessage());
            e.printStackTrace();
        }
        finally{
            try {
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
         return listUsuario;
    }
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarUsuario (Usuario u)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            rs.updateInt("usuarioID", u.getUsuarioID());
            rs.updateInt("rolID", u.getRolID());
            rs.updateString("nombreUsuario", u.getUsuarioID());
            rs.updateString("clave", u.getClave());
            rs.updateInt("region_id", c.getRegion_id());
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarPais(): "+e.getMessage());
            e.printStackTrace();
	}
	finally
	{
            try{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
	}
        //returnamos el valor de la bandera
	return guardado;
    }
}
