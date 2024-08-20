package SistemaComecial.ufpb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SistemaComecialMap {
        private Map<String, Cliente> clientes = new HashMap<>();
        private Map<String, Produto> produtos = new HashMap<>();

        public boolean cadastraCliente(Cliente cliente) {
            if (!clientes.containsKey(cliente.getID())) {
                clientes.put(cliente.getID(), cliente);
                return true;
            }
            return false;
        }

        public boolean removeCliente(String id) {
            return clientes.remove(id) != null;
        }

        public Cliente pesquisaCliente(String id) {
            return clientes.get(id);
        }

    public Collection<Cliente> pesquisaClientesComNomeComecandoComPrefixo(String prefixo) {
        Collection<Cliente> clientesEncontrados = new ArrayList<>();
        for (Cliente cliente : clientes.values()) {
            if (cliente.getNome().startsWith(prefixo)) {
                clientesEncontrados.add(cliente);
            }
        }
        return clientesEncontrados;
    }
        public boolean cadastraProduto(Produto produto) {
            if (!produtos.containsKey(produto.getCodigo())) {
                produtos.put(produto.getCodigo(), produto);
                return true;
            }
            return false;
        }

        public boolean removeProduto(String codigo) {
            return produtos.remove(codigo) != null;
        }

        public Produto pesquisaProduto(String codigo) {
            return produtos.get(codigo);
        }

    public Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria) {
        Collection<Produto> produtosEncontrados = new ArrayList<>();
        for (Produto produto : produtos.values()) {
            if (produto.getCategoria() == categoria) {
                produtosEncontrados.add(produto);
            }
        }
        return produtosEncontrados;
    }

    }

