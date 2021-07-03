package org.cmgus.libreria

class FiltroAutor(private val nombre: String, private val apellido: String) : CriterioFiltro {

    override fun esSeleccionable(libro: Libro): Boolean {
        return if (libro.autores().find { it.nombre() === nombre && it.apellido() === apellido } !==
                null)
                true
        else false
    }
}
