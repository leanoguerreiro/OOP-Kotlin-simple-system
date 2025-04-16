package repository

import models.Profissional


object RepositoryProfessionals {
    private val professionals = mutableListOf<Profissional>()

    //metodos auxiliares
    fun findIndexById(id: Int): Int {
        return professionals.indexOfFirst { it.id == id }
    }

    fun findByCPF(cpf: String): Boolean {
        return professionals.any { it.getCPF() == cpf}
    }

    fun existProfessionalById(id: Int): Boolean {
        return professionals.any { it.id == id }
    }

    //metodos para manipular a lista de profissionais

    fun addProfessional(profissional: Profissional) {
        professionals.add(profissional)
    }

    fun removeProfessional(id: Int) {
        professionals.removeIf { it.id == id }
    }

    fun getProfessionals(): List<Profissional> {
        return professionals
    }

    fun getProfessional(professional: Profissional) : Profissional {
        return professional
    }

    fun updateProfessional(id: Int, novoProfissional: Profissional) : Boolean{
        val index = findIndexById(id)
        return if (index != -1) {
            professionals[index] = novoProfissional
            true
        } else {
            false
        }
    }
}