# 🎯 Java & Spring Boot, MariaDB로 게시판 구현하기
----
### 📌 MVC패턴을 활용하여 CRUD가능한 게시판 구현
- Spring Boot를 이용하여 만든 게시판입니다.
- MariaDB와 연동하여 영속성을 보장하였습니다.
- 기본적인 CRUD를 구현하였으며, 추가로 기능구현을 할 예정입니다.
----
### 📌 기술 스택
- Java, SpringBoot, Spring Data JPA
- HTML, Bootstrap, Thymeleaf
- MariaDB
----
### 📌 JDK 버전 및 Dependency 목록
![image](https://user-images.githubusercontent.com/120121817/213285772-d8bc436b-95e0-476e-938d-c755b1b04c47.png)
----
### ⚙ 구현 기능
![image](https://user-images.githubusercontent.com/120121817/213291694-03c532f9-149e-43d3-ba06-f0e37db16210.png)
- 게시글 목록 조회 - 메인화면에서 글 목록 버튼을 클릭시 DB에 있는 데이터를 List로 받아 thymeleaf로 변수화 하여 출력
- 게시글 쓰기 - input태그와 textarea태그를 form태그로 받아서 Spring Data JPA인 save()함수를 이용하여 Repository에 저장
- 게시글 상세페이지 조회 - 게시글 목록을 보여주는 html파일에서 제목에 a태그를 달아 id값을 담아서 보냄. 이후 Spring Data JPA인 findById를 이용해 id에 맞는 제목과 내용을 출력
- 게시글 수정 - id값을 이용해 상세페이지에담긴 제목과 내용을 수정템플릿에서 불러오게 만든뒤, 임시Board 객체를 생성하여 set()으로 덮어쓴 뒤 
- 게시글 삭제 - Spring Data JPA인 deleteById를 이용해 해당 id값의 데이터를 삭제
----
### 🔨 추후 구현할 목록
- 프론트단 꾸미기
- 파일업로드 기능구현
- 게시물 작성시기별 내림차순정렬
- 댓글 대댓글
- 페이징
- 제목으로 검색
