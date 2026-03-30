<h2>
  <a href="https://leetcode.com/problems/excel-sheet-column-number/">
    Excel Sheet Column Number
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen" alt="Difficulty: Easy" />

<hr>

<p>
Given a string <code>columnTitle</code> that represents the column title as appears in an Excel sheet, return its corresponding column number.
</p>

<p>
For example:
</p>

<ul>
  <li><code>A</code> -> <code>1</code></li>
  <li><code>B</code> -> <code>2</code></li>
  <li><code>C</code> -> <code>3</code></li>
  <li><code>...</code></li>
  <li><code>Z</code> -> <code>26</code></li>
  <li><code>AA</code> -> <code>27</code></li>
  <li><code>AB</code> -> <code>28</code></li>
  <li><code>...</code></li>
</ul>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> columnTitle = "A"
<strong>Output:</strong> 1
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> columnTitle = "AB"
<strong>Output:</strong> 28
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> columnTitle = "ZY"
<strong>Output:</strong> 701
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>1 &lt;= columnTitle.length &lt;= 7</code></li>
  <li><code>columnTitle</code> consists only of uppercase English letters</li>
  <li><code>columnTitle</code> is in the range <code>["A", "FXSHRXW"]</code></li>
</ul>
