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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> arr=new LinkedList<List<Integer>>();
        if(root==null){
            return arr;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int level=queue.size();
            List<Integer>sublist=new LinkedList<Integer>();
            for(int i=0;i<level;i++){
                TreeNode node = queue.poll();   // remove first
                sublist.add(node.val);          // add value
                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
                arr.add(sublist);
        }
        return arr;
        
    }
}