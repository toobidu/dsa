# Sinh khung một bài: class rỗng + test rỗng đã đánh @Disabled.
#
# Dùng:
#   powershell -File tools\new-problem.ps1 -Module 1 -Lab 13 -Id 3 -Name LongestSubstringWithoutRepeating -Difficulty Medium
#
# Sinh ra:
#   src/main/java/com/dsa/module1/lab13/P0003LongestSubstringWithoutRepeating.java
#   src/test/java/com/dsa/module1/lab13/P0003LongestSubstringWithoutRepeatingTest.java
#
# Test sinh ra CỐ TÌNH fail() — phải tự viết test trước khi code xong, không viết sau để hợp thức hóa.

param(
    [Parameter(Mandatory = $true)][int]$Module,
    [Parameter(Mandatory = $true)][int]$Lab,
    [Parameter(Mandatory = $true)][int]$Id,
    [Parameter(Mandatory = $true)][string]$Name,
    [ValidateSet('Easy', 'Medium', 'Hard')][string]$Difficulty = 'Medium',
    [string]$Slug = ''
)

$ErrorActionPreference = 'Stop'

$root = Split-Path -Parent $PSScriptRoot
$labStr = $Lab.ToString('00')
$pkg = "com.dsa.module$Module.lab$labStr"
$pkgPath = "com/dsa/module$Module/lab$labStr"
$cls = 'P' + $Id.ToString('0000') + $Name

if ([string]::IsNullOrWhiteSpace($Slug)) {
    # PascalCase -> kebab-case; chỉnh tay nếu slug thật của LeetCode khác
    $Slug = ($Name -creplace '(?<!^)([A-Z])', '-$1').ToLower()
}

$limit = switch ($Difficulty) {
    'Easy' { 20 }
    'Medium' { 45 }
    'Hard' { 60 }
}

$mainDir = Join-Path $root "src/main/java/$pkgPath"
$testDir = Join-Path $root "src/test/java/$pkgPath"
$mainFile = Join-Path $mainDir "$cls.java"
$testFile = Join-Path $testDir "${cls}Test.java"

if (Test-Path $mainFile) { throw "Đã tồn tại: $mainFile" }

New-Item -ItemType Directory -Force -Path $mainDir | Out-Null
New-Item -ItemType Directory -Force -Path $testDir | Out-Null

$mainBody = @'
package __PKG__;

/**
 * LC __ID__ — __NAME__ (__DIFF__)
 * https://leetcode.com/problems/__SLUG__/
 *
 * Giới hạn: __LIMIT__ phút. Hẹn giờ TRƯỚC khi đọc đề.
 *
 * Điền ba dòng này TRƯỚC khi gõ dòng code đầu tiên:
 *   Ràng buộc và biên :
 *   Brute force + Big-O:
 *   Hướng tối ưu       :
 *
 * Điền sau khi pass:
 *   bruteForce Time: O(?)  Space: O(?)
 *   optimal    Time: O(?)  Space: O(?)
 *   Vì sao cách tối ưu đúng:
 */
public class __CLS__ {

    public Object solve() {
        throw new UnsupportedOperationException("chưa làm — sửa chữ ký hàm cho khớp đề");
    }
}
'@

$testBody = @'
package __PKG__;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("xóa dòng này khi bắt đầu làm bài")
class __CLS__Test {

    private final __CLS__ s = new __CLS__();

    @Test
    void mauDeBai() {
        fail("chưa viết test theo ví dụ trong đề");
    }

    /** Ít nhất một test biên: rỗng, 1 phần tử, toàn phần tử giống nhau, số âm, tràn int. */
    @Test
    void bien1() {
        fail("chưa viết test biên");
    }

    @Test
    void bien2() {
        fail("chưa viết test biên");
    }
}
'@

function Expand-Template([string]$text) {
    return $text.
    Replace('__PKG__', $pkg).
    Replace('__CLS__', $cls).
    Replace('__ID__', "$Id").
    Replace('__NAME__', $Name).
    Replace('__DIFF__', $Difficulty).
    Replace('__SLUG__', $Slug).
    Replace('__LIMIT__', "$limit")
}

# UTF-8 KHÔNG BOM: Set-Content -Encoding utf8 của PS 5.1 thêm BOM, javac một số bản báo
# "illegal character: '﻿'" ở dòng package.
$utf8NoBom = New-Object System.Text.UTF8Encoding($false)
[System.IO.File]::WriteAllText($mainFile, (Expand-Template $mainBody), $utf8NoBom)
[System.IO.File]::WriteAllText($testFile, (Expand-Template $testBody), $utf8NoBom)

Write-Output "main : $mainFile"
Write-Output "test : $testFile"
Write-Output ""
Write-Output "Giới hạn $limit phút. Hẹn giờ, rồi mới đọc đề."
