<h2>
  <a href="https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/">
    Find the Prefix Common Array of Two Arrays
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
You are given two <strong>0-indexed</strong> integer permutations <code>A</code> and <code>B</code> of length <code>n</code>.
</p>

<p>
A <strong>prefix common array</strong> of <code>A</code> and <code>B</code> is an array <code>C</code> such that <code>C[i]</code> is equal to the count of numbers that are present at or before the index <code>i</code> in both <code>A</code> and <code>B</code>.
</p>

<p>
Return the prefix common array of <code>A</code> and <code>B</code>.
</p>

<p>
A sequence of <code>n</code> integers is called a permutation if it contains all integers from <code>1</code> to <code>n</code> exactly once.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> A = [1,3,2,4], B = [3,1,2,4]
<strong>Output:</strong> [0,2,3,4]
<strong>Explanation:</strong>
At i = 0: no common number exists.
At i = 1: numbers 1 and 3 are common.
At i = 2: numbers 1, 2, and 3 are common.
At i = 3: all numbers are common.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> A = [2,3,1], B = [3,1,2]
<strong>Output:</strong> [0,1,3]
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= A.length == B.length == n &lt;= 50</code></li>
  <li><code>1 &lt;= A[i], B[i] &lt;= n</code></li>
  <li>Both <code>A</code> and <code>B</code> are permutations of length <code>n</code></li>
</ul>
