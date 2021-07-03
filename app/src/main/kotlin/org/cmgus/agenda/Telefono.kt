package org.cmgus.agenda

class Telefono(private var numero: String, private var operador: OperadorTelefonico) {
    // Considerar si la función es necesaria
    fun buscarDuplicado(telefonos: ArrayList<Telefono>) =
            telefonos.map { it.numero() }.contains(numero)
    fun numero(): String = numero
    override fun toString(): String = "- $numero $operador"
}
