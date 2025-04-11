package model;

import java.io.*;
import java.util.ArrayList;

public class PessoaFisicaRepo implements Serializable {
    private ArrayList<PessoaFisica> listaPessoaFisica = new ArrayList<>();

    public void inserir(PessoaFisica pf) {
        listaPessoaFisica.add(pf);
    }

    public void alterar(PessoaFisica pf) {
        for (int i = 0; i < listaPessoaFisica.size(); i++) {
            if (listaPessoaFisica.get(i).getId() == pf.getId()) {
                listaPessoaFisica.set(i, pf);
                return;
            }
        }
    }

    public void excluir(int id) {
        listaPessoaFisica.removeIf(pf -> pf.getId() == id);
    }

    public PessoaFisica obter(int id) {
        for (PessoaFisica pf : listaPessoaFisica) {
            if (pf.getId() == id) {
                return pf;
            }
        }
        return null;
    }

    public ArrayList<PessoaFisica> obterTodos() {
        return listaPessoaFisica;
    }

    public void persistir(String nomeArquivo) throws Exception {
        FileOutputStream fos = new FileOutputStream(nomeArquivo);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(listaPessoaFisica);
        oos.close();

        File file = new File(nomeArquivo);
        System.out.println("Arquivo salvo em: " + file.getAbsolutePath());
    }

    public void recuperar(String nomeArquivo) throws Exception {
        FileInputStream fis = new FileInputStream(nomeArquivo);
        ObjectInputStream ois = new ObjectInputStream(fis);
        listaPessoaFisica = (ArrayList<PessoaFisica>) ois.readObject();
        ois.close();

        File file = new File(nomeArquivo);
        System.out.println("Dados carregados de: " + file.getAbsolutePath());
    }
}
