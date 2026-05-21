<h2>
  <a href="https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/">
    Find the Length of the Longest Common Prefix
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
You are given two arrays with positive integers <code>arr1</code> and <code>arr2</code>.
</p>

<p>
A prefix of a positive integer is an integer formed by one or more of its digits, starting from its leftmost digit.
</p>

<p>
For example, <code>123</code> is a prefix of the integer <code>12345</code>, while <code>234</code> is not.
</p>

<p>
A common prefix of two integers <code>a</code> and <code>b</code> is an integer <code>c</code>, such that <code>c</code> is a prefix of both <code>a</code> and <code>b</code>.
</p>

<p>
Return the length of the longest common prefix between all pairs of integers <code>(x, y)</code> such that <code>x</code> belongs to <code>arr1</code> and <code>y</code> belongs to <code>arr2</code>.
</p>

<p>
If no common prefix exists among them, return <code>0</code>.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> arr1 = [1,10,100], arr2 = [1000]
<strong>Output:</strong> 3
<strong>Explanation:</strong> The longest common prefix is 100 with length 3.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> arr1 = [1,2,3], arr2 = [4,4,4]
<strong>Output:</strong> 0
<strong>Explanation:</strong> There is no common prefix between any integer pair.
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= arr1.length, arr2.length &lt;= 5 * 10<sup>4</sup></code></li>
  <li><code>1 &lt;= arr1[i], arr2[i] &lt;= 10<sup>8</sup></code></li>
</ul>
