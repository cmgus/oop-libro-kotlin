package org.cmgus.pag120

class Pag120 {

    companion object {
        fun init() {
            var micaela = Persona(5, "Macaela")
            var perro = Perro("Tito", "negro")
            micaela.addPerro(perro)

            var martina = Persona(3, "Martina")
            martina.addPerro(perro)

            micaela.addHermano(martina)
            martina.addHermano(micaela)
            var marcos = Persona(6, "Marcos")
            var gato = Gato()
            marcos.addGato(gato)
            println(gato.tirarCola())
            var escuela = Escuela("GG")
            escuela.addAlumno(micaela)
            escuela.addAlumno(martina)
            escuela.addAlumno(marcos)

            println(escuela)

            println(marcos.tocar(perro, "cabeza"))
        }
    }
}
