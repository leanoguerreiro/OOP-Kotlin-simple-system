package utils

fun validateCpf(cpf: String): Boolean {
    return cpf.toString().length == 11
}

fun validateEmail(email: String): Boolean {
    val regex = "^[A-Za-z0-9+_.-]+@(.+)\$".toRegex()
    return regex.matches(email)
}