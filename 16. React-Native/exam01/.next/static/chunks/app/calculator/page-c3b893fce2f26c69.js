(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[179],{1307:function(e,t,n){Promise.resolve().then(n.bind(n,9430))},9430:function(e,t,n){"use strict";var u=n(7437),s=n(2265);t.default=()=>{let[e,t]=(0,s.useState)([]),[n,r]=(0,s.useState)(),l=(0,s.useMemo)(()=>(console.log("getAverage 함수 호출"),0===e.length)?0:e.reduce((e,t)=>e+t)/e.length,[e]);return(0,u.jsxs)(u.Fragment,{children:[(0,u.jsxs)("form",{autoComplete:"off",onSubmit:e=>{e.preventDefault(),t(e=>e.concat(n))},children:[(0,u.jsx)("input",{type:"text",onChange:e=>{r(Number(e.target.value))}}),(0,u.jsx)("button",{type:"submit",children:"숫자 추가하기"})]}),(0,u.jsx)("ul",{children:e.map((e,t)=>(0,u.jsx)("li",{children:e},t))}),(0,u.jsxs)("div",{children:["평균 : ",l]})]})}}},function(e){e.O(0,[971,23,744],function(){return e(e.s=1307)}),_N_E=e.O()}]);