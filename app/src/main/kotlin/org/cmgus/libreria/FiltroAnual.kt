package org.cmgus.libreria

class FiltroAnual(private val `año`: Int) : CriterioFiltro {

    override fun esSeleccionable(libro: Libro): Boolean {
        return if (libro.`año`() == `año`) true else false
    }
}
