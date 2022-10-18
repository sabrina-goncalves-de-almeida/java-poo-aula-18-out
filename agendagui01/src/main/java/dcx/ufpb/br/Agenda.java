package dcx.ufpb.br;

import java.util.Collection;
public interface Agenda {
    public boolean cadastraContato(String nome, int dia, int mes);
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes);
    public boolean removeContato(String nome);
}
