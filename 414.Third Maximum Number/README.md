<h2>
  <a href="https://leetcode.com/problems/third-maximum-number/">
    Third Maximum Number
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen" alt="Difficulty: Easy" />

<hr>

<p>
Given an integer array <code>nums</code>, return the <strong>third distinct maximum</strong> number in this array. If the third maximum does not exist, return the maximum number.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,2,1]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The first distinct maximum is 3, the second distinct maximum is 2, and the third distinct maximum is 1.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The third distinct maximum does not exist, so the maximum (2) is returned.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,2,3,1]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The first distinct maximum is 3, the second distinct maximum is 2 (both 2's are counted together), and the third distinct maximum is 1.
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
  <li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
</ul>
