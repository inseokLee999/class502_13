import React from "react";

const JoinForm = (props) => {
    console.log('pre', Object.getOwnPropertyDescriptors(props));
    return (
        <form autoComplete="off">
            <dl>
                <dt>이메일</dt>
                <dd>
                    <input type="text" name="email"/>
                </dd>
            </dl>
            <dl>
                <dt>password</dt>
                <dd>
                    <input type="password" name="password"/>
                </dd>
            </dl>
            <dl>
                <dt>confirmPassword</dt>
                <dd>
                    <input type="password" name="confirmPassword"/>
                </dd>
            </dl>
            <dl>
                <dt>userName</dt>
                <dd>
                    <input type="text" name="userName"/>
                </dd>
            </dl>
            <button type="submit">가입하기</button>
        </form>
    );
};
export default JoinForm;