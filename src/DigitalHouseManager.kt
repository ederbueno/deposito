class DigitalHouseManager {

     val cursos = mutableListOf<Curso>()
     val alunos = mutableListOf<Aluno>()
     val professores = mutableListOf<Professor>()
     val matriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int ){
          cursos.add(Curso(nome, codigoCurso, quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int){
        for(curso in cursos){
            if(curso.codigoCurso.equals(codigoCurso))
                cursos.remove(curso)
            else println("O código $codigoCurso não foi encontrado")
        }
    }

    fun registrarProfessorAdjunto(nome: String , sobrenome: String , codigoProfessor: Int, quantidadeDeHoras: Int){
        professores.add(ProfessorAdjunto(0,nome, sobrenome, codigoProfessor))
    }
    fun registrarProfessorTitular(nome: String, sobrenome: String,codigoProfessor: Int, tempoDeCasa: Int, especialidade: String){
        professores.add(ProfessorTitular(especialidade, nome, sobrenome, codigoProfessor, tempoDeCasa))
    }

    fun excluirProfessor(codigoProfessor: Int){
        for(professor in professores){
            if(professor.codigoProfessor.equals(codigoProfessor))
                professores.remove(professor)
        }
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso : Int){
           val alunoEncontrado = alunos.find { it.equals(codigoAluno) }
           val cursoEncontrado = cursos.find {it.equals(codigoCurso)}
        if(alunoEncontrado != null &&  cursoEncontrado != null){
               matriculas.add(Matricula(alunoEncontrado, cursoEncontrado))
           }
    }

    fun alocarProfessores(codigoCurso : Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
           val cursoEncontrado = cursos.find {it.equals(codigoCurso)}
           val professorTitularEncontrado = professores.find { it.equals(codigoProfessorTitular) }
           val professorAdjuntoEncontrado = professores.find { it.equals(codigoProfessorAdjunto) }
           if(cursoEncontrado != null){
               if(professorTitularEncontrado != null && professorAdjuntoEncontrado != null){
                   cursoEncontrado.professorTitular = professorTitularEncontrado as ProfessorTitular?
                   println("Professor titular ${professorTitularEncontrado.nomeProfessor} alocado no curso de ${cursoEncontrado.nomeCurso}")

                   cursoEncontrado.professorAdjunto = professorAdjuntoEncontrado as ProfessorAdjunto?
                   println("Professor adjunto ${professorAdjuntoEncontrado.nomeProfessor} alocado no curso de ${cursoEncontrado.nomeCurso}")
               }
        }


    }


}