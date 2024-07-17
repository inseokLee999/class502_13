const todos = {
    add(){

    },
    remove(){
        
    }
}
window.addEventListener("DOMContentLoaded",function(){
    frmRegist.addEventListener("submit",function(e){
        // this = event가 발생한 가장 중요한 것 : frmRegist
        e.preventDefault();
        const todo = this.todo.value.trim()
        const liEl = document.createElement("li");
        liEl.appendChild(document.createTextNode(todo));
        document.getElementById("schedules").appendChild(liEl);
    });
});