package org.cmgus.pag120

class Escuela(private var nombre: String) {
    private var alumnos = arrayListOf<Persona>()
    fun addAlumno(alumno: Persona) {
        alumnos.add(alumno)
    }
    override fun toString(): String {
        var retorno = ""
        for (alumno in alumnos) {
            retorno += "|¬ $alumno ¬|"
        }
        return retorno
    }
}
