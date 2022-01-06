package io.cucumber.skeleton.servicos;

import io.cucumber.skeleton.Filme;
import io.cucumber.skeleton.NotaAluguel;

import java.util.Calendar;

public class AluguelService {
    public NotaAluguel alugar(Filme filme,String tipo){
        if(filme.getEstoque()==0) throw new RuntimeException("Filme sem estoque");
        NotaAluguel nota = new NotaAluguel();
        if("extendido".equals(tipo)){
            nota.setPrecoAluguel(filme.getAluguel()*2);
            nota.setPontuacao(2);
        }
        else
            nota.setPrecoAluguel(filme.getAluguel());
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,1);
        nota.setDataEntrega(cal.getTime());
        filme.setEstoque(filme.getEstoque()-1);
        return nota;

    }

}
