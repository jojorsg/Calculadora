package br.com.josue.calc.model;

@FunctionalInterface
public interface MemoriaObservador {

    void valorAlterado(String novoValor);
}
