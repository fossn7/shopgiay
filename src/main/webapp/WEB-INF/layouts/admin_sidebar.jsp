<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<ul class="sidebar navbar-nav">
	<li class="nav-item active">
		<a class="nav-link" href="index.html">
			<i class="fas fa-fw fa-tachometer-alt"></i>
			<span>Dashboard</span>
		</a>
	</li>
	<li class="nav-item active">
		<a class="nav-link"
			href="${pageContext.request.contextPath }/admin/categories">
			<i class="fas fa-fw fa-tachometer-alt"></i>
			<span>Quản lý danh mục</span>
		</a>
	</li>
	<li class="nav-item active">
		<a class="nav-link" href="index.html">
			<i class="fas fa-fw fa-tachometer-alt"></i>
			<span>Quản lý sản phẩm</span>
		</a>
	</li>
	<li class="nav-item dropdown">
		<a class="nav-link dropdown-toggle" href="#" id="pagesDropdown"
			role="button" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false">
			<i class="fas fa-fw fa-folder"></i>
			<span>Quản lý giao dịch</span>
		</a>
		<div class="dropdown-menu" aria-labelledby="pagesDropdown">
			<a class="dropdown-item" href="login.html">Tất cả giao dịch</a>
			<a class="dropdown-item" href="register.html">Đơn hàng đang chờ</a>
		</div>
	</li>
	<li class="nav-item">
		<a class="nav-link" href="charts.html">
			<i class="fas fa-fw fa-chart-area"></i>
			<span>Charts</span>
		</a>
	</li>
	<li class="nav-item">
		<a class="nav-link" href="tables.html">
			<i class="fas fa-fw fa-table"></i>
			<span>Tables</span>
		</a>
	</li>
</ul>