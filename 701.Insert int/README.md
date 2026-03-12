<h2>
  <a href="https://leetcode.com/problems/insert-into-a-binary-search-tree/">
    Insert into a Binary Search Tree
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
You are given the <code>root</code> node of a binary search tree (BST) and a value to insert into the tree. 
Return the root node of the BST after the insertion.
</p>

<p>
It is guaranteed that the new value does not exist in the original BST.
</p>

<p>
Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. 
You can return <strong>any</strong> of them.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> root = [4,2,7,1,3], val = 5
<strong>Output:</strong> [4,2,7,1,3,5]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [40,20,60,10,30,50,70], val = 25
<strong>Output:</strong> [40,20,60,10,30,50,70,null,null,25]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
<strong>Output:</strong> [4,2,7,1,3,5]
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li>The number of nodes in the tree will be in the range <code>[0, 10<sup>4</sup>]</code></li>
  <li><code>-10<sup>8</sup> &lt;= Node.val &lt;= 10<sup>8</sup></code></li>
  <li>All the values <code>Node.val</code> are unique</li>
  <li><code>-10<sup>8</sup> &lt;= val &lt;= 10<sup>8</sup></code></li>
  <li>It is guaranteed that <code>val</code> does not exist in the BST</li>
</ul>
