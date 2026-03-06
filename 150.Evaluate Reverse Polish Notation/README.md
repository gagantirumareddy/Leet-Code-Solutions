<h2>
  <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">
    Evaluate Reverse Polish Notation
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
You are given an array of strings <code>tokens</code> that represents an arithmetic expression in a <strong>Reverse Polish Notation</strong>.
</p>

<p>
Evaluate the expression and return an integer that represents the value of the expression.
</p>

<p>
Note that:
</p>

<ul>
  <li>The valid operators are <code>'+'</code>, <code>'-'</code>, <code>'*'</code>, and <code>'/'</code>.</li>
  <li>Each operand may be an integer or another expression.</li>
  <li>The division between two integers always truncates toward zero.</li>
  <li>There will not be any division by zero.</li>
  <li>The input represents a valid arithmetic expression in Reverse Polish Notation.</li>
</ul>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> tokens = ["2","1","+","3","*"]
<strong>Output:</strong> 9
<strong>Explanation:</strong> ((2 + 1) * 3) = 9
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> tokens = ["4","13","5","/","+"]
<strong>Output:</strong> 6
<strong>Explanation:</strong> (4 + (13 / 5)) = 6
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
<strong>Output:</strong> 22
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= tokens.length &lt;= 10<sup>4</sup></code></li>
  <li><code>tokens[i]</code> is either an operator: <code>"+"</code>, <code>"-"</code>, <code>"*"</code>, or <code>"/"</code>, or an integer in the range <code>[-200, 200]</code></li>
</ul>
