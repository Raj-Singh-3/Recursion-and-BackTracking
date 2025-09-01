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
    // public boolean isCousins(TreeNode root, int x, int y) {
    //     TreeNode xx = findNode(root, x);
    //     TreeNode yy = findNode(root, y);
        
    //     return (
    //         (level(root, xx , 0) == level(root, yy , 0)) && (!isSibling(root,xx,yy))
    //     );   
    // }
    // public TreeNode findNode(TreeNode root, int x)
    // {
    //     if(root == null)
    //     {
    //         return null;
    //     }
    //     if(root.val == x)
    //     {
    //         return root;
    //     }
    //     TreeNode n = findNode(root.left, x);
    //     if(n!=null)
    //     {
    //         return n;
    //     }
    //     return findNode(root.right, x);
    // }

    // public boolean isSibling(TreeNode root, TreeNode x, TreeNode y)
    // {
    //     if(root == null)
    //     {
    //         return false;
    //     }
    //     return(
    //         (root.left == x && root.right == y) || (root.left == y && root.right == x) ||
    //         (isSibling(root.left,x,y)) || (isSibling(root.right,x,y))
    //     );
    // }

    // public int level(TreeNode root, TreeNode x , int c)
    // {
    //     if(root == null)
    //     {
    //         return 0;
    //     }
    //     if(root == x)
    //     {
    //         return c;
    //     }
    //     int l = level(root.left, x, c+1);
    //     if(l!= 0)
    //     {
    //         return l;
    //     }
    //     return level(root.right, x, c+1);
    // }





        public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int childCount = 0;
        while(!q.isEmpty())
        {
           int s = q.size();
           for(int i = 0;i<s;i++) {
               TreeNode temp = q.poll();
               int parentCount = 0;
               if(temp.left!=null)
                {
                    if(temp.left.val == x || temp.left.val == y)
                    {
                        parentCount++;
                        childCount++;
                    }
                    q.offer(temp.left);
                }
                if(temp.right!=null)
                {
                   if(temp.right.val == x || temp.right.val == y)
                   {
                       parentCount++;
                       childCount++;
                   }
                   q.offer(temp.right);
                }
                if(parentCount == 2) return false;
           }
           if(childCount == 2) return true;
           if(childCount>0) return false;
        }
        return false;
    }

}