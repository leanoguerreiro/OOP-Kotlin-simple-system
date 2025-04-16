package services

import models.Profissional
import repository.RepositoryProfessionals
import utils.validateCpf

class AdmService {
    fun createProfessional(profissional: Profissional) : String {
        if(!validateCpf(profissional.getCPF())) {
            return "CPF invalido: ${profissional.getCPF()}"
        }

        if(!RepositoryProfessionals.findByCPF(profissional.getCPF())) {
            return "CPF ja cadastrado"
        }

        RepositoryProfessionals.addProfessional(profissional)
        return "Profissional ${profissional.nome} cadastrado com sucesso"
    }

    fun deleteProfessional(id: Int) : String {
        if (!RepositoryProfessionals.existProfessionalById(id)) {
            return "Profissional não encontrado"
        }

        RepositoryProfessionals.removeProfessional(id)
        return "Profissional excluido com sucesso"
    }

    fun updateProfessional(id: Int, professional: Profissional) : String {
        if(!validateCpf(professional.getCPF())) {
            return "CPF invalido: ${professional.getCPF()}"
        }

        RepositoryProfessionals.updateProfessional(id, professional)
        return "Profissional atualizado com sucesso, $professional"
    }

    fun viewAllProfessionals() : String {
        return RepositoryProfessionals.getProfessionals().toString()
    }

    fun viewOneProfessional(professional: Profissional) : String {
        if (!RepositoryProfessionals.existProfessionalById(professional.id)) {
            return "Profissional não encontrado"
        }

       val profissional = RepositoryProfessionals.findIndexById(professional.id)

        return professional.toString()
    }
}