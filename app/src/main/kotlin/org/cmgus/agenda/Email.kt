package org.cmgus.agenda

class Email(private val usuario: String, private val servidor: String) {
    fun direccion() = "$usuario@$servidor"
}
