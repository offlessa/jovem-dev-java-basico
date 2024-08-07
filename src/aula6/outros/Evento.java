package aula6.outros;

import java.time.LocalDateTime;

import aula6.outros.enums.TipoEvento;

public class Evento {
	private String descricao;
	private LocalDateTime dataHora;
	private TipoEvento tipo;

	public Evento(String descricao, LocalDateTime dataHora, TipoEvento tipo) {
		this.descricao = descricao;
		this.dataHora = dataHora;
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public TipoEvento getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return descricao + " (Data e Hora: " + dataHora + ")";
	}
}