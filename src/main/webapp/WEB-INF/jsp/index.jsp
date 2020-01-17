<%@ include file="common/header.jspf" %>

<div class="container">

	<form action="/login" method="post">
		ID:<input type="text" name="custId">
		Password:<input type="password" name="password">
		<input type="submit" value="login">
	</form>
	
</div>

<%@ include file="common/footer.jspf" %>