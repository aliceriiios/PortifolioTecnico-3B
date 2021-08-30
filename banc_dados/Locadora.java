package locadora;

public class Locadora {
    
    public static void main(String[] args) {
        Banco.cria_tabela("Dvd", "cod int primary key", "titulo varchar", "estoque int", "diretor varchar", "producao varchar", "genero varchar", "prazo varchar");

        Dvd l = new Dvd();
        l.setCod(9856);
        l.setTitulo("Exterminador do Futuro");
        l.setEstoque(1);
        l.setDiretor("James Cameron");
        l.setProducao("Hemdale Film Corporation");
        l.setGenero("Ação");
        l.setPrazo("7 dias");
        Banco.salvar(l);

        Banco.visualiza_tabela("Dvd", "cod", "titulo", "estoque", "diretor", "producao", "genero", "prazo");
        
        Banco.cria_tabela("cliente", "cpf int primary key", "nome varchar", "telefone varchar", "endereco varchar");
        
        Cliente c = new Cliente();
        c.setCpf(405465080-57);
        c.setNome("CRenata Souza");
        c.setTelefone("48 996587634");
        c.setEndereco("Rua Lagos, 520");
        Banco.salvar(c);
        
        Banco.visualiza_tabela("cliente", "cpf", "nome", "telefone", "endereco");


      
    }

    private static void Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
