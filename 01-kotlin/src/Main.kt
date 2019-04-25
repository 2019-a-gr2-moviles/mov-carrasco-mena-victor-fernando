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

    val respuestaFilter = notas
        .filter {// Filtar el arreglo
        it in 3..4
        // it > 2 && it < 5
        }.map {// Mutar o cambiar el arreglo
            it * 2
        }

    respuestaFilter.forEach { println(it) }

    val novias = arrayListOf(1 ,2, 3, 4, 5)

    val respuestaNovia = novias.any {
        it == 3
    }

    println(respuestaNovia)// true

    val tazos = arrayListOf(1,2,3,4,5,6,7,8,9)

//    val respuestaTazos = tazos.all{
//        it > 1 //Todos son?
//    }

//    println(respuestaTazos)//falso

    val totalTazos = tazos.reduce{ valorAcumulado, tazo ->
        valorAcumulado + tazo
    }

    println(totalTazos)

    val numerito = Numero("1")

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

class Usuario(val cedula:String){
    var nombre:String = ""
    var apellido:String = ""

    constructor(cedulaM:String,apellido:String ):this(cedulaM){

        this.apellido=apellido
    }

}

class UsuarioKT(var nombre:String,
                var apellido: String,
                private var id:Int,
                protected var id_:Int){

    init{

    }
    public fun hola():String{
        return this.apellido
    }
    private fun hola2(){

    }
    protected fun hola3(){

    }

    companion object {
        val gravedad = 10.5
        fun correr(){
            println("Estoy corriendo en $gravedad")
        }
    }
}

class BaseDeDatos{
    companion object {
        val usuarios = arrayListOf(1,2,3)
        fun agregarUsuario(usuario: Int){
            this.usuarios.add(usuario)
        }
        fun eliminarUsuario(usuario: Int){
            // this.usuarios
        }
    }
}

fun aa(){
    UsuarioKT.gravedad// propiedad estática
    UsuarioKT.correr()// metodo estática
}

/*fun a(){
    var adrian = UsuarioKT("a","b")
    adrian.nombre="asas"
}*/

class Numero(var numero:Int){

    constructor(numeroString:String):this(numeroString.toInt()){
        println("cosntructor")
    }
    init {
        println("Init")
    }
}

class A{
    //A.correr() // Metodo Estática
}

open class Numeros(var numeroUno:Int,
              var numeroDos:Int){

}

class Suma(numeroUnos:Int,
           numeroDoss:Int):
    Numeros(numeroUnos,numeroDoss){

}
fun cc(){
    val a = Suma(1,2)

}

fun presley(requerido:Int,
            opcional:Int = 1,
            nulo:Int?){//Este valor aveces puede tener un valor nulo
    if(nulo != null){
        nulo.nombre
    }
    val nombresito:String? = nulo?.nombre.toString()// Elvis operator
    nulo!!.nombre

}
fun cddd(){
    presley(requerido = 1,nulo = 0)//named parameters
    presley(1,1,1)
    presley(1,1,null)
}

