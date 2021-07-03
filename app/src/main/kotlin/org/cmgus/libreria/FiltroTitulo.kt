package org.cmgus.libreria

class FiltroTitulo(private val titulo: String) : CriterioFiltro {

    override fun esSeleccionable(libro: Libro): Boolean {
        return if (libro.titulo() === titulo) true else false
    }
}
