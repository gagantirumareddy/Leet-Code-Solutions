<h2>
  <a href="https://leetcode.com/problems/minimum-operations-to-make-array-equal/">
    Minimum Operations to Make Array Equal
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
You have an array <code>arr</code> of length <code>n</code> where <code>arr[i] = (2 * i) + 1</code> for all valid values of <code>i</code> (i.e., <code>0 &lt;= i &lt; n</code>).
</p>

<p>
In one operation, you can select two indices <code>x</code> and <code>y</code> where <code>0 &lt;= x, y &lt; n</code> and subtract 1 from <code>arr[x]</code> and add 1 to <code>arr[y]</code> (i.e., perform <code>arr[x] -= 1</code> and <code>arr[y] += 1</code>).
</p>

<p>
The goal is to make all the elements of the array equal. It is guaranteed that all elements can be made equal using some operations.
</p>

<p>
Return the minimum number of operations needed to make all the elements of the array equal.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 3
<strong>Output:</strong> 2
<strong>Explanation:</strong> arr = [1,3,5]
First operation: [2,3,4]
Second operation: [3,3,3]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 6
<strong>Output:</strong> 9
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= n &lt;= 10<sup>4</sup></code></li>
</ul>
