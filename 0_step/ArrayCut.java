/*
문제 설명
정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 
자른 정수 배열을 return 하도록 solution 함수를 완성해보세요. */

class Solution{
    public int[] solution(int[] numbers, num1, num2){
        int answer[] = new int[num2 - num1 + 1]; // num1이 1, num2가 3이라면 배열의 길이가 2가 되므로 +1을 해줌
        int count = 0; // 
        for(int = num1; i <= num2; i++){
            // numbers는 num1부터 증가하고, answer에도 i를 대입하면 answer[num1]부터 들어가기 때문에
            // 이렇게되면 num1이 1일경우 answer의 1번째 인덱스부터 들어가기 때문에
            // count 변수를 생성해서 answer에 대입해주고 증가시켜주면서 answer의 0번째 배열부터 차례로
            // number[num1]값이 들어가도록 함
            answer[count] = numbers[i];
            count++;
        }
        return answer;
    }
}

//다른 사람 풀이
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // Arrays.copyOfRange(복사하고 싶은 배열, 배열설정)
        // num2 + 1을 해준 이유 : 인덱스는 0부터 시작하기 때문에 +1 을 안해주면 한단계 낮은것 까지만 출력함  
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}