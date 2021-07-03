package org.cmgus.pag120

class Persona(private var edad: Int, private var nombre: String) {
    private var hermanos = arrayListOf<Persona>()
    private var perros = arrayListOf<Perro>()
    private var gatos = arrayListOf<Gato>()

    fun tocar(objeto: Any, lugar: String) = when (objeto) {
        is Perro -> objeto.tocan(lugar)
        is Gato -> objeto.tirarCola()
        else -> "No hace nada"
    }
    fun darComer(objeto: Any) = when (objeto) {
        is Perro -> objeto.comer()
        else -> "No hace nada"
    }
    fun addHermano(hermano: Persona) {
        hermanos.add(hermano)
    }
    fun addPerro(perro: Perro) {
        perros.add(perro)
    }
    fun addGato(gato: Gato) {
        gatos.add(gato)
    }
    override fun toString(): String = nombre
}
