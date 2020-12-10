data class Aluno (val nomeAluno : String, val sobrenome : String, val codigoAluno : Int) {

    override fun equals(other : Any?) : Boolean {
        if(other is Aluno)
            return  codigoAluno.equals(other.codigoAluno)
        else
            return  false

    }



}