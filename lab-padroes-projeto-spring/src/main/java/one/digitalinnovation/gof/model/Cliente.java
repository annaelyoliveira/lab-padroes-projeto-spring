package one.digitalinnovation.gof.model;
@Entity
public class Cliente {
    
    private Long id;
    
    private String nome;
    private String email;
    
    private Endereco endereco; // Adicionando o atributo endereco

    // Construtor padrão
    public Cliente() {
    }

    // Construtor com parâmetros
    public Cliente(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nome='" + nome + "', email='" + email + "', endereco=" + endereco + "}";
    }
}
