package br.com.silvanopessoa.rest.service;

import org.springframework.stereotype.Service;

import br.com.silvanopessoa.rest.api.model.Usuario;

/**
 * O(a) Class UsuarioService.
 *
 * @author silvano.pessoa
 * @since 16/11/2014 - 22:54:22
 */
@Service
public class UsuarioService {

    /**
     * Find by login and cliente id.
     *
     * @param login o(a) login
     * @param clienteId o(a) cliente id
     * @return the usuario
     */
    public Usuario findByLoginAndClienteId(String login, String clienteId) {
        return null;
    }

    /**
     * Verifica se é new usuario.
     *
     * @author silvano.pessoa
     * @param login o(a) login
     * @return true, se for new usuario
     */
    public boolean isNewUsuario(String login, String clienteId) {
        return login == null || this.findByLoginAndClienteId(login, clienteId) == null;
    }

    /**
     * Atualiza o(a) usuario.
     *
     * @param login o(a) login
     * @param usuario o(a) usuario
     * @param clienteId o(a) cliente id
     * @return the usuario
     */
    public Usuario updateUsuario(String login, Usuario usuario, String clienteId) {
        return null;
    }
}