import java.util.*
import kotlin.collections.ArrayList

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
    holaMundo("Fernando")
    holaMundoAvanzado(2)
    val total = sumarDosNumeros(1,3)
    print(total)

    val arregloCumpleanos = intArrayOf(1,2,3,4)
    val arregloTodo: Array<Any> = arrayOf(1, "asd", 10.2,true)

    arregloCumpleanos[0] = 5
    arregloCumpleanos.set(0,5)
    println(arregloTodo[0])

    //arregloTodo = arrayOf(5,2,3,4)

    //val fecha = Date()
    //fecha.time = 11231231
    //fecha.year = 2000
    //fecha = Date(1989,10,10)

    //val notas:ArrayList<Int> = arrayListOf<Int>(1,2,3,4,5,6)

    val notas= arrayListOf(1,2,3,4,5,6)
    // FOR EACH -> Itera el arreglo
    notas.forEachIndexed { indice, nota ->
        println("Indice: $indice")
        println("Nota: $nota")

        // return Unit
    }
    // MAP -> itera y modifica el arreglo
    val notasDos = notas.map{nota ->
        nota + 1
    }

    notasDos.forEach {
        println("Notas 2: $it")
    }

    val notasTres = notas.map{nota ->
        if (nota % 2 == 0)
            nota + 2
        else
            nota +1
    }

    val notasTresWhen = notas.map{nota ->
        when (nota % 2){
            0 -> {
                nota + 1
            }else -> {
                nota + 2
            }

        }
    }

    notasTresWhen.forEach {
        println("Notas 3: $it")
    }
}

fun holaMundo(mensaje: String){
    println("Mensaje: $mensaje.")
}

fun holaMundoAvanzado(mensaje: Any){
    println("Mensaje: $mensaje.")
}

fun sumarDosNumeros(numUno:Int, numDos: Int): Int{
    return numUno + numDos
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