package model;

import java.io.*;
import java.util.ArrayList;

public class PessoaJuridicaRepo implements Serializable {
    private ArrayList<PessoaJuridica> listaPessoaJuridica = new ArrayList<>();

    public void inserir(PessoaJuridica pj) {
        listaPessoaJuridica.add(pj);
    }

    public void alterar(PessoaJuridica pj) {
        for (int i = 0; i < listaPessoaJuridica.size(); i++) {
            if (listaPessoaJuridica.get(i).getId() == pj.getId()) {
                listaPessoaJuridica.set(i, pj);
                return;
            }
        }
    }

    public void excluir(int id) {
        listaPessoaJuridica.removeIf(pj -> pj.getId() == id);
    }

    public PessoaJuridica obter(int id) {
        for (PessoaJuridica pj : listaPessoaJuridica) {
            if (pj.getId() == id) {
                return pj;
            }
        }
        return null;
    }

    public ArrayList<PessoaJuridica> obterTodos() {
        return listaPessoaJuridica;
    }

    public void persistir(String nomeArquivo) throws Exception {
        FileOutputStream fos = new FileOutputStream(nomeArquivo);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(listaPessoaJuridica);
        oos.close();

        File file = new File(nomeArquivo);
        System.out.println("Arquivo salvo em: " + file.getAbsolutePath());
    }

    public void recuperar(String nomeArquivo) throws Exception {
        FileInputStream fis = new FileInputStream(nomeArquivo);
        ObjectInputStream ois = new ObjectInputStream(fis);
        listaPessoaJuridica = (ArrayList<PessoaJuridica>) ois.readObject();
        ois.close();

        File file = new File(nomeArquivo);
        System.out.println("Dados carregados de: " + file.getAbsolutePath());
    }
}
