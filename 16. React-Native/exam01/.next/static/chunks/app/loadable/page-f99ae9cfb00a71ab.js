(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[913],{8541:function(e,t,r){Promise.resolve().then(r.bind(r,4771))},6451:function(e,t,r){"use strict";var n=r(2659),o={childContextTypes:!0,contextType:!0,contextTypes:!0,defaultProps:!0,displayName:!0,getDefaultProps:!0,getDerivedStateFromError:!0,getDerivedStateFromProps:!0,mixins:!0,propTypes:!0,type:!0},a={name:!0,length:!0,prototype:!0,caller:!0,callee:!0,arguments:!0,arity:!0},c={$$typeof:!0,compare:!0,defaultProps:!0,displayName:!0,propTypes:!0,type:!0},s={};function i(e){return n.isMemo(e)?c:s[e.$$typeof]||o}s[n.ForwardRef]={$$typeof:!0,render:!0,defaultProps:!0,displayName:!0,propTypes:!0},s[n.Memo]=c;var u=Object.defineProperty,l=Object.getOwnPropertyNames,f=Object.getOwnPropertySymbols,p=Object.getOwnPropertyDescriptor,d=Object.getPrototypeOf,y=Object.prototype;e.exports=function e(t,r,n){if("string"!=typeof r){if(y){var o=d(r);o&&o!==y&&e(t,o,n)}var c=l(r);f&&(c=c.concat(f(r)));for(var s=i(t),h=i(r),m=0;m<c.length;++m){var b=c[m];if(!a[b]&&!(n&&n[b])&&!(h&&h[b])&&!(s&&s[b])){var v=p(r,b);try{u(t,b,v)}catch(e){}}}}return t}},4332:function(e,t){"use strict";/** @license React v16.13.1
 * react-is.production.min.js
 *
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */var r="function"==typeof Symbol&&Symbol.for,n=r?Symbol.for("react.element"):60103,o=r?Symbol.for("react.portal"):60106,a=r?Symbol.for("react.fragment"):60107,c=r?Symbol.for("react.strict_mode"):60108,s=r?Symbol.for("react.profiler"):60114,i=r?Symbol.for("react.provider"):60109,u=r?Symbol.for("react.context"):60110,l=r?Symbol.for("react.async_mode"):60111,f=r?Symbol.for("react.concurrent_mode"):60111,p=r?Symbol.for("react.forward_ref"):60112,d=r?Symbol.for("react.suspense"):60113,y=r?Symbol.for("react.suspense_list"):60120,h=r?Symbol.for("react.memo"):60115,m=r?Symbol.for("react.lazy"):60116,b=r?Symbol.for("react.block"):60121,v=r?Symbol.for("react.fundamental"):60117,g=r?Symbol.for("react.responder"):60118,S=r?Symbol.for("react.scope"):60119;function _(e){if("object"==typeof e&&null!==e){var t=e.$$typeof;switch(t){case n:switch(e=e.type){case l:case f:case a:case s:case c:case d:return e;default:switch(e=e&&e.$$typeof){case u:case p:case m:case h:case i:return e;default:return t}}case o:return t}}}function C(e){return _(e)===f}t.AsyncMode=l,t.ConcurrentMode=f,t.ContextConsumer=u,t.ContextProvider=i,t.Element=n,t.ForwardRef=p,t.Fragment=a,t.Lazy=m,t.Memo=h,t.Portal=o,t.Profiler=s,t.StrictMode=c,t.Suspense=d,t.isAsyncMode=function(e){return C(e)||_(e)===l},t.isConcurrentMode=C,t.isContextConsumer=function(e){return _(e)===u},t.isContextProvider=function(e){return _(e)===i},t.isElement=function(e){return"object"==typeof e&&null!==e&&e.$$typeof===n},t.isForwardRef=function(e){return _(e)===p},t.isFragment=function(e){return _(e)===a},t.isLazy=function(e){return _(e)===m},t.isMemo=function(e){return _(e)===h},t.isPortal=function(e){return _(e)===o},t.isProfiler=function(e){return _(e)===s},t.isStrictMode=function(e){return _(e)===c},t.isSuspense=function(e){return _(e)===d},t.isValidElementType=function(e){return"string"==typeof e||"function"==typeof e||e===a||e===f||e===s||e===c||e===d||e===y||"object"==typeof e&&null!==e&&(e.$$typeof===m||e.$$typeof===h||e.$$typeof===i||e.$$typeof===u||e.$$typeof===p||e.$$typeof===v||e.$$typeof===g||e.$$typeof===S||e.$$typeof===b)},t.typeOf=_},2659:function(e,t,r){"use strict";e.exports=r(4332)},4771:function(e,t,r){"use strict";r.d(t,{default:function(){return k}});var n=r(7437),o=r(2265);function a(e,t){if(null==e)return{};var r={};for(var n in e)if(({}).hasOwnProperty.call(e,n)){if(t.includes(n))continue;r[n]=e[n]}return r}function c(){return(c=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var r=arguments[t];for(var n in r)({}).hasOwnProperty.call(r,n)&&(e[n]=r[n])}return e}).apply(null,arguments)}function s(e,t){return(s=Object.setPrototypeOf?Object.setPrototypeOf.bind():function(e,t){return e.__proto__=t,e})(e,t)}var i=r(6451),u=o.createContext(),l={initialChunks:{}},f="PENDING",p="REJECTED",d=function(e){var t=function(t){return o.createElement(u.Consumer,null,function(r){return o.createElement(e,Object.assign({__chunkExtractor:r},t))})};return e.displayName&&(t.displayName=e.displayName+"WithChunkExtractor"),t},y=function(e){return e};function h(e){var t=e.defaultResolveComponent,r=void 0===t?y:t,n=e.render,u=e.onLoad;function h(e,t){void 0===t&&(t={});var y="function"==typeof e?{requireAsync:e,resolve:function(){},chunkName:function(){}}:e,h={};function m(e){return t.cacheKey?t.cacheKey(e):y.resolve?y.resolve(e):"static"}function b(e,n,o){var a=t.resolveComponent?t.resolveComponent(e,n):r(e);return i(o,a,{preload:!0}),a}var v=function(e){var t=m(e),r=h[t];return r&&r.status!==p||((r=y.requireAsync(e)).status=f,h[t]=r,r.then(function(){r.status="RESOLVED"},function(t){console.error("loadable-components: failed to asynchronously load component",{fileName:y.resolve(e),chunkName:y.chunkName(e),error:t?t.message:t}),r.status=p})),r},g=d(function(e){function r(r){var n;return((n=e.call(this,r)||this).state={result:null,error:null,loading:!0,cacheKey:m(r)},!function(e,t){if(!e){var r=Error("loadable: "+t);throw r.framesToPop=1,r.name="Invariant Violation",r}}(!r.__chunkExtractor||y.requireSync,"SSR requires `@loadable/babel-plugin`, please install it"),r.__chunkExtractor)?(!1===t.ssr||(y.requireAsync(r).catch(function(){return null}),n.loadSync(),r.__chunkExtractor.addChunk(y.chunkName(r))),function(e){if(void 0===e)throw ReferenceError("this hasn't been initialised - super() hasn't been called");return e}(n)):(!1!==t.ssr&&(y.isReady&&y.isReady(r)||y.chunkName&&l.initialChunks[y.chunkName(r)])&&n.loadSync(),n)}r.prototype=Object.create(e.prototype),r.prototype.constructor=r,s(r,e),r.getDerivedStateFromProps=function(e,t){var r=m(e);return c({},t,{cacheKey:r,loading:t.loading||t.cacheKey!==r})};var o=r.prototype;return o.componentDidMount=function(){this.mounted=!0;var e=this.getCache();e&&e.status===p&&this.setCache(),this.state.loading&&this.loadAsync()},o.componentDidUpdate=function(e,t){t.cacheKey!==this.state.cacheKey&&this.loadAsync()},o.componentWillUnmount=function(){this.mounted=!1},o.safeSetState=function(e,t){this.mounted&&this.setState(e,t)},o.getCacheKey=function(){return m(this.props)},o.getCache=function(){return h[this.getCacheKey()]},o.setCache=function(e){void 0===e&&(e=void 0),h[this.getCacheKey()]=e},o.triggerOnLoad=function(){var e=this;u&&setTimeout(function(){u(e.state.result,e.props)})},o.loadSync=function(){if(this.state.loading)try{var e=y.requireSync(this.props),t=b(e,this.props,S);this.state.result=t,this.state.loading=!1}catch(e){console.error("loadable-components: failed to synchronously load component, which expected to be available",{fileName:y.resolve(this.props),chunkName:y.chunkName(this.props),error:e?e.message:e}),this.state.error=e}},o.loadAsync=function(){var e=this,t=this.resolveAsync();return t.then(function(t){var r=b(t,e.props,S);e.safeSetState({result:r,loading:!1},function(){return e.triggerOnLoad()})}).catch(function(t){return e.safeSetState({error:t,loading:!1})}),t},o.resolveAsync=function(){var e=this.props;return v((e.__chunkExtractor,e.forwardedRef,a(e,["__chunkExtractor","forwardedRef"])))},o.render=function(){var e=this.props,r=e.forwardedRef,o=e.fallback,s=(e.__chunkExtractor,a(e,["forwardedRef","fallback","__chunkExtractor"])),i=this.state,u=i.error,l=i.loading,p=i.result;if(t.suspense&&(this.getCache()||this.loadAsync()).status===f)throw this.loadAsync();if(u)throw u;var d=o||t.fallback||null;return l?d:n({fallback:d,result:p,options:t,props:c({},s,{ref:r})})},r}(o.Component)),S=o.forwardRef(function(e,t){return o.createElement(g,Object.assign({forwardedRef:t},e))});return S.displayName="Loadable",S.preload=function(e){S.load(e)},S.load=function(e){return v(e)},S}return{loadable:h,lazy:function(e,t){return h(e,c({},t,{suspense:!0}))}}}var m=h({defaultResolveComponent:function(e){return e.__esModule?e.default:e.default||e},render:function(e){var t=e.result,r=e.props;return o.createElement(t,r)}}),b=m.loadable,v=m.lazy,g=h({onLoad:function(e,t){e&&t.forwardedRef&&("function"==typeof t.forwardedRef?t.forwardedRef(e):t.forwardedRef.current=e)},render:function(e){var t=e.result,r=e.props;return r.children?r.children(t):null}}),S=g.loadable,_=g.lazy;b.lib=S,v.lib=_;let C=b(()=>r.e(366).then(r.bind(r,5366)),{fallback:(0,n.jsx)("div",{children:"로딩중..."})});var k=()=>{let[e,t]=(0,o.useState)(!1);return(0,n.jsxs)(n.Fragment,{children:[e&&(0,n.jsx)(C,{}),(0,n.jsx)("button",{type:"button",onClick:()=>t(!e),children:"보이기"})]})}}},function(e){e.O(0,[971,23,744],function(){return e(e.s=8541)}),_N_E=e.O()}]);