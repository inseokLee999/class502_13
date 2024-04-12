const todo = {
  id: 1,
  data: [], // 스케줄 데이터
  init() {
    //초기 저장값 조회 -> 스케줄 완성
    const jsonData = localStorage.getItem("todos");
    const todos = jsonData ? JSON.parse(jsonData) : []; // 받아온 데이터가 빈값이면 빈 배열
    this.data = todos;
    this.id = todos.length + 1;
    //console.log(this);
    const itemsEl = document.querySelector(".items");
    for (const item of todos) {
      //symbol.iterator : 반복자 패턴, 반복이 필요한 객체
      const liEl = this.getItem(item.title);
      itemsEl.appendChild(liEl);
    }
  },
  /*
   스케줄 추가
   */
  add() {
    const subject = frmRegist.subject.value;

    if (!subject.trim()) {
      // 좌우 공백 제거
      alert("할일을 입력하세요.");
      return;
    }
    const liEl = this.getItem(subject); // this 는 todo
    const itemsEl = document.querySelector(".items");
    itemsEl.appendChild(liEl);
    console.log("liEl:", liEl, "itemsEl:", itemsEl);

    frmRegist.subject.value = ""; // 입력값 초기화
    frmRegist.subject.focus(); // 입력창 커서

    const { data } = this;
    let id = this.id++;
    data.push({
      id,
      title: subject,
    });

    this.save();
    liEl.dataset.id = id;
  },
  save() {
    localStorage.setItem("todos", JSON.stringify(this.data));
  },

  getItem(subject) {
    const liEl = document.createElement("li"); //li태그 생성
    liEl.appendChild(document.createTextNode(subject));

    const buttonEl = document.createElement("button"); //버튼 태그 생성
    buttonEl.appendChild(document.createTextNode("삭제"));
    liEl.appendChild(buttonEl);

    // 스케줄 삭제
    buttonEl.addEventListener("click", function () {
      const itemsEl = document.querySelector(".items");
      itemsEl.removeChild(liEl);

      //localStorage 에 저장된 데이터도 삭제
      const id = Number(liEl.dataset.id);
      const index = todo.data.findIndex((item) => item.id === id);
      if (index !== -1) {
        todo.data.splice(index, 1);
        todo.save();
      }
    });
    return liEl;
  },
};

window.addEventListener("DOMContentLoaded", function () {
  todo.init(); //데이터 조회 및 완성
  frmRegist.addEventListener("submit", function (e) {
    e.preventDefault();
    todo.add(); // 스케줄 추가
  });
});
