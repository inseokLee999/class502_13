const todo = {
  data: [],
  init() {
    const jsonData = localStorage.getItem("todos");
    const todos = jsonData ? JSON.parse(jsonData) : [];
    this.data = todos;

    const itemsEl = document.querySelector(".items");
    for (const subject of todos) {
      const liEl = this.getItem(subject);
      itemsEl.appendChild(liEl);
    }
  },

  add() {
    const subject = frmRegist.subject.value;
    const liEl = this.getItem(subject);
    const itemsEl = document.querySelector(".items");
    itemsEl.appendChild(liEl);
    this.data.push(subject);
    this.save();
  },
  getItem(subject) {
    const liEl = document.createElement("li");
    const textEl = document.createTextNode(subject);

    const buttonEl = document.createElement("button");
    buttonEl.type = "button";
    buttonEl.appendChild(document.createTextNode("삭제"));

    liEl.appendChild(textEl);
    liEl.appendChild(buttonEl);

    buttonEl.addEventListener("click", function () {
      const parentEl = liEl.parentElement;
      parentEl.removeChild("liEl");
    });
    return liEl;
  },
  save() {
    localStorage.setItem("todos", JSON.stringify(this.data));
  },
};
window.addEventListener("DOMContentLoaded", function () {
  frmRegist.addEventListener("submit", function (e) {
    e.preventDefault();
    todo.add();
  });
});
