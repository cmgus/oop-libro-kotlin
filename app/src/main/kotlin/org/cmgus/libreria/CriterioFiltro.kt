package org.cmgus.libreria

interface CriterioFiltro {
    fun esSeleccionable(libro: Libro): Boolean
}
