# 설정

## .prettierrct 설정

## 의존성

> 필요 라이브러리

- react-router-dom
- sass, styled-components,classnames
- immer
- react-icons
- @loadable/component
- react-helmet-async

## react-helmet-async 설정

-src/index.js

```jsx
...

import { HelmetProvider } from 'react-helmet-async';
...

root.render(
  <React.StrictMode>
    <HelmetProvider>
      <App />
    </HelmetProvider>
  </React.StrictMode>,
);
```

## How to use

```jsx
import { Helmet } from 'react-helmet-async';
const App = () => {
  return (
    <>
      <Helmet>
        <title>사이트 제목 변경 테스트</title>
      </Helmet>
    </>
  );
};
export default App;
```

## 메세지, 다국어 처리

-의존성 : i18next, react-18next -의존성 설치

```
yarn add i18next react-i18next
```

- 언어파일 생성
- src/langs/ko , src/langs/en 폴더 생성
- 각 폴더 별로 공통 문구 - commons.js, 검증 문구 - validation.js, 에러 문구 - error.js
- 언어파일 통합 : 예) src/langs/ko/index.js

```javascript
import commons from './commons';
import validations from './validations';
import errors from './errors';

const ko = { ...commons, ...validations, ...errors };

export default ko;
```

- 설정 파일 구성 : src/i18n.js

```javascript
import i18n from 'i18next';
import { initReactI18next } from 'react-i18next';
import ko from '.langs/ko'; // ko/index.js와 같다
import en from '.langs/en';
const resources = {
  en: {
    translation: en,
  },
  ko: {
    translation: ko,
  },
};
i18n.use(initReactI18next).init({
  resources,
  lng: 'ko', //lng: navigator.language : 네비게이터의 언어
});
```

- 설정 반영: src/index.js

```javascript
...
import './i18n';
...
```

-적용하기 : useTranslation 훅 / react-i18next

-t : 메세지 조회 함수

- i18n : 편의 기능 객체, changeLanguage(..) : 언어변경

```javascript
import { Helmet } from 'react-helmet-async';
import { useTranslation } from 'react-i18next';

const App = () => {
  const { t, i18n } = useTranslation();

  return (
    <>
      <Helmet>
        <title>사이트 제목 변경 테스트!</title>
      </Helmet>
      <div>{t('아이디')}</div>
      <div>{t('약관에_동의')}</div>
      <div>{t('없는_문구')}</div>
      <button type="button" onClick={() => i18n.changeLanguage('ko')}>
        한국어
      </button>
      <button type="button" onClick={() => i18n.changeLanguage('en')}>
        English
      </button>
    </>
  );
};

export default App;
```

# 레이아웃 구성

- src/layouts/MaingLayout.js
- src/outlines/Header.js
- src/outlines/Footer.js

# 라우팅 구성

## 설정

-src/index.js : BrowserRouter 컴포넌트로 감싸기

```jsx
...
import { BrowserRouter } from 'react-router-dom';
...
root.render(
  <React.StrictMode>
    <HelmetProvider>
      <BrowserRouter>
        <App />
      </BrowserRouter>
    </HelmetProvider>
  </React.StrictMode>,
);
```

## 메인페이지

-/

## 회원

- /member/join: 회원가입
- /member/login:로그인
## 없는 페이지

- - : 없는 페이지 -commons/pages/NotFound.js