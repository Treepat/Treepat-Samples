import com.github.treepat.expression.TreepatExpression
import com.github.treepat.extensions.matchToString
import com.github.treepat.target_tree.default_tree.DefaultTargetTree


fun main(args: Array<String>) {
    // Treepat Parsing
    val treepatExpression = TreepatExpression.createFromFile(args[0])
    // Tree File Parsing
    val targetTree = DefaultTargetTree.createFromFile(args[1])

    val matches = targetTree.findMatches(treepatExpression)
    val printableMatches: List<String>
    if (matches != null) {
        printableMatches = matches.map { it.matchToString() }
    } else {
        printableMatches = listOf("Match not found")
    }
    println(printableMatches.joinToString("\n-\n"))

    val hasSolutions = targetTree.hasMatch(treepatExpression)
    println(hasSolutions)
}

