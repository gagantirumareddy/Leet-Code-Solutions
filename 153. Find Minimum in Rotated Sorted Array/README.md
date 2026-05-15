<h2>
  <a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/">
    Find Minimum in Rotated Sorted Array
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
Suppose an array of length <code>n</code> sorted in ascending order is rotated between <code>1</code> and <code>n</code> times.
</p>

<p>
For example, the array <code>nums = [0,1,2,4,5,6,7]</code> might become:
</p>

<ul>
  <li><code>[4,5,6,7,0,1,2]</code> if it was rotated 4 times.</li>
  <li><code>[0,1,2,4,5,6,7]</code> if it was rotated 7 times.</li>
</ul>

<p>
Notice that rotating an array <code>[a[0], a[1], a[2], ..., a[n-1]]</code> one time results in the array <code>[a[n-1], a[0], a[1], a[2], ..., a[n-2]]</code>.
</p>

<p>
Given the sorted rotated array <code>nums</code> of unique elements, return the minimum element of this array.
</p>

<p>
You must write an algorithm that runs in <code>O(log n)</code> time.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,4,5,1,2]
<strong>Output:</strong> 1
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [4,5,6,7,0,1,2]
<strong>Output:</strong> 0
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [11,13,15,17]
<strong>Output:</strong> 11
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>n == nums.length</code></li>
  <li><code>1 &lt;= n &lt;= 5000</code></li>
  <li><code>-5000 &lt;= nums[i] &lt;= 5000</code></li>
  <li>All the integers of <code>nums</code> are unique</li>
  <li><code>nums</code> is sorted and rotated between <code>1</code> and <code>n</code> times</li>
</ul>
