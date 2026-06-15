<h2>
  <a href="https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/">
    Delete the Middle Node of a Linked List
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
You are given the <code>head</code> of a linked list. Delete the middle node, and return the <code>head</code> of the modified linked list.
</p>

<p>
The middle node of a linked list of size <code>n</code> is the <code>⌊n / 2⌋<sup>th</sup></code> node from the start using 0-based indexing.
</p>

<p>
For <code>n = 1</code>, the middle node is the only node in the list.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> head = [1,3,4,7,1,2,6]
<strong>Output:</strong> [1,3,4,1,2,6]
<strong>Explanation:</strong>
The middle node of the list is node 7.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> head = [1,2,3,4]
<strong>Output:</strong> [1,2,4]
<strong>Explanation:</strong>
The middle node of the list is node 3.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> head = [2,1]
<strong>Output:</strong> [2]
<strong>Explanation:</strong>
The middle node is node 1.
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li>The number of nodes in the list is in the range <code>[1, 10<sup>5</sup>]</code></li>
  <li><code>1 &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
</ul>
