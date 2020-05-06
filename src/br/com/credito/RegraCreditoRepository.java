package br.com.credito;

import java.util.ArrayList;
import java.util.List;

public class RegraCreditoRepository {

    public List<RegraCredito> findAllRegras(){
        List<RegraCredito> regras = new ArrayList<>();

        RegraCredito regra1 = new RegraCredito();
        regra1.setNome("scoreSerasa");
        regra1.setReferencia("scoreSerasa");
        regra1.setValorReferencia(500);
        regra1.setRegra(RegraCredito.RegraValor.MIN);

        RegraCredito regra2 = new RegraCredito();
        regra2.setNome("Valor Divida");
        regra2.setReferencia("Valor Divida");
        regra2.setValorReferencia(1000);
        regra2.setRegra(RegraCredito.RegraValor.MAX);

        regras.add(regra1);
        regras.add(regra2);
        return  regras;

    }
}
