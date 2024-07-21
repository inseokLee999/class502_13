const todos = {
    getTpl() {
        const tplEl = document.getElementById("tpl");

        return tplEl.innerHTML;
    },
    add(todo) {
        todo = todo.trim() ?? "";
        if(!todo){
            throw new Error("할 일을 입력하세요.");
        }
        let html = this.getTpl();
        html = html.replace(/#todo/g,todo);

        const domParser = new DOMParser();
        const dom = domParser.parseFromString(html, "text/html");
        const liEl = dom.querySelector("li");
        const schedulesEl = document.getElementById("schedules");
        schedulesEl.append(liEl);
        const buttonEl = liEl.querySelector("button");
        buttonEl.addEventListener("click", function () {
            if (confirm("정말 삭제하겠습니까?")) {
                liEl.remove();
            }
        })
    }
}