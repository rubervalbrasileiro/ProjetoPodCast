package models;

/**
 *
 * @author AQUI TEM
 */

public class Usuario {
   
    private String usuario;
    private String password;
    private String tipo;

    public Usuario() {
    }

    public Usuario(String usuario, String password, String tipo) {
        this.usuario = usuario;
        this.password = password;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
