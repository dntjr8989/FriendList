친구들 목록을 추가, 삭제하며 관리할 수 있는 자바 코드이다.
Test : 처음 코드를 실행 시작하는 부분
FriendListGUI : 전체적인 GUI
Addflame : GUI 부분 중 친구 추가하는 GUI 

Friend : 친구들에 대한 정보를 가지고 있는 Friend 클래스

FriendList : Friend클래스들의 개체로 만든 List
-numFriends() : 친구 수에 대한 정보 반환
-getFriend(int i) : i번째 친구에 대한 정보 반환
-addFriend(String[] inputFriendList) : 친구 추가

FriendListFile : 친구에 대한 정보들을 텍스트 파일로 입출력하는 코드
- readFileToList(String fileName) : 처음 프로그램 시작시, 그 전에 텍스트파일 로 저장해준 친구 리스트 부르기
- writeListToFile(String fileName, FriendList Friend) : 친구들에 대한 정보 텍스트 파일로 저장.