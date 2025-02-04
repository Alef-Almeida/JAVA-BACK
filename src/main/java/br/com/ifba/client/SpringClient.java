package br.com.ifba.client;

import br.com.ifba.user.dto.UserPostRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service // Indica ser uma classe servico gerenciado pelo spring
@Slf4j // @Slf4j permite a utilização do logger sem precisar instanciá-lo manualmente.
public class SpringClient {
    public static void main(String[] args) {
        // Criação de um WebClient para fazer requisições HTTP para a API.
        WebClient webClient = WebClient.builder()
                .baseUrl("http://localhost:8080/users") // Define a URL base da API.
                .defaultHeader(HttpHeaders.CONTENT_TYPE,
                        MediaType.APPLICATION_JSON_VALUE) // Define o cabeçalho padrão como JSON.
                .build();
        // Realiza uma requisição GET para buscar todos os usuários cadastrados.
        String getResponse = webClient.get()
                .uri("/findall")
                .retrieve()
                .bodyToMono(String.class)
                .block();
        log.info(getResponse);

        // Criação de um objeto DTO para enviar dados na requisição POST.
        UserPostRequestDto usuarioPostRequestDto = new UserPostRequestDto();
        usuarioPostRequestDto.setEmail("email@email.com");
        usuarioPostRequestDto.setPassword("password");
        usuarioPostRequestDto.setUsername("username");
        usuarioPostRequestDto.setName("name");

        // Realiza uma requisição POST para salvar um novo usuário na API.
        String postResponse = webClient.post()
                .uri("/save")
                .body(Mono.just(usuarioPostRequestDto), UserPostRequestDto.class) // Define o corpo da requisição como um objeto JSON.
                .retrieve()
                .bodyToMono(String.class)
                .block();

        log.info(postResponse);
    }
    }
