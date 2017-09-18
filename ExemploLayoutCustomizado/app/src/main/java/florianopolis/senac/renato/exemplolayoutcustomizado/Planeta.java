package florianopolis.senac.renato.exemplolayoutcustomizado;

import java.io.Serializable;

/**
 * Created by Aluno on 11/09/2017.
 */

public class Planeta implements Serializable {

    private String nome;
    private int resImagem;

    public Planeta() {
    }

    public Planeta(String nome, int resImagem) {
        this.nome = nome;
        this.resImagem = resImagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getResImagem() {
        return resImagem;
    }

    public void setResImagem(int resImagem) {
        this.resImagem = resImagem;
    }
}
