package SistemaComecial.ufpb;

public class ClientePf extends Cliente {
        private String CPF;

        public ClientePf(String nome, String endereco, String email, String CPF) {
            super(nome, endereco, email);
            this.CPF = CPF;
        }

        public String getID() {
            return CPF;
        }



}
