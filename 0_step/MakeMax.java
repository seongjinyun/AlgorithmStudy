/*문제 설명
정수 배열 numbers가 매개변수로 주어집니다. 
numbers의 원소 중 두 개를 곱해 만들 수 있는 
최댓값을 return하도록 solution 함수를 완성해주세요. */

class Solution{
    public int solution(int[] numbers){
        int answer = 0;
        int max = 0;

        for(int i= 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbesr.length; j++){
                if(numbers[i] * numbers[j] > answer){
                    answer = numbers[i] * numbers[j];
                }
            }        
        }
        return answer;
    }
}
// 코드 설명 
/* 이중반복문으로 numbers[i]와 numbers[j]를 곱할 수 있도록 만듦
그리고 i와 j를 넣어 곱한 값이 answer보다 크다면 곱한값을 계속 answer에 넣어주고
반복문이 끝나면 마지막 answer의 값은 가장 높은 값을 반환하게 됨
 */

//다른사람 풀이
/*정렬을 이용한 방법
 import java.util.* <<- util package에 내가 사용하는 클래스가 있으니 거기를 참조해서 찾을 것

 Arrays.sort(numbers); <<- 배열을 오름차순으로 정렬한것
 return에서 오름차순의 마지막과 2번째를 곱해줬다.
 -1은 인덱스가 0부터 시작하기 때문에 해준것.
*/
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}
