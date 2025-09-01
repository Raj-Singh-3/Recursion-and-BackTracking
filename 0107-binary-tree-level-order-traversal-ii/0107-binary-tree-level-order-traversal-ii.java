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
    // public List<List<Integer>> levelOrderBottom(TreeNode root) {
    //     List<List<Integer>> arr = new ArrayList<>();
    //     if(root == null)
    //     {
    //         return arr;
    //     }
    //     Queue<TreeNode> q = new LinkedList<>();
    //     q.offer(root);
    //     while(!q.isEmpty())
    //     {
    //         ArrayList<Integer> brr = new ArrayList<Integer>();
    //         int size = q.size();
    //         for(int i = 0;i<size;i++)
    //         {
    //             TreeNode a = q.poll();
    //             int data = a.val;
    //             brr.add(data);
    //             if(a.left!=null) q.offer(a.left);
    //             if(a.right!=null) q.offer(a.right);
    //         }
    //         arr.add(0,brr);
    //     }
    //     return arr;
    // }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> arr = new LinkedList<>();
        if(root == null) return arr;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
           int s = q.size();
           List<Integer> a = new LinkedList<>();
           for(int i = 0;i<s;i++)
           {
               TreeNode temp = q.poll();
               a.add(temp.val);
               if(temp.left!=null) q.offer(temp.left);
               if(temp.right!=null) q.offer(temp.right);
           }
           arr.add(0,a);
        }
        return arr;
    }
}