package org.cmgus.pag120

class Perro(private var nombre: String, private var color: String) {
    var estomagoEstaLleno: Boolean = false

    fun comer() = hacerDigestion()
    fun tocan(lugar: String) = when (lugar) {
        "cabeza" -> moverCola()
        else -> "No hace nada"
    }
    private fun moverCola() = "Estoy moviendo la cola"
    private fun hacerNecesidades() = "Hago caquiña"
    private fun hacerDigestion() = when (estomagoEstaLleno) {
        true -> {
            estomagoEstaLleno = false
            hacerNecesidades()
        }
        else -> "No hace nada"
    }
}
