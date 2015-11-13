<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bloqueio Telemarketing - Não Pertube</title>
<link rel="stylesheet" type="text/css" media="print"
	href="css/print.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/normalize.css">

<!-- Optional theme -->
<link rel="stylesheet" href="css/bootstrap-theme.min.css">
<link href="css/graph-def.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="css/style.css">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->
<!-- Latest compiled and minified JavaScript -->
<script src="js/jquery-2.1.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>

<!-- Favicons -->
<link rel="apple-touch-icon" href="/apple-touch-icon.png">
<link rel="icon" href="/favicon.ico">

</head>
<body>
	<div class="container">
		<div class="page-header">
			<h2>
				Sistema Não Pertube <br /> <small>Consumidores</small>
			</h2>
		</div>
		<div class="row">
			<div class="col-sm-6 col-md-6">
				<c:if test="${not empty param.msg}">
					<div class="alert alert-warning alert-dismissible" role="alert">
						<button type="button" class="close" data-dismiss="alert"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<strong>Atenção!</strong> ${param.msg }.
					</div>
				</c:if>
				<div class="page-header">
					<h4>Cadastro de telefones</h4>
				</div>
				<div class="well">
					<br />
					<form class="form-horizontal" method='post'
						action="addConsumidor.do">
						<div class="form-group">
							<label for="inputNome" class="col-sm-2 control-label">Nome</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="nome" name="cn_nome"
									placeholder="Nome" />
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail" class="col-sm-2 control-label">Email</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="email"
									name="cn_email" placeholder="Email" />
							</div>
						</div>
						<div class="form-group">
							<label for="inputTelb1" class="col-sm-2 control-label">Telefone
								1</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="telb1"
									name="cn_telb1" placeholder="Telefone 1" />
							</div>
						</div>
						<div class="form-group">
							<label for="inputTelb2" class="col-sm-2 control-label">Telefone
								2</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="telb2"
									name="cn_telb2" placeholder="Telefone 2" />
							</div>
						</div>
						<div class="form-group">
							<label for="inputTelb3" class="col-sm-2 control-label">Telefone
								3</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="telb3"
									name="cn_telb3" placeholder="Telefone 3" />
							</div>
						</div>
						<div class="form-group">
							<label for="inputTelb4" class="col-sm-2 control-label">Telefone
								4</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="telb4"
									name="cn_telb4" placeholder="Telefone 4" />
							</div>
						</div>
						<div class="form-group">
							<label for="inputData" class="col-sm-2 control-label">Telefone
								4</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="inputData"
									name="cn_lastlogin" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									<label> <input type="checkbox" name="cn_bltmk"
										value="1" checked /> Bloquear chamadas
									</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-default">Salvar</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- Latest compiled and minified JavaScript -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>