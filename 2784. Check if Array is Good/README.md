<h2>
  <a href="https://leetcode.com/problems/check-if-array-is-good/">
    Check if Array is Good
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen" alt="Difficulty: Easy" />

<hr>

<p>
You are given an integer array <code>nums</code>. We call an array <strong>good</strong> if it is a permutation of an array <code>base[n]</code>.
</p>

<p>
The array <code>base[n]</code> is defined as:
</p>

<pre>
base[n] = [1,2,3,...,n-1,n,n]
</pre>

<p>
In other words, <code>base[n]</code> contains numbers from <code>1</code> to <code>n-1</code> exactly once and number <code>n</code> exactly twice.
</p>

<p>
Return <code>true</code> if the given array is good, otherwise return <code>false</code>.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,1,3]
<strong>Output:</strong> false
<strong>Explanation:</strong> Since the maximum element 3 appears only once,
nums is not a permutation of base[3].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3,3,2]
<strong>Output:</strong> true
<strong>Explanation:</strong> nums is a permutation of base[3] = [1,2,3,3].
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= nums.length &lt;= 100</code></li>
  <li><code>1 &lt;= nums[i] &lt;= 200</code></li>
</ul>
