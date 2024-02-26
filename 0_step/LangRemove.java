// 특정 문자 제거하기
/* 문제 설명
문자열 my_string과 문자 letter이 매개변수로 주어집니다. 
my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.*/

class Solution{
    public String solution(String my_string, String letter){
        String answer = "";
        return answer = my_string.replace(letter,"");

        
    }
}
/*
문자열을 치환할 수 있는 replace 함수를 사용하면 간단하게 문제를 풀 수 있습니다.
replace(기존 문자, 바뀔 문자) 👉🏻 이렇게 사용하면 됩니다.
[문자열 치환 함수]
1. replace
Replace 함수는 자신이 바꾸고싶은 문자로 문자열을 치환시켜주는 기능을 합니다.
2. replaceAll 
ReplaceAll 함수는 자신이 바꾸고싶은 문자로 문자열을 전부 치환시켜주는 기능을 합니다.
**replace 와 replaceAll의 차이점
replace 첫 번째 값으로는 바꿀 문자열을 입력받는 대신에 
replaceAll의 첫번째 값으로는 정규식이 들어갑니다. 
그래서 정규식 특성상 특수문자가 포함된 것을 바꿀 때는 
replaceAll이 아닌 replace를 사용하셔야 문자 치환을 할 수 있습니다.*/