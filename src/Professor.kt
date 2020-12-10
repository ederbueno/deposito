open class Professor(val nomeProfessor:  String, val sobreNomeProfessor: String, val tempoCasa: Int,
                     val codigoProfessor: Int) {

    override fun equals(other : Any?) : Boolean {
           if(other is Professor)
               return  codigoProfessor.equals(other.codigoProfessor)
              else
                return  false

    }

}