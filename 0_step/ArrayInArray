/*문제 설명
문자열 str1, str2가 매개변수로 주어집니다. 
str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public int solution(String str1, String str2) {
        
        int answer = (str1.indexOf(str2) >= 0)? 1 : 2;
            
        return answer;
    }
}
// 문제 풀이
/* 
(str1.indexOf(str2) >= 0)은 0보다 크면 true값을 가지는 코드
str1안에 str2가 있다면 0보다 크거나 같다.
없다면 음수로 반환되기 때문에 2를 반환함
*/

//다른사람 풀이
// contains도 indexOf와 같은 파라미터로 입력받은 문자열이 포함되어 있는지 여부를 리턴
class Solution {
    public int solution(String str1, String str2) {
        if (str1.contains(str2)) {
            return 1;
        }
        return 2;
    }
}