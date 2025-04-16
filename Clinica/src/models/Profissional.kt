package models

class Profissional(
    id: Int,
    nome: String,
    cpf: String,
    tel: Int,
    email: String
) : Pessoa(id, nome, cpf, tel, email)