package org.cmgus.agenda

val nt = arrayListOf("123-123", "234-234", "345-345", "456-456", "567-567", "678-678")

val ot = arrayListOf("Pillofón", "Movistar", "Entel", "Bitel", "Claro")

class Agenda {
    private val contactos = ArrayList<Contacto>()

    fun buscarContactoPorNumeroTelefono(numeroTelefono: String): Contacto? =
            contactos.find { it.buscarTelefono(numeroTelefono) }

    fun buscarContactoPorDireccionEmail(direccionEmail: String): Contacto? =
            contactos.find { it.buscarEmail(direccionEmail) }

    fun listarUltimos10Contactos() {
        contactos.forEach { println(it) }
    }

    fun addContacto(nuevoContacto: Contacto): Boolean {
        for (telefonoDelNuevoContacto in nuevoContacto.telefonos()) {
            if (buscarContactoPorNumeroTelefono(telefonoDelNuevoContacto.numero()) !== null)
                    return false
        }
        contactos.add(nuevoContacto)
        return true
        /* for (contacto in contactos) {
            for (telefonoNuevoContacto in nuevoContacto.telefonos()) {
                if (telefonoNuevoContacto.buscarDuplicado(contacto.telefonos())) return false
            }
        }
        contactos.add(nuevoContacto)
        return true */
    }
    companion object Run {
        fun init() {
            val agenda = Agenda()
            println(
                    "> Contacto agregado? - " +
                            agenda.addContacto(
                                    Contacto(
                                            "Gustavo",
                                            arrayOf(
                                                    arrayOf("123-123", "PilloFon"),
                                                    arrayOf("234-233", "Bitel")),
                                            arrayOf(arrayOf("cmgus", "xyz")))))
            println(
                    "> Contacto agregado? - " +
                            agenda.addContacto(
                                    Contacto(
                                            "Fermin",
                                            arrayOf(
                                                    arrayOf("345-345", "PilloFon"),
                                                    arrayOf("234-234", "Bitel")),
                                            arrayOf(arrayOf("ferm", "xyz")))))
            // agenda.listarUltimos10Contactos()
            println(agenda.buscarContactoPorNumeroTelefono("123-123") ?: "No econtrado")
            println(agenda.buscarContactoPorDireccionEmail("ferm@xyz") ?: "No econtrado")
            println(agenda.buscarContactoPorDireccionEmail("cmgus@xyz") ?: "No econtrado")
            // val agenda = Agenda()
            // val nuevoContactoC = Contacto("CCC")
            // println("> addTelefono " + nuevoContactoC.addTelefono(nt[3], ot[3]))
            /* println(
                            "> addTelefono " +
                                            if (!agenda.existeElNumero(nt[2]))
                                                            nuevoContactoC.addTelefono(
                                                                            nt[2],
                                                                            ot[4])
                                            else "El número ya existe")
            println(
                            "> addTelefono " +
                                            if (!agenda.existeElNumero(nt[5]))
                                                            nuevoContactoC.addTelefono(
                                                                            nt[5],
                                                                            ot[3])
                                            else "El número ya existe") */
            // agenda.addContacto(nuevoContactoC)

            // println(Agenda().buscarTelefono("456-654") ?: "No encontrado")
            // println(agenda.buscarTelefono(nt[5]) ?: "No encontrado")
            // println(agenda.buscarTelefono(nt[0]) ?: "No encontrado")
        }
    }
}
