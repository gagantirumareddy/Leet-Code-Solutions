<h2>
  <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/">
    Remove Duplicates from Sorted Array II
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
Given an integer array <code>nums</code> sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most <strong>twice</strong>.
</p>

<p>
The relative order of the elements should be kept the same.
</p>

<p>
Return <code>k</code> after placing the final result in the first <code>k</code> slots of <code>nums</code>.
</p>

<p>
Do not allocate extra space for another array. You must do this by modifying the input array in-place with <code>O(1)</code> extra memory.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,1,1,2,2,3]
<strong>Output:</strong> 5, nums = [1,1,2,2,3,_]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,0,1,1,1,1,2,3,3]
<strong>Output:</strong> 7, nums = [0,0,1,1,2,3,3,_]
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li>
  <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
  <li><code>nums</code> is sorted in non-decreasing order</li>
</ul>
