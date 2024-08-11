package aula6.outros;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import aula6.outros.enums.TipoEvento;

public class Desafio {

    public static List<Evento> filtrarEventosPorTipo(List<Evento> eventos, TipoEvento tipo) {
        return eventos.stream()
                .filter(e -> e.getTipo() == tipo)
                .collect(Collectors.toList());
    }

    public static List<Evento> obterEventosPassados(List<Evento> eventos, LocalDateTime agora) {
        return eventos.stream()
                .filter(e -> e.getDataHora().isBefore(agora))
                .collect(Collectors.toList());
    }

    public static List<Evento> obterEventosFuturos(List<Evento> eventos, LocalDateTime agora) {
        return eventos.stream()
                .filter(e -> e.getDataHora().isAfter(agora))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Evento> eventos = new ArrayList<>();
        eventos.add(new Evento("Formatura", LocalDateTime.of(2024, 8, 5, 19, 0), TipoEvento.SOCIAL));
        eventos.add(new Evento("Reunião de Trabalho", LocalDateTime.of(2024, 8, 10, 9, 0), TipoEvento.PROFISSIONAL));
        eventos.add(new Evento("Show de Música", LocalDateTime.of(2020, 9, 15, 21, 0), TipoEvento.LAZER));
        eventos.add(new Evento("Academia", LocalDateTime.of(2024, 8, 20, 14, 0), TipoEvento.OUTROS));
        eventos.add(new Evento("Futebol", LocalDateTime.of(2022, 12, 25, 12, 0), TipoEvento.LAZER));

        String tipoDoEvento = "SOCIAL"; 

        if (tipoDoEvento != null) {
            tipoDoEvento = tipoDoEvento.toUpperCase();
            System.out.println("Tipo de evento: " + tipoDoEvento);

            TipoEvento tipoSelecionado;
            try {
                tipoSelecionado = TipoEvento.valueOf(tipoDoEvento);
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo de evento inválido.");
                return;
            }

            List<Evento> eventosSelecionados = filtrarEventosPorTipo(eventos, tipoSelecionado);

            LocalDateTime agora = LocalDateTime.now();
            List<Evento> eventosPassados = obterEventosPassados(eventosSelecionados, agora);
            List<Evento> eventosFuturos = obterEventosFuturos(eventosSelecionados, agora);

            System.out.println("Eventos já ocorridos:");
            if (eventosPassados.isEmpty()) {
                System.out.println("Nenhum evento encontrado.");
            } else {
                eventosPassados.forEach(System.out::println);
            }

            System.out.println("Próximos eventos:");
            if (eventosFuturos.isEmpty()) {
                System.out.println("Nenhum evento encontrado.");
            } else {
                eventosFuturos.forEach(System.out::println);
            }
        }
    }
}

