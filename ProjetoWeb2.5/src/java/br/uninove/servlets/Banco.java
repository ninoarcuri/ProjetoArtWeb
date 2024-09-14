package br.uninove.servlets;

import java.util.ArrayList;
import java.util.List;


public class Banco {
    
    private static List<Usuario> usuarios =  new ArrayList<>(); 
    public static void adiciona (Usuario usuario){
    Banco.usuarios.add(usuario);
    }
    
    public static List<Usuario> getUsuarios(){
    return Banco.usuarios;
    }
    
             
    
}
