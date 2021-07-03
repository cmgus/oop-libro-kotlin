package org.cmgus.agenda

class OperadorTelefonico(private var nombre: String) {
    fun nombre(): String = nombre
    override fun toString(): String = "[$nombre]"
}
