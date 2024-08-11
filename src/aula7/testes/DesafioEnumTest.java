package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula6.outros.Desafio;
import aula6.outros.Evento;
import aula6.outros.enums.TipoEvento;

class DesafioEnumTest {

    public List<Evento> listaEventos;

    @BeforeEach
    void setup() {
        listaEventos = new ArrayList<>();
        listaEventos.add(new Evento("Formatura", LocalDateTime.of(2024, 8, 5, 19, 0), TipoEvento.SOCIAL));
        listaEventos.add(new Evento("Reunião de Trabalho", LocalDateTime.of(2024, 8, 10, 9, 0), TipoEvento.PROFISSIONAL));
        listaEventos.add(new Evento("Show de Música", LocalDateTime.of(2020, 9, 15, 21, 0), TipoEvento.LAZER));
        listaEventos.add(new Evento("Academia", LocalDateTime.of(2024, 8, 20, 14, 0), TipoEvento.OUTROS));
        listaEventos.add(new Evento("Futebol", LocalDateTime.of(2022, 12, 25, 12, 0), TipoEvento.LAZER));
    }

    @DisplayName("Teste para evento inválido")
    @Test
    void deveLancarExcecaoParaEventoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            TipoEvento.valueOf("INVALIDO");
        }, "Esperava uma exceção de tipo IllegalArgumentException");
    }

    @DisplayName("Teste para tipo de evento que não está na lista")
    @Test
    void deveRetornarListaVaziaParaTipoNaoExistente() {
        List<Evento> resultado = Desafio.filtrarEventosPorTipo(listaEventos, TipoEvento.OUTROS);
        assertEquals(1, resultado.size(), "Deveria retornar 1 evento na categoria 'OUTROS'");
    }

    @DisplayName("Teste retornando apenas eventos de uma categoria")
    @Test
    void deveRetornarApenasEventosDeUmaCategoria() {
        List<Evento> resultado = Desafio.filtrarEventosPorTipo(listaEventos, TipoEvento.SOCIAL);
        assertEquals(1, resultado.size(), "Deveria retornar apenas 1 evento na categoria 'SOCIAL'");
        assertEquals("Formatura", resultado.get(0).getNome());
    }

    @DisplayName("Teste retornando eventos de ambas as categorias")
    @Test
    void deveRetornarEventosDeDuasCategorias() {
        List<Evento> resultadoLazer = Desafio.filtrarEventosPorTipo(listaEventos, TipoEvento.LAZER);
        List<Evento> resultadoProfissional = Desafio.filtrarEventosPorTipo(listaEventos, TipoEvento.PROFISSIONAL);

        assertEquals(2, resultadoLazer.size(), "Deveria retornar 2 eventos na categoria 'LAZER'");
        assertEquals(1, resultadoProfissional.size(), "Deveria retornar 1 evento na categoria 'PROFISSIONAL'");
    }

    @DisplayName("Teste para eventos futuros")
    @Test
    void deveRetornarEventosFuturos() {
        LocalDateTime agora = LocalDateTime.of(2023, 8, 10, 12, 0);  // Exemplo de data atual
        List<Evento> eventosFuturos = Desafio.obterEventosFuturos(listaEventos, agora);

        assertEquals(3, eventosFuturos.size(), "Deveria retornar 3 eventos futuros");
    }

    @DisplayName("Teste para eventos passados")
    @Test
    void deveRetornarEventosPassados() {
        LocalDateTime agora = LocalDateTime.of(2023, 8, 10, 12, 0); 
        List<Evento> eventosPassados = Desafio.obterEventosPassados(listaEventos, agora);

        assertEquals(2, eventosPassados.size(), "Deveria retornar 2 eventos passados");
    }
}


