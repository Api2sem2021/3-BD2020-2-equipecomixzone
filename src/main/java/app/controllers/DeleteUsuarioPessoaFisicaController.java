package app.controllers;

import app.models.repository.UsuarioPessoaFisicaRepository;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteUsuarioPessoaFisicaController {
    private static final Logger LOGGER = Logger.getLogger(DeleteUsuarioPessoaFisicaController.class.getName());
    private static final String MENSAGEM_ERRO_DELETE = "Não Foi Possível Deletar os Registros";
    private static final String MENSAGEM_SUCESSO_DELETE = "O Registro foi Deletado com Sucesso";

    private final UsuarioPessoaFisicaRepository usuarioPessoaFisicaRepository = new UsuarioPessoaFisicaRepository();

    public final Route deleteUsuarioPessoaFisica = (Request request, Response response) -> {
        try {
            usuarioPessoaFisicaRepository.deleteUsuarioPessoaFisica(request.params(":cpf"));
            response.status(204);
            response.body(MENSAGEM_SUCESSO_DELETE);
        } catch (Exception e) {
            LOGGER.log(Level.INFO, e.getMessage());
            response.status(500);
            response.body(MENSAGEM_ERRO_DELETE);
        }
        return response.body();
    };
}
