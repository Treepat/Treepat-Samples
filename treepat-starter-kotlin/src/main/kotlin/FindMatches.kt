import com.github.treepat.expression.TreepatExpression
import com.github.treepat.target_tree.default_tree.DefaultTargetTree
import com.github.treepat.target_tree.default_tree.DefaultTargetTreeNode


fun main(args: Array<String>) {
    // Treepat Parsing
    val treepatExpression = TreepatExpression.createFromFile(args[0])
    // Tree File Parsing
    val targetTree = DefaultTargetTree<DefaultTargetTreeNode>(args[1])

    val solutions = targetTree.findMatches(treepatExpression)
    println(solutions.joinToString("\n-\n"))
    val hasSolutions = targetTree.hasMatch(treepatExpression)
    println(hasSolutions)
}

