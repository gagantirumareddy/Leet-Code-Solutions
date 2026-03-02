<h2>
  <a href="https://leetcode.com/problems/find-peak-element/">
    Find Peak Element
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
A peak element is an element that is strictly greater than its neighbors.
</p>

<p>
Given an integer array <code>nums</code>, find a peak element, and return its index.
</p>

<p>
If the array contains multiple peaks, return the index to any of the peaks.
</p>

<p>
You may imagine that <code>nums[-1] = nums[n] = -∞</code>.
</p>

<p>
You must write an algorithm that runs in <code>O(log n)</code> time.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong> 3 is a peak element and its index is 2.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,1,3,5,6,4]
<strong>Output:</strong> 1 or 5
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= nums.length &lt;= 1000</code></li>
  <li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
  <li><code>nums[i] != nums[i + 1]</code> for all valid <code>i</code></li>
</ul>
