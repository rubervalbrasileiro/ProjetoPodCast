
package database;

import models.Usuario;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author AQUI TEM
 */
public class controllers {
     private Map<String, Usuario> usuarios;
     
     public controllers() {
        usuarios = new HashMap<>();
        // Adicionar usuários de exemplo
        usuarios.put("admin", new Usuario("admin", "1234", "Administrador"));
        usuarios.put("operador", new Usuario("operador", "1234", "Operador"));
        usuarios.put("usuario", new Usuario("usuario", "1234", "Usuario"));
    }
     
     public Usuario getUsuario(String username) {
        return usuarios.get(username);
    }
}
