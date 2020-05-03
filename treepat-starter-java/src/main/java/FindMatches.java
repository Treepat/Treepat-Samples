import com.github.treepat.expression.TreepatExpression;
import com.github.treepat.target_tree.TargetTree;
import com.github.treepat.target_tree.TargetTreeNode;
import com.github.treepat.target_tree.default_tree.DefaultTargetTree;
import com.github.treepat.target_tree.default_tree.DefaultTargetTreeNode;

import java.util.List;

public class FindMatches {
    public static void main(String[] args) {
        // Treepat Parsing

        TreepatExpression treepatExpression = TreepatExpression.Factory.createFromFile(args[0]);
        // Tree File Parsing
        TargetTree targetTree = new DefaultTargetTree<DefaultTargetTreeNode>(args[1]);

        List<List<TargetTreeNode>> solutions = targetTree.findMatches(treepatExpression);
        System.out.println(solutions);
        Boolean hasSolutions = targetTree.hasMatch(treepatExpression);
        System.out.println(hasSolutions);
    }
}
