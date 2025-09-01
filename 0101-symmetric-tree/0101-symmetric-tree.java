/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.add(root.left);
    //     queue.add(root.right);
    //     while(!queue.isEmpty())
    //     {
    //         TreeNode left = queue.poll();
    //         TreeNode right = queue.poll();
            
    //         if(left == null && right == null)
    //         {
    //             continue;
    //         }

    //         if(left == null || right == null)
    //         {
    //             return false;
    //         }

    //         if(left.val != right.val)
    //         {
    //             return false;
    //         }

    //         queue.add(left.left);
    //         queue.add(right.right);
    //         queue.add(left.right);
    //         queue.add(right.left);
    //     }
    //     return true;
    // }



    if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);
        while (!q.isEmpty())
        {
            TreeNode left = q.poll();
            TreeNode right = q.poll();
            if(left == null && right == null) continue;
            if(left == null || right == null) return false;
            if(left.val!= right.val) return false;

            q.offer(left.left);
            q.offer(right.right);
            q.offer(left.right);
            q.offer(right.left);
        }
        return true;
    }
}