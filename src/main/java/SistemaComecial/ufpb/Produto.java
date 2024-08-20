package SistemaComecial.ufpb;

public class Produto {

        private String codigo;
        private String descricao;
        private double precoVenda;
        private int quantidadeEmEstoque;
        private CategoriaProduto categoria;

        public Produto(String codigo, String descricao, double precoVenda, int quantidadeEmEstoque, CategoriaProduto categoria) {
            this.codigo = codigo;
            this.descricao = descricao;
            this.precoVenda = precoVenda;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
            this.categoria = categoria;
        }

        public String getCodigo() {
            return codigo;
        }

        public String getDescricao() {
            return descricao;
        }

        public double getPrecoVenda() {
            return precoVenda;
        }

        public int getQuantidadeEmEstoque() {
            return quantidadeEmEstoque;
        }

        public CategoriaProduto getCategoria() {
            return categoria;
        }

        public void setPrecoVenda(double precoVenda) {
            this.precoVenda = precoVenda;
        }

        public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }

        public void setCategoria(CategoriaProduto categoria) {
            this.categoria = categoria;
        }
    }

