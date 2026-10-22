
package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    sincronizarEstudiantes()
    consultarCursos()
    descargarEvaluaciones()
    actualizarAsistencia()
}

suspend fun sincronizarEstudiantes() {
    println("Iniciando sincronización de estudiantes...")
    delay(3000)
    println("Sincronización de estudiantes terminada.")
}

suspend fun consultarCursos() {
    println("Iniciando consulta de cursos...")
    delay(2000)
    println("Consulta de cursos terminada.")
}

suspend fun descargarEvaluaciones() {
    println("Iniciando descarga de evaluaciones...")
    delay(4000)
    println("Descarga de evaluaciones terminada.")
}

suspend fun actualizarAsistencia() {
    println("Iniciando actualización de asistencia...")
    delay(3000)
    println("Actualización de asistencia terminada.")
}


