package exam03_trywithresource;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Resources res=new Resources();
        Resource2 res2=new Resource2();
        MyResource myres= new MyResource();
        try(res;res2;myres){
            //res가 AutoClosable 인터페이스 구현 객체인지 체크 -> 맞으면 close()메서드 자동 호출
            //AutoCloseable auto=res;
            //auto.close();//자동 해제 과정
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
