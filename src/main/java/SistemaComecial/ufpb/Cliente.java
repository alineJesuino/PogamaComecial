package SistemaComecial.ufpb;

public class Cliente {
        private String nome;
        private String endereco;
        private String email;

        public Cliente(String nome, String endereco, String email) {
            this.nome = nome;
            this.endereco = endereco;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public String getEmail() {
            return email;
        }

        public String getID() {
            return null;
        }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome  +
                ", endereco='" + endereco +
                ", email='" + email  +
                '}';
    }
}





