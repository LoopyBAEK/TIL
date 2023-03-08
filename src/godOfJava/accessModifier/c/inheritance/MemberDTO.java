package godOfJava.accessModifier.c.inheritance;

public class MemberDTO {
    String name;
    String phone;
    String email;

    public MemberDTO(){
        // 아무 정보도 모를 때
    }

    public MemberDTO(String name){
        // 이름만 알 때
        this.name = name;
    }

//    public MemberDTO(String paraName){
//        // 이름만 알 때
//        name = name;  --> X
//        name = paraName;  --> O
//    }

    public MemberDTO(String name, String phone){
        // 이름과 전화번호만 알 때
        this.name = name;
        this.phone = phone;
    }

    public MemberDTO(String name, String phone, String email){
        // 모든 정보를 알고 있을 때
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public MemberDTO getMemberDTO(){
        MemberDTO dto = new MemberDTO();
        // 중간 생략
        return  dto;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;    // 주소가 같으므로 당연히 true
        if(obj == null) return false;   // obj가 null이므로 당연히 false

        if(getClass() != obj.getClass()) return false;  // 클래스의 종류가 다르므로 false

        MemberDTO other = (MemberDTO) obj;  // 같은 클래스이므로 형변환 실행

        // 이제부터는 각 인스턴스 변수가 같은지 비교하는 작업 수행

        if(name == null){   // name이 null일 때
            if(other.name != null) return false;    // 비교 대상의 name이 null이 아니면 false
        }else if(!name.equals(other.name)) return false;    // 두 개의 name 값이 다르면 false

        // name과 같은 비교 수행
        if(email == null){
            if(other.email != null) return false;
        }else if(!email.equals(other.email)) return false;

        if(phone == null){
            if(other.phone != null) return false;
        }else if(!phone.equals(other.phone)) return false;

        return true;
    }

    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }
}
