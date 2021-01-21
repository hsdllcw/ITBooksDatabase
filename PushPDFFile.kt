import org.apache.commons.io.FileUtils
import java.io.File

fun main() {
    arrayOf(
        File("/media/hsdllcw/PersonalFiles/hsdllcw/Documents/Book/IT/itbook/English")
    ).forEach {
        sourceDir->
        for (file in sourceDir.listFiles()) {
            var pdf = file
            val destDir =
                File("/media/hsdllcw/PersonalFiles/hsdllcw/Documents/Book/IT/itbook/ITBooksDatabase/English/${pdf.name[0].toUpperCase()}")
            FileUtils.moveFileToDirectory(pdf, destDir, true)
            pdf = File(destDir, pdf.name)
            println(pdf.name)
            println("=============================================")
        }
    }
}
