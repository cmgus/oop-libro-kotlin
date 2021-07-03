package org.cmgus.libreria

class Libreria {

    private val libros = arrayListOf<Libro>()

    fun addLibro(titulo: String, tema: String, `año`: Int) = libros.add(Libro(titulo, tema, `año`))

    fun busqueda(filtro: CriterioFiltro) = libros.filter { filtro.esSeleccionable(it) }

    fun addLibroAutor(titulo: String, nombre: String, apellido: String) =
            libros.forEach { if (it.titulo() === titulo) it.addAutor(nombre, apellido) }

    fun imprimirLibros(libros: List<Libro>) = libros.forEach { println("\t- $it") }

    companion object Run {
        fun init() {
            val lib = Libreria()
            lib.addLibro("Introducción a Java", "Java", 2007)
            lib.addLibro("Introduccion a PHP", "PHP", 2008)
            lib.addLibro("Introduccion a los Patrones de Diseño", "Patrones", 2007)
            lib.addLibro("Introduccion a Zend Framework", "Zend", 2008)

            lib.addLibroAutor("Introduccion a PHP", "Enrique", "Place")

            println("Libros del año 2008:")
            lib.imprimirLibros(lib.busqueda(FiltroAnual(2007)))
            println("Libros del Autor:")
            lib.imprimirLibros(lib.busqueda(FiltroAutor("Enrique", "Place")))
            println("Libros del Tema:")
            lib.imprimirLibros(lib.busqueda(FiltroTema("Patrones")))
            println("Libros del Título:")
            lib.imprimirLibros(lib.busqueda(FiltroTitulo("Introduccion a Zend Framework")))
        }
    }
}
