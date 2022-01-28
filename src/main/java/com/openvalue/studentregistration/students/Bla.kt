package com.openvalue.studentregistration.students

val ConnectionManager.FunctionGroupB: FunctionGroupB
    get() = FunctionGroupB(this)

val ConnectionManager.FunctionGroupA: FunctionGroupA
    get() = FunctionGroupA(this)

object ConnectionManager {

}

class FunctionGroupA(val manager: ConnectionManager) {
    //From manager get the connection
    //Call SomeThing with connection
    fun list(arg3: String): String {
        println("${manager.host} -> Group A")
        return arg3
    } //Some call result
}

class FunctionGroupB(val manager: ConnectionManager) {
    //From manager get the connection
    //Call SomeThing with connection
    fun list(arg3: String): String {
        println("${manager.host} -> Group B")
        return arg3
    }
}


fun main() {
    //Dit werkt
    val x = ConnectionManager("localhost")

    x.FunctionGroupA.list("Function group A")
    x.FunctionGroupB.list("Function group B")

}