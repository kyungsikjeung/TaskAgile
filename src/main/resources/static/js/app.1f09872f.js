(function(t){function e(e){for(var a,o,i=e[0],l=e[1],c=e[2],m=0,f=[];m<i.length;m++)o=i[m],Object.prototype.hasOwnProperty.call(s,o)&&s[o]&&f.push(s[o][0]),s[o]=0;for(a in l)Object.prototype.hasOwnProperty.call(l,a)&&(t[a]=l[a]);u&&u(e);while(f.length)f.shift()();return n.push.apply(n,c||[]),r()}function r(){for(var t,e=0;e<n.length;e++){for(var r=n[e],a=!0,i=1;i<r.length;i++){var l=r[i];0!==s[l]&&(a=!1)}a&&(n.splice(e--,1),t=o(o.s=r[0]))}return t}var a={},s={app:0},n=[];function o(e){if(a[e])return a[e].exports;var r=a[e]={i:e,l:!1,exports:{}};return t[e].call(r.exports,r,r.exports,o),r.l=!0,r.exports}o.m=t,o.c=a,o.d=function(t,e,r){o.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:r})},o.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},o.t=function(t,e){if(1&e&&(t=o(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var r=Object.create(null);if(o.r(r),Object.defineProperty(r,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var a in t)o.d(r,a,function(e){return t[e]}.bind(null,a));return r},o.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return o.d(e,"a",e),e},o.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},o.p="/";var i=window["webpackJsonp"]=window["webpackJsonp"]||[],l=i.push.bind(i);i.push=e,i=i.slice();for(var c=0;c<i.length;c++)e(i[c]);var u=l;n.push(["56d7","chunk-vendors"]),r()})({"0ba5":function(t,e,r){},"56d7":function(t,e,r){"use strict";r.r(e);var a=r("2b0e"),s=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{attrs:{id:"app"}},[r("router-view")],1)},n=[],o={name:"App"},i=o,l=r("2877"),c=Object(l["a"])(i,s,n,!1,null,null,null),u=c.exports,m=r("8c4f"),f=function(){var t=this,e=t.$createElement;t._self._c;return t._m(0)},p=[function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",[r("h1",[t._v("TaskAgile")])])}],d={name:"LoginPage"},v=d,g=Object(l["a"])(v,f,p,!1,null,null,null),_=g.exports,b=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"container"},[r("div",{staticClass:"row justify-content-center"},[r("div",{staticClass:"register-form"},[t._m(0),r("form",{on:{submit:function(e){return e.preventDefault(),t.submitForm(e)}}},[r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"username"}},[t._v("Username")]),r("input",{directives:[{name:"model",rawName:"v-model",value:t.form.username,expression:"form.username"}],staticClass:"form-control",attrs:{type:"text",id:"username"},domProps:{value:t.form.username},on:{input:function(e){e.target.composing||t.$set(t.form,"username",e.target.value)}}})]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"emailAddress"}},[t._v("Email address")]),r("input",{directives:[{name:"model",rawName:"v-model",value:t.form.emailAddress,expression:"form.emailAddress"}],staticClass:"form-control",attrs:{type:"email",id:"emailAddress"},domProps:{value:t.form.emailAddress},on:{input:function(e){e.target.composing||t.$set(t.form,"emailAddress",e.target.value)}}})]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"password"}},[t._v("Password")]),r("input",{directives:[{name:"model",rawName:"v-model",value:t.form.password,expression:"form.password"}],staticClass:"form-control",attrs:{type:"password",id:"password"},domProps:{value:t.form.password},on:{input:function(e){e.target.composing||t.$set(t.form,"password",e.target.value)}}})]),r("button",{staticClass:"btn btn-primary btn-block",attrs:{type:"submit"}},[t._v(" Create account ")]),t._m(1),t._m(2)])])]),t._m(3)])},h=[function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"logo-wrapper"},[r("img",{staticClass:"logo",attrs:{src:"/static/images/logo.png"}}),r("div",{staticClass:"tagline"},[t._v("Open source task management tool")])])},function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("p",{staticClass:"accept-terms text-muted"},[t._v(" By clicking “Create account”, you agree to our "),r("a",{attrs:{href:"#"}},[t._v("terms of service")]),t._v(" and "),r("a",{attrs:{href:"#"}},[t._v("privacy policy")]),t._v(". ")])},function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("p",{staticClass:"text-center text-muted"},[t._v(" Already have an account? "),r("a",{attrs:{href:"/login"}},[t._v("Sign in")])])},function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("footer",{staticClass:"footer"},[r("span",{staticClass:"copyright"},[t._v("© 2018 TaskAgile.com")]),r("ul",{staticClass:"footer-links list-inline float-right"},[r("li",{staticClass:"list-inline-item"},[r("a",{attrs:{href:"#"}},[t._v("About")])]),r("li",{staticClass:"list-inline-item"},[r("a",{attrs:{href:"#"}},[t._v("Terms of Service")])]),r("li",{staticClass:"list-inline-item"},[r("a",{attrs:{href:"#"}},[t._v("Privacy Policy")])]),r("li",{staticClass:"list-inline-item"},[r("a",{attrs:{href:"https://github.com/taskagile/vuejs.spring-boot.mysql",target:"_blank"}},[t._v("GitHub")])])])])}],y={name:"RegisterPage",data:function(){return{form:{username:"",emailAddress:"",password:""}}},methods:{submitForm(){}}},w=y,C=(r("5aa2"),Object(l["a"])(w,b,h,!1,null,"acc93d4a",null)),P=C.exports;a["a"].use(m["a"]);const j=[{path:"/login",name:"LoginPage",component:_},{path:"/registrations",name:"RegisterPage",component:P}],x=new m["a"]({mode:"history",base:"/",routes:j});var O=x,A=r("2f62");a["a"].use(A["a"]);var $=new A["a"].Store({state:{},mutations:{},actions:{},modules:{}}),k=r("bc3a"),E=r.n(k);E.a.defaults.baseURL="/api",E.a.defaults.headers.common.Accept="application/json",E.a.interceptors.response.use(t=>t,t=>Promise.reject(t)),a["a"].config.productionTip=!1,new a["a"]({router:O,store:$,render:function(t){return t(u)}}).$mount("#app")},"5aa2":function(t,e,r){"use strict";var a=r("0ba5"),s=r.n(a);s.a}});
//# sourceMappingURL=app.1f09872f.js.map