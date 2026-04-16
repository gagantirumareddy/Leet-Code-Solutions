<h2>
  <a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/">
    Convert Sorted Array to Binary Search Tree
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen" alt="Difficulty: Easy" />

<hr>

<p>
Given an integer array <code>nums</code> where the elements are sorted in ascending order, convert it to a <strong>height-balanced</strong> binary search tree.
</p>

<p>
A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [-10,-3,0,5,9]
<strong>Output:</strong> [0,-3,9,-10,null,5]
<strong>Explanation:</strong> [0,-10,5,null,-3,null,9] is also accepted.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3]
<strong>Output:</strong> [3,1]
<strong>Explanation:</strong> [1,null,3] and [3,1] are both height-balanced BSTs.
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
  <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
  <li><code>nums</code> is sorted in a strictly increasing order</li>
</ul>
