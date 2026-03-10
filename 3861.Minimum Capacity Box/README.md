<h2>
  <a href="https://leetcode.com/problems/minimum-capacity-box/">
    Minimum Capacity Box
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen" alt="Difficulty: Easy" />

<hr>

<p>
You are given an integer array <code>capacity</code> representing the capacity of different boxes and an integer <code>item</code> representing the size of an item.
</p>

<p>
Return the <strong>index</strong> of the box with the minimum capacity that can store the item.
</p>

<p>
If multiple such boxes exist, return the <strong>smallest index</strong>.
</p>

<p>
If no box can store the item, return <code>-1</code>.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> capacity = [1,4,3,2], item = 3
<strong>Output:</strong> 2
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> capacity = [5,3,8], item = 6
<strong>Output:</strong> 2
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= capacity.length &lt;= 10<sup>5</sup></code></li>
  <li><code>1 &lt;= capacity[i], item &lt;= 10<sup>9</sup></code></li>
</ul>
