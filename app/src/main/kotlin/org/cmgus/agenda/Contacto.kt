package org.cmgus.agenda

import java.time.LocalDateTime

class Contacto {

    private val _nombre: String
    private val _telefonos: ArrayList<Telefono>
    private var _emails: ArrayList<Email>
    private val _direccion: String
    private val _fechaDeRegistro = LocalDateTime.now()

    constructor(
            nombre: String,
            telefonosFormatoPlano: Array<Array<String>>,
            emailsFormtadoPlano: Array<Array<String>> = arrayOf(),
            direccion: String = ""
    ) {
        _nombre = nombre
        _telefonos =
                telefonosFormatoPlano.map { Telefono(it[0], OperadorTelefonico(it[1])) } as
                        ArrayList
        _emails = emailsFormtadoPlano.map { Email(it[0], it[1]) } as ArrayList
        _direccion = direccion
    }

    fun addEmail(usuario: String, servidor: String) = _emails.add(Email(usuario, servidor))

    fun addTelefono(numeroTelefono: String, nombreOperador: String) =
            Telefono(numeroTelefono, OperadorTelefonico(nombreOperador))

    fun telefonos() = _telefonos

    fun buscarTelefono(numeroTelefono: String) =
            _telefonos.map { it.numero() }.contains(numeroTelefono)

    fun buscarEmail(direccionEmail: String) =
            _emails.map { it.direccion() }.contains(direccionEmail)

    override fun toString(): String =
            """
───────────────────────────────────
Nombre: $_nombre - Registrado ${_fechaDeRegistro.toLocalTime()}
Telfonos:${_telefonos.map {"\n\t" + it}.joinToString(separator = "") { it }}
Emails: ${_emails.map {"\n\t" + it.direccion()}.joinToString(separator = "") { it }}
───────────────────────────────────
"""
}
