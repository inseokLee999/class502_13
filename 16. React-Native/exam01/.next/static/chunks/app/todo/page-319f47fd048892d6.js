(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[435],{835:function(e,n,t){Promise.resolve().then(t.bind(t,6687))},6687:function(e,n,t){"use strict";t.d(n,{default:function(){return N}});var l=t(7437),i=t(2265),r=t(4643),o=t(8646),s=t(9824);function d(e){let{children:n}=e,t=Array.isArray(n)?n:[n];return(0,l.jsx)(l.Fragment,{children:t&&t.length>0&&t.map(e=>(0,l.jsx)("div",{children:e},e))})}var c=t(9152),u=t.n(c),a=t(8856),x=t.n(a),f=t(7041);function h(){let e=(0,o._)(["\n    border: 0;\n    height: 45px;\n    padding: 0 35px;\n    color: #fff;\n"]);return h=function(){return e},e}function j(){let e=(0,o._)([" //tagged 함수\n    background: ","; //함수를 정의하면 첫번째 매개변수가 props 개체\n    ",";   \n    font-size: 1.3rem;\n"]);return j=function(){return e},e}let m=(0,f.iv)(h()),p=f.ZP.button(j(),e=>null!=e?e:"pink",m),v=x().bind(u());var b=i.memo(e=>{var n,t;let{onSubmit:i,onChange:r,onClick:o,form:c,titleRef:a,errors:f}=e;return(0,l.jsxs)("form",{autoComplete:"off",onSubmit:i,children:[(0,l.jsx)("button",{type:"button",className:x()(v({on:!0})),children:"클리끄"}),(0,l.jsxs)("dl",{className:u().item,children:[(0,l.jsx)("dt",{className:"tit",children:"할일"}),(0,l.jsxs)("dd",{children:[(0,l.jsx)("input",{type:"text",name:"title",onChange:r,value:null!==(n=null==c?void 0:c.title)&&void 0!==n?n:"",ref:a}),(null==f?void 0:f.title)&&(0,l.jsx)(d,{children:f.title})]})]}),(0,l.jsxs)("dl",{children:[(0,l.jsx)("dt",{children:"내용"}),(0,l.jsxs)("dd",{children:[(0,l.jsx)("textarea",{name:"content",onChange:r,value:null!==(t=null==c?void 0:c.content)&&void 0!==t?t:""}),(null==f?void 0:f.content)&&(0,l.jsx)(d,{children:f.content})]})]}),(0,l.jsxs)("dl",{children:[(0,l.jsx)("dt",{children:"완료여부"}),(0,l.jsxs)("dd",{children:[(0,l.jsxs)("span",{onClick:()=>o(!0),children:[(null==c?void 0:c.done)?(0,l.jsx)(s.uJx,{}):(0,l.jsx)(s.Irp,{}),"완료"]}),(0,l.jsxs)("span",{onClick:()=>o(!1),children:[(null==c?void 0:c.done)?(0,l.jsx)(s.Irp,{}):(0,l.jsx)(s.uJx,{}),"미완료"]})]})]}),(0,l.jsx)(p,{type:"submit",color:"red",children:"할일 등록"})]})}),g=t(1942),k=t(3003);function C(){let e=(0,o._)(["\n    display: flex;\n    border: 1px solid #000;\n    padding: 10px;\n\n    & + & {\n        margin-top: 10px;\n    }\n"]);return C=function(){return e},e}let _=(0,f.ZP)(e=>{let{item:n,onToggle:t,onRemove:i,className:r}=e,{id:o,title:s,content:d,done:c}=n;return(0,l.jsxs)("li",{onClick:()=>t(o),className:r,children:[(0,l.jsxs)("div",{children:[c?(0,l.jsx)(g.xik,{}):(0,l.jsx)(g.UUc,{}),s,(0,l.jsx)(k.wAo,{onClick:()=>i(o)})]}),(0,l.jsx)("div",{children:d&&(0,l.jsx)("div",{children:d})})]},o)})(C());var y=i.memo(e=>{let{items:n,onToggle:t,onRemove:i}=e;return(0,l.jsx)("ul",{children:n&&n.length>0&&n.map(e=>(0,l.jsx)(_,{item:e,onToggle:t,onRemove:i},e.id))})}),N=i.memo(()=>{let[e,n]=(0,i.useState)([{id:1,title:"할일1",content:"내용1",done:!0},{id:2,title:"할일2",content:"내용2",done:!1},{id:3,title:"할일3",content:"내용3",done:!1}]),[t,o]=(0,i.useState)({}),[s,d]=(0,i.useState)({}),c=(0,i.useRef)();(0,i.useEffect)(()=>{c&&c.current.focus()},[c]);let u=(0,i.useCallback)(e=>{n((0,r.Uy)(n=>{n.filter(n=>n.id===e).forEach(e=>{e.done=!e.done})}))},[]),a=(0,i.useCallback)(e=>{n(n=>n.filter(n=>n.id!==e))},[]),x=(0,i.useCallback)(e=>{let n=e.target.name,t=e.target.value;o(e=>({...e,[n]:t}))},[]),f=(0,i.useCallback)(l=>{l.preventDefault();let i={},r=!1;for(let[e,n]of Object.entries({title:"제목을 입력하세요.",content:"내용을 입력하세요."}))if(!t[e]||!t[e].trim()){var s;i[e]=null!==(s=i[e])&&void 0!==s?s:[],i[e].push(n),r=!0}if(d(i),r)return;let u=e?Math.max(...e.map(e=>e.id))+1:1;n(e=>e.concat({...t,id:u})),o({}),c.current.focus()},[t,e]),h=(0,i.useCallback)(e=>{o(n=>({...n,done:e}))},[]);return(0,l.jsxs)(l.Fragment,{children:[(0,l.jsx)(b,{onSubmit:f,onChange:x,onClick:h,form:t,titleRef:c,errors:s}),(0,l.jsx)(y,{items:e,onToggle:u,onRemove:a})]})})},9152:function(e){e.exports={item:"todo_item__J_Ilb",on:"todo_on__WtdM5"}}},function(e){e.O(0,[930,452,699,994,999,971,23,744],function(){return e(e.s=835)}),_N_E=e.O()}]);