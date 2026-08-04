<h2>
  <a href="https://leetcode.com/problems/find-missing-elements/">
    Find Missing Elements
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen" alt="Difficulty: Easy" />

<hr>

<p>
You are given an integer array <code>nums</code> consisting of unique integers.
</p>

<p>
Originally, <code>nums</code> contained every integer within a certain range. However, some integers might have gone missing from the array.
</p>

<p>
The smallest and largest integers of the original range are still present in <code>nums</code>.
</p>

<p>
Return a sorted list of all the missing integers in this range. If no integers are missing, return an empty list.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,4,2,5]
<strong>Output:</strong> [3]
<strong>Explanation:</strong>
The smallest integer is 1 and the largest is 5, so the full range is [1,2,3,4,5].
Among these, only 3 is missing.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [7,8,6,9]
<strong>Output:</strong> []
<strong>Explanation:</strong>
The full range is [6,7,8,9]. No integers are missing.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [5,1]
<strong>Output:</strong> [2,3,4]
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>2 &lt;= nums.length &lt;= 100</code></li>
  <li><code>1 &lt;= nums[i] &lt;= 100</code></li>
  <li>All elements in <code>nums</code> are unique.</li>
</ul>
