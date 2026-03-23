<h2>
  <a href="https://leetcode.com/problems/h-index/">
    H-Index
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
Given an array of integers <code>citations</code> where <code>citations[i]</code> is the number of citations a researcher received for their <code>i<sup>th</sup></code> paper, return the researcher's <strong>h-index</strong>.
</p>

<p>
According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of <code>h</code> such that the given researcher has published at least <code>h</code> papers that have each been cited at least <code>h</code> times.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> citations = [3,0,6,1,5]
<strong>Output:</strong> 3
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> citations = [1,3,1]
<strong>Output:</strong> 1
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>n == citations.length</code></li>
  <li><code>1 &lt;= n &lt;= 5000</code></li>
  <li><code>0 &lt;= citations[i] &lt;= 1000</code></li>
</ul>
