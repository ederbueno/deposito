import java.text.SimpleDateFormat
import java.util.*

class Matricula(val aluno : Aluno, val curso: Curso) {

    private val formatar = SimpleDateFormat("dd/MM/yyyy")
    val dataMatricula = formatar.format(Date())

    init {
        println(
                "Matrícula do aluno ${aluno.nomeAluno} ${aluno.sobrenome} realizada com sucesso no curso de ${curso.nomeCurso} no dia $dataMatricula"
        )
    }


}