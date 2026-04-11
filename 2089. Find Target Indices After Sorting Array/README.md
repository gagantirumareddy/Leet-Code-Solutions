<h2>
  <a href="https://leetcode.com/problems/find-target-indices-after-sorting-array/">
    Find Target Indices After Sorting Array
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen" alt="Difficulty: Easy" />

<hr>

<p>
You are given a 0-indexed integer array <code>nums</code> and a target element <code>target</code>.
</p>

<p>
A target index is an index <code>i</code> such that <code>nums[i] == target</code> after sorting <code>nums</code> in non-decreasing order.
</p>

<p>
Return a list of the target indices of <code>nums</code> after sorting. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,5,2,3], target = 2
<strong>Output:</strong> [1,2]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,5,2,3], target = 3
<strong>Output:</strong> [3]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,5,2,3], target = 5
<strong>Output:</strong> [4]
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= nums.length &lt;= 100</code></li>
  <li><code>1 &lt;= nums[i], target &lt;= 100</code></li>
</ul>
