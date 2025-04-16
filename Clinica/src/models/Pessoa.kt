package models

abstract class Pessoa(
    val id: Int,
    val nome: String,
    protected val cpf: String,
    var tel: Int,
    var email: String,
) {
    abstract fun getCPF(): String

    abstract override fun toString(): String
}