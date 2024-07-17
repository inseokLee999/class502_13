const todos = {
    // 스케줄 추가
    add(todo){
        // .?? 값이 있는지 없는지 nullish 널 병합 연산자
        todo = todo ?? "";
        todo = todo.trim()
        if(!todo){
            throw new Error("스케줄을 입력하세요");
        }
        const button = document.createElement("button");
        button.append("삭제");

        const liEl = document.createElement("li");
        liEl.append(todo,button);

        const schedulesEl = document.getElementById("schedules");
        schedulesEl.append(liEl)
        // 스케줄 삭제
        button.addEventListener("click",function(){
            if(confirm("정말 삭제 하시겠습니까?")){
                liEl.remove();
            }
        });
    },
    // 스케줄 제거
    remove(){
        
    }
}
window.addEventListener("DOMContentLoaded",function(){
    frmRegist.addEventListener("submit",function(e){
        // this = event가 발생한 가장 중요한 것 : frmRegist
        e.preventDefault();
        const todoEl = this.todo;
        try {
            todos.add(todoEl.value); // 스케줄 등록
      
            todoEl.value = "";
          } catch (e) {
            alert(e.message);
          }
          todoEl.focus();
    });
});