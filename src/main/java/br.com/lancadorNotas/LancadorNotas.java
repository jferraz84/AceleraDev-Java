package br.com.lancadorNotas;

import br.com.usuarios.UsuarioAutorizavel;

public class LancadorNotas {

    public void login(UsuarioAutorizavel usuarioAutorizavel){

        boolean temAut = usuarioAutorizavel.temAutorizacao();
            if (temAut){
                System.out.println("Usuario tem Autorização");
            } else {
                System.out.println("Não tem Autorização");
            }


    }

}
