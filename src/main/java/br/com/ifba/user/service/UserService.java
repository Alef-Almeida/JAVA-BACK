package br.com.ifba.user.service;

import java.util.List;
import br.com.ifba.user.entity.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;


// Interface que define os métodos do serviço para manipulação de objetos User
public interface UserService {

    // Método para salvar um objeto User no sistema
    public User save(User user);

    // Método para buscar todos os objetos User no sistema
    public Page<User> findAll(Pageable pageable);

    // Método para excluir um objeto User com base no ID fornecido
    public void delete(Long id);

    // Método para atualizar um objeto User existente no sistema
    public User update(User user);

    // Método para buscar através do Id no sistema
    public User findById(Long id);


    User login(@Size(min = 4, max = 30, message = "Minimo 4 Caracteres e Maximo 30") String login, @NotBlank(message = "A senha nao pode ser vazia!") String password);
}