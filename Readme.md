## LeetCode: Two Sum - HTML Code Representation

Below is the full HTML code for the LeetCode problem [Two Sum](https://leetcode.com/problems/two-sum/).

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>1. Two Sum - LeetCode Problem</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 40px;
      line-height: 1.6;
    }
    h2, h3 {
      color: #2c3e50;
    }
    pre {
      background: #f4f4f4;
      padding: 10px;
      border-left: 4px solid #3498db;
      overflow-x: auto;
    }
    ul {
      margin-top: 10px;
    }
  </style>
</head>
<body>

  <h2><a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a></h2>
  <h3>Easy</h3>
  <hr>

  <p>Given an array of integers <code>nums</code> and an integer <code>target</code>, return indices of the two numbers such that they add up to target.</p>

  <p>You may assume that each input would have exactly one solution, and you may not use the same element twice.</p>

  <p>Return the answer in any order.</p>

  <h4>Example 1:</h4>
  <pre>
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
  </pre>

  <h4>Example 2:</h4>
  <pre>
Input: nums = [3,2,4], target = 6
Output: [1,2]
  </pre>

  <h4>Example 3:</h4>
  <pre>
Input: nums = [3,3], target = 6
Output: [0,1]
  </pre>

  <h4>Constraints:</h4>
  <ul>
    <li>2 <= nums.length <= 10⁴</li>
    <li>-10⁹ <= nums[i] <= 10⁹</li>
    <li>-10⁹ <= target <= 10⁹</li>
    <li>Only one valid answer exists.</li>
  </ul>

</body>
</html>
