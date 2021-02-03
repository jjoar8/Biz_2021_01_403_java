# Java Project
## 한국경영원 인재개발원
## SpringMVC 웹 개발자 과정

### 2021-01-28

* java 프로그래밍 언어 활용
* 응용SW 엔지니어링
* java 프로그래밍 2일차
* 클래스, 패키지, main() method

### 2021-02-03

* git hub를 사용하여 프로젝트 공유하기
1. README.md 파일에 내용 추가
2. home 폴더에서 github project clone
* home 폴더에서 git bash 열기
* git clone https://githubg.com/jjoar8/리파지토리.git homeworks
3. 집에서 코드 추가, 수정, 삭제 등등
4. clone 한 프로젝트 upload 하기
* config하기 : clone 한 한번만 수행 
	git config --global user.name jjoar8
	git config --global user.email 이메일

* 프로젝트 압축 및 upload  
	git add .
	git commit -m "집에서 HelloHomeWork 클래스 만들기"
	git push 또는 git push -u origin master

5. 학원에 와서 제일 먼저 할일(가장 중요)
	프로젝트 폴더에서 git bash 열기

	git pull(매우 중요) : 동기화 하기

##### git commit 명령 오류 상황
* git commit -m 까지만 입력하면 : error 발생
* git commit 까지만 입력하면 : vi editor
* 콜론( : ), 세미콜론( ; )
	콜론 + q = commit 메세지를 저장하지 않고 빠져나간다
