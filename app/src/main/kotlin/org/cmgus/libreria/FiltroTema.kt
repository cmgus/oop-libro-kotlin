package org.cmgus.libreria

class FiltroTema(private val tema: String) : CriterioFiltro {

    override fun esSeleccionable(libro: Libro): Boolean {
        return if (libro.tema() === tema) true else false
    }
}
