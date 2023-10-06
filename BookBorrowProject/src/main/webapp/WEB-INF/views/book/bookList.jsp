<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 목록</title>
</head>
<body>
	<div>
        <h1>게시판</h1>
        <table>
            <thead>
                <tr>
                    <th>ISBN</th>
                    <th>제목</th>
                    <th>저자</th>
                    <th>출판사</th>
                    <th>출판일</th>
                    <th>책 설명</th>
                    <th>가격</th>
                    <th>사진</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="data" items="${data}">
                    <tr>
                        <td>${data.ISBN}</td>
                        <td><a href="/bookDetail?id=${data.ISBN}">${data.title}</a></td>
                        <td>${data.author}</td>
                        <td>${data.publisher}</td>
                        <td>${data.pdate}</td>
                        <td>${data.description}</td>
                        <td>${data.discount}</td>
                        <td>${data.pic}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <form action="/bookSearch">
            <div>
                <input type="text" name="subject" placeholder="제목으로 검색">
                <div>
                    <button type="submit">검색</button>
                </div>
            </div>
        </form>
        <p><a href="/bookCreate">글쓰기</a></p>
        <p><a href="/main">메인으로</a></p>
    </div>
</body>
</html>