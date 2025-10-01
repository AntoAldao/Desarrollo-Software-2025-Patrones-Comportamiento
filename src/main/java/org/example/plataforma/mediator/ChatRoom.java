package org.example.plataforma.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * PATRÓN MEDIATOR:
 * ChatRoom actúa como "mediador" centralizando la comunicación entre usuarios.
 */
public class ChatRoom implements ChatMediator {
    private final List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void enviar(String msg, Usuario remitente) {
        for (Usuario u : usuarios) {
            if (u != remitente) {
                u.recibir(msg, remitente);
            }
        }
    }

    @Override
    public void registrar(Usuario u) {
        if (!usuarios.contains(u)) {
            usuarios.add(u);
        }
    }
}
