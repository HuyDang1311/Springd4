<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<tiles:insertAttribute name="header"></tiles:insertAttribute>
  <div class="body">
    <div class="body_resize">
      <tiles:insertAttribute name="body"></tiles:insertAttribute>
      <tiles:insertAttribute name="sidebar"></tiles:insertAttribute>
      <div class="clr"></div>
    </div>
  </div>
  <tiles:insertAttribute name="footer"></tiles:insertAttribute>
</div>
</html>
