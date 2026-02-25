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
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode lastvisited=null;
        while(root!=null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            TreeNode peek=st.peek();
            if(peek.right!=null && lastvisited!=peek.right){
                root=peek.right;
            }else{
                res.add(peek.val);
                lastvisited=st.pop();
            }
        }
        return res;
        
    }
}