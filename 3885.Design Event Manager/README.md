<h2>
  <a href="https://leetcode.com/problems/count-special-triplets/">
    Count Special Triplets
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
You are given an integer array <code>nums</code>.
</p>

<p>
A triplet of indices <code>(i, j, k)</code> is called <strong>special</strong> if:
</p>

<ul>
  <li><code>0 &lt;= i &lt; j &lt; k &lt; n</code>, where <code>n == nums.length</code></li>
  <li><code>nums[i] == nums[j] * 2</code></li>
  <li><code>nums[k] == nums[j] * 2</code></li>
</ul>

<p>
Return the total number of special triplets in the array.
</p>

<p>
Since the answer may be very large, return it modulo <code>10<sup>9</sup> + 7</code>.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [6,3,6]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The only special triplet is (0, 1, 2), where:
- nums[0] = 6 = 3 * 2
- nums[2] = 6 = 3 * 2
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,0,0,0]
<strong>Output:</strong> 4
<strong>Explanation:</strong> All triplets of indices (i, j, k) are special.
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>3 &lt;= nums.length &lt;= 10<sup>5</sup></li>
  <li><code>0 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
</ul>
