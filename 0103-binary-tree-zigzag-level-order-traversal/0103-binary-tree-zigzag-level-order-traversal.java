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
        List<List<Integer>>arr = new LinkedList<>();
        // Here, I am using Linkedlist because when my level is even than I have to add the elements at
        // 0th index, so in linkedlist insert at head happens in O(1) time complexity.
        if(root == null) return arr;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> a1 = new LinkedList<>();
            for(int i = 1;i<=size;i++)
            {
                TreeNode temp = q.poll();
                if(level%2 != 0)
                {
                    a1.add(0,temp.val);
                }
                else
                {
                    a1.add(temp.val);
                }
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            level++;
            arr.add(a1);
        }
        return arr;
    }

}