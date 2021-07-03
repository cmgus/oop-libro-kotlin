package org.cmgus.libreria

class Autor(private val nombre: String, private val apellido: String) {
    fun nombre() = nombre
    fun apellido() = apellido
    override fun toString() = "$nombre $apellido"
}
