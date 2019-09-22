<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity5">
<head>
<title>Manager page</title>
<link th:href="@{/resources/styles/index.css}" rel="stylesheet">

</head>

 <body scroll="no">
	<div class="panel">
		<div class="info-panel">
			<div class="profile">
				<a href="profile">Profile</a>
			</div>
		</div>
	</div>

	<div class="chat-box">
		<div class="info-field">
			<a>Info field</a>
		</div>
		<div class="chat-field">
			<div class="chat-title">
				<a>Message information:</a>
			</div>
			<th th:each="msg : ${messages}"><a th:text="${msg.body}"></a></th>
		</div>
	</div>
</body>

</html>