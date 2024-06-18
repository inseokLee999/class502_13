<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="board.entities.*" %>
<%
    BoardData board = BoardData.builder()
            .subject("제제제목")
            .content("내요요용")
            .build();
    session.setAttribute("board", board);
    session.setAttribute("title","제레레목");
%>