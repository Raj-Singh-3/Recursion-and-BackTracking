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
    // public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    //    List<List<Integer>> arr = new ArrayList<>();
    //     if(root == null)
    //     {
    //         return arr;
    //     }
    //     Deque<TreeNode> q = new LinkedList<>();
    //     q.offer(root);
    //     boolean flag = false;
    //     while(!q.isEmpty())
    //     {
    //         ArrayList<Integer> brr = new ArrayList<Integer>();
    //         int size = q.size();
    //         for(int i = 0;i<size;i++)
    //         {
    //             if(!flag)
    //             {
    //                 TreeNode a = q.pollFirst();
    //                 int data = a.val;
    //                 brr.add(data);
    //                 if(a.left!=null) q.addLast(a.left);
    //                 if(a.right!=null) q.addLast(a.right);
    //             }
    //             else
    //             {
    //                 TreeNode a = q.pollLast();
    //                 int data = a.val;
    //                 brr.add(data);
    //                 if(a.right!=null) q.addFirst(a.right);
    //                 if(a.left!=null) q.addFirst(a.left);
    //             }
                
    //         }
    //         flag = !flag;
    //         arr.add(brr);
            
    //     }
    //     return arr;
    // }



        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr = new LinkedList<>();
        if(root == null) return arr;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty())
        {
            int s = q.size();
            List<Integer> a= new LinkedList<>();
            for(int i = 0;i<s;i++)
            {
                TreeNode temp = q.poll();
                if(level%2== 0) a.add(temp.val);
                else a.add(0,temp.val);
                
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            level++;
            arr.add(a);
        }
        return arr;
    }

}