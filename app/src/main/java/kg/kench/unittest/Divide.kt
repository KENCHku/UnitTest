package kg.kench.unittest

class Divide {

    fun divide(a: String, b: String): String{
        var result = ""

        if (b == "0"){
            result = "Can't divide by zero"
        }else
        try {
            result = (a.toDouble() / b.toDouble()).toInt().toString()
        }catch (ex: Exception){
            result = "Error: ${ex.message}"
        }
        return result
    }
}