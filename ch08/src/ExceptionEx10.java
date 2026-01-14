class ExceptionEx10 {
    public static void main(String[] args) {
        throw new RuntimeException(); // 컴파일 에러 발생 X
        // throw new Exception(); 컴파일 에러
    }
}