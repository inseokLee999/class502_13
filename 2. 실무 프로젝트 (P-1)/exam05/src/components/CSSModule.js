import styles from './CSSmodule.module.scss';
import { useState } from 'react';
import classNames from 'classnames';
console.log(styles);
const CSSModule = () => {
  const [visible, setVisible] = useState(false);
  return (
    <>
      <div className={styles.wrapper}>
        <span className="commonColor">안녕 하시오</span> ,
        <span className={styles.highlight}>반갑소.</span>
      </div>
      <div className={classNames('menus', ['cls1', 'cls2'], { on: visible })}>
        메뉴
      </div>
      <button type="button" onClick={() => setVisible(!visible)}>
        클릭
      </button>
    </>
  );
};
export default CSSModule;
