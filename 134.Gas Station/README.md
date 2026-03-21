<h2>
  <a href="https://leetcode.com/problems/gas-station/">
    Gas Station
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
There are <code>n</code> gas stations along a circular route, where the amount of gas at the <code>i<sup>th</sup></code> station is <code>gas[i]</code>.
</p>

<p>
You have a car with an unlimited gas tank and it costs <code>cost[i]</code> of gas to travel from the <code>i<sup>th</sup></code> station to its next <code>(i + 1)<sup>th</sup></code> station.
</p>

<p>
You begin the journey with an empty tank at one of the gas stations.
</p>

<p>
Given two integer arrays <code>gas</code> and <code>cost</code>, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return <code>-1</code>.
</p>

<p>
If there exists a solution, it is guaranteed to be unique.
</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> gas = [1,2,3,4,5], cost = [3,4,5,1,2]
<strong>Output:</strong> 3
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> gas = [2,3,4], cost = [3,4,3]
<strong>Output:</strong> -1
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>n == gas.length == cost.length</code></li>
  <li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
  <li><code>0 &lt;= gas[i], cost[i] &lt;= 10<sup>4</sup></code></li>
</ul>
