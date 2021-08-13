package com.example

import io.ktor.server.engine.*
import io.ktor.server.jetty.*
import com.example.plugins.*

fun main() {
    embeddedServer(Jetty, port = 8080, host = "127.0.0.1") {
        configureRouting()
    }.start(wait = true)
}
