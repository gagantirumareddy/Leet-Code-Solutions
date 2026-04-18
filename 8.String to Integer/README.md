<h2>
  <a href="https://leetcode.com/problems/string-to-integer-atoi/">
    String to Integer (atoi)
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Medium-yellow" alt="Difficulty: Medium" />

<hr>

<p>
Implement the <code>myAtoi(string s)</code> function, which converts a string to a 32-bit signed integer.
</p>

<p>
The algorithm for <code>myAtoi(string s)</code> is as follows:
</p>

<ul>
  <li>Read in and ignore any leading whitespace.</li>
  <li>Check if the next character (if not already at the end of the string) is <code>'-'</code> or <code>'+'</code>. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.</li>
  <li>Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.</li>
  <li>Convert these digits into an integer (i.e. <code>"123"</code> -> <code>123</code>, <code>"0032"</code> -> <code>32</code>). If no digits were read, then the integer is <code>0</code>.</li>
  <li>If the integer is out of the 32-bit signed integer range <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>, then clamp the integer so that it remains in the range. Specifically, integers less than <code>-2<sup>31</sup></code> should be clamped to <code>-2<sup>31</sup></code>, and integers greater than <code>2<sup>31</sup> - 1</code> should be clamped to <code>2<sup>31</sup> - 1</code>.</li>
  <li>Return the integer as the final result.</li>
</ul>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = "42"
<strong>Output:</strong> 42
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = "   -042"
<strong>Output:</strong> -42
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = "1337c0d3"
<strong>Output:</strong> 1337
</pre>

<p><strong class="example">Example 4:</strong></p>

<pre>
<strong>Input:</strong> s = "0-1"
<strong>Output:</strong> 0
</pre>

<p><strong class="example">Example 5:</strong></p>

<pre>
<strong>Input:</strong> s = "words and 987"
<strong>Output:</strong> 0
</pre>

<p><strong>Constraints:</strong></p>

<ul>
  <li><code>0 &lt;= s.length &lt;= 200</code></li>
  <li><code>s</code> consists of English letters (lower-case and upper-case), digits (<code>0-9</code>), whitespace <code>' '</code>, <code>'+'</code>, <code>'-'</code>, and <code>'.'</code></li>
</ul>
