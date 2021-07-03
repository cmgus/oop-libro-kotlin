package org.cmgus.libreria

class Libro(private val titulo: String, private val tema: String, private val `año`: Int) {
    private val autores = arrayListOf<Autor>()

    fun addAutor(nombre: String, apellido: String) = autores.add(Autor(nombre, apellido))

    fun titulo() = titulo

    fun `año`() = `año`

    fun tema() = tema

    fun autores() = autores

    override fun toString() = "$titulo"
}
