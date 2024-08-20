package SistemaComecial.ufpb;

public class ClientePj extends Cliente {
        private String CNPJ;

        public  ClientePj(String nome, String endereco, String email, String CNPJ) {
            super(nome, endereco, email);
            this.CNPJ = CNPJ;
        }

        public String getID() {
            return CNPJ;
        }
}
