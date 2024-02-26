/*문제 설명
두 배열이 얼마나 유사한지 확인해보려고 합니다. 
문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요. */
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i < s1.length; i++){
            for(int j = 0; j < s2.length; j++){
                if(s1[i].equals(s2[j])){
                    answer++;
                }
            }
        }
        return answer;
    }
}
/*코드 설명
이중 반복문으로 s1과 s2의 배열을 돌려주고 ==이 아닌 equals를 통해 s1과 s2의 배열을 비교해주었다.
==를 이용하면 두 배열이 같은 객체인지 비교하고
equals 함수를 사용하면 문자열을 비교한다
 */