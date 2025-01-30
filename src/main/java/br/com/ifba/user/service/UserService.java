package br.com.ifba.user.service;

import java.util.List;
import br.com.ifba.user.entity.User;

// Interface que define os métodos do serviço para manipulação de objetos User
public interface UserService {

    // Método para salvar um objeto User no sistema
    public User save(User user);

    // Método para buscar todos os objetos User no sistema
    public List<User> findAll();

    // Método para excluir um objeto User com base no ID fornecido
    public void delete(Long id);

    // Método para atualizar um objeto User existente no sistema
    public User update(User user);

    // Método para buscar através do Id no sistema
    public User findById(Long id);
}