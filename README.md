# JAVA의 정석

## Chapter 1
- 자바에서 모든 코드는 반드시 클래스 안에 존재해야 한다.

## Chapter 2 변수
println()과 print()의 차이점
- println(): 줄바꿈 O
- print(): 줄바꿈 X

기본형과 참조형 변수
- 기본형 변수: 실제 값 저장(총 8개 타입)
- 참조형 변수: 메모리 주소를 저장(포인터)

참조형 변수
- `Date today = new Date();`
- Date는 클래스 이름(자료형), today는 변수명
- new는 객체를 생성하는 연산자, 그 결과는 생성된 객체의 주소

상수
- 값 변경 불가능
- `final int SEONGMIN_AGE = 25;`

## Chapter 3 연산자

## Chapter 4 조건문과 반복문

switch문에서
- 조건식은 결과값이 반드시 정수여야 한다.

## Chapter 5 배열

- 배열 선언 문법: `int[] scores = new int[5]`
- 배열 요소는 int의 기본값인 0으로 초기화 됨
- 배열 길이가 0일 수도 있음
- 배열은 한 번 생성하면 길이를 변경할 수 없음

char 배열과 String 클래스
- String 클래스는 기본적으로 char 배열인데 기능을 추가한 것임
- String 클래스는 내용 변경 불가능, char 배열은 내용 변경 가능