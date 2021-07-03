package org.cmgus.agenda

import org.junit.Test
import org.junit.BeforeClass
import strikt.api.expectThat
import strikt.assertions.*

val agenda = Agenda()
agenda.addContacto(Contacto(
    "Gustavo",
    arrayOf(
            arrayOf("123-123", "PilloFon"),
            arrayOf("234-234", "Bitel")),
    arrayOf(arrayOf("cmgus", "xyz"))))

class AgendaTest {
    @BeforeClass
    fun bef() {
        println()
    }
    @Test
    fun `agregar nuevo contacto con numeros no registrados y deberia retornar true`() {
        expectThat(
                        agenda
                                .addContacto(
                                        Contacto(
                                                "Gustavo",
                                                arrayOf(
                                                        arrayOf("345-345", "PilloFon")),
                                                arrayOf(arrayOf("cmgus", "xyz")))))
                .isTrue()
    }
    @Test
    fun `agregar nuevo contacto con numeros registrados y deberia retornar false`() {
        Agenda()
                .addContacto(
                        Contacto(
                                "Gustavo",
                                arrayOf(
                                        arrayOf("123-123", "PilloFon"),
                                        arrayOf("234-234", "Bitel")),
                                arrayOf(arrayOf("cmgus", "xyz"))))
        expectThat(
                        Agenda()
                                .addContacto(
                                        Contacto(
                                                "Fermin",
                                                arrayOf(
                                                        arrayOf("345-345", "PilloFon"),
                                                        arrayOf("234-234", "Bitel")),
                                                arrayOf(arrayOf("cmgus", "xyz")))))
                .isFalse()
    }
    @Test
    fun `verficar si un numero existe y deberia retornar false`() {
        // val agenda = Agenda()
        // val contactoA = Contacto("AAA")
        // contactoA.addTelefono("234-234", "Entel")
        // agenda.addContacto(contactoA)

        // val nuevoContacto = Contacto("Nuevo")
        // nuevoContacto.addTelefono("234-234", "Pillofón")

    }
}
