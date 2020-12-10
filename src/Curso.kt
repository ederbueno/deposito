class Curso(val nomeCurso: String, val codigoCurso: Int, val quantidadeMaximaDeAlunos: Int) {

    val vagasAluno = mutableListOf<Aluno>()

    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null


     override fun equals(other : Any?) : Boolean {
        if(other is Curso)
            return  codigoCurso.equals(other.codigoCurso)
        else
            return  false

    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if(vagasAluno.size < quantidadeMaximaDeAlunos ){
            vagasAluno.add(umAluno)
            return true
        }
        return false
    }


    fun excluirUmAluno(aluno: Aluno) = vagasAluno.remove(aluno)



}