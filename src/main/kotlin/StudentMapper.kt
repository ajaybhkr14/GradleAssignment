import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper


class StudentMapper {
    constructor(json: String) {
        val mapp = jacksonObjectMapper()
        var st: Student = mapp.readValue(json,Student::class.java)
        println(st)

    }

}