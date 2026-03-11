<h2>
  <a href="https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/">
    Kth Smallest Number in Multiplication Table
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Hard-red" alt="Difficulty: Hard" />

<hr>

<p>
Nearly everyone has used the <strong>Multiplication Table</strong>. The multiplication table of size <code>m x n</code> is an integer matrix <code>mat</code> where <code>mat[i][j] = i * j</code> (1-indexed).
</p>

<p>
Given three integers <code>m</code>, <code>n</code>, and <code>k</code>, return the <code>k<sup>th</sup></code> smallest element in the <code>m x n</code> multiplication table.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> m = 3, n = 3, k = 5
<strong>Output:</strong> 3
<strong>Explanation:</strong>
The multiplication table:
1 2 3
2 4 6
3 6 9

The 5th smallest number is 3.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> m = 2, n = 3, k = 6
<strong>Output:</strong> 6
<strong>Explanation:</strong>
The multiplication table:
1 2 3
2 4 6

The 6th smallest number is 6.
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= m, n &lt;= 3 * 10<sup>4</sup></code></li>
  <li><code>1 &lt;= k &lt;= m * n</code></li>
</ul>
