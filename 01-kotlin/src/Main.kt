fun main(args: Array<String>){
    /*
    *   Comentario
     */
    //Variables
    // QUE ES MUTAR? CAMBIAR??
    //MUTABLES
    //var nombre = "Fercho"
    //nombre = "Victor"
    // Inmutables
    val nombre = "Fernando"
    //nombreI = "Victor"

    //Tipos de datos
    val apellido: String = "Carrasco"
    val edad: Int = 29
    val sueldo: Double = 1.21
    val casado: Boolean = false
    val profesor: Boolean = true
    val hijos = null

    //Duck Typing
    // Si parece un pato
    // Si camina como pato
    // Si suena como pato
    // Si vuela como pato
    // PATO

    //Condicionales
    if(apellido=="Carrasco" && nombre=="Fernando"){
        println("Verdadero")
    }else{
        println("Falso")
    }

    val tieneNombreYApellido = if (apellido!=null && nombre!=null) "ok" else "no"
    println(tieneNombreYApellido)

    estaJalado(1.0)
    estaJalado(8.0)
    estaJalado(0.0)
    estaJalado(7.0)
    estaJalado(10.0)
}

fun estaJalado(nota: Double):Double{
    when (nota){
        7.0 ->{
            println("Pasaste con las justas")
        }
        10.0 ->{
            println("Felicitaciones")
        }
        0.0 ->{
            println("Dios mio que vago!")
        }
        else -> {
            println("Tu nota es: $nota")
            // println("Tu nota es: ${nota}")
        }
    }
    return nota
}