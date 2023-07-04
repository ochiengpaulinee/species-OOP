fun main(){

}

class Species(var name: String,var diet: String, var lifespan: String,var month: Int){
    fun trackSpecies() :String{
        if(month<=0){
            println("Invalid month entry")
        }
        else if (month<=6){
            var migrationPattern = "East to West"
            return "name:$name, diet:$diet, lifespan:$lifespan, month:$month,migration:$migrationPattern"
        }


}