package models

class Admin(
    id: Int,
    nome: String,
    cpf: String,
    tel: Int,
    email: String
) : Pessoa(id, nome, cpf, tel, email){

    override fun getCPF(): String{
        return cpf
    }

    override fun toString() : String{
        return """
            id: $id
            Nome: $nome
            CPF: ${getCPF()}
            tel: $tel
            Email: $email
        """.trimIndent()
    }
}