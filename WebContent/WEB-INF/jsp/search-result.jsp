<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE HTML>
<html>

<head>
  <title>1 Click Hotel</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
  <link rel="stylesheet" type="text/css" href="style/style.css" />
</head>

<body>
  <div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
        
          <h1><a href="index.jsp">1<span class="logo_colour">Click Hotel</span></a></h1>
          <h2>Finding a room never been easier!</h2>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li><a href="index.jsp" class="selected">Home</a></li>
          <li><a href="index.jsp">Cars</a></li>
          <li><a href="index.jsp">Bundle Deals</a></li>
          <li ><a href="index.jsp">Discover</a></li>
          <li><a href="index.jsp">Things to Do</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
      <div id="sidebar_container">
        <div class="sidebar">
          <div class="sidebar_top"></div>
          <div class="sidebar_item">
            <!-- insert your sidebar items here -->
            <h3>Latest Offers</h3>
            <h4>Best deals this summer</h4>
            <h5>Starting from July 1st, 2017</h5>
            <p>Enjoy summer trips to Europe, Maldives, Hawaii, and other places with minimum cost ever!  <br /><a href="#">Read more</a></p>
          </div>
          <div class="sidebar_base"></div>
        </div>
        <div class="sidebar">
          <div class="sidebar_top"></div>
          <div class="sidebar_item">
            <h3>More</h3>
            <ul>
              <li><a href="#">Hot Deals</a></li>
              <li><a href="#">Plan a vacation</a></li>
              <li><a href="#">Rewards</a></li>
              <li><a href="#">Advisor</a></li>
            </ul>
          </div>
          <div class="sidebar_base"></div>
        </div>
        <div class="sidebar">
          <div class="sidebar_top"></div>
          <div class="sidebar_item">
            <h3>Search</h3>
            <form method="post" action="#" id="search_form">
              <p>
                <input class="search" type="text" name="search_field" value="Enter keywords....." />
                <input name="search" type="image" style="border: 0; margin: 0 0 -9px 5px;" src="style/search.png" alt="Search" title="Search" />
              </p>
            </form>
          </div>
          <div class="sidebar_base"></div>
        </div>
      </div>
      <div id="content"><br/><br/>
       
<c:forEach items="${searchInfo.offers.hotels}" var="hotel"> 
	   <table>
		  <tr>
		    <td><h4><a href="#">${hotel.hotelInfo.hotelName}</a></h4><br/>
		    ${hotel.hotelInfo.hotelStreetAddress}<br/>
		    <br/>${hotel.hotelInfo.description}<br/></td>
		    <td><img src="${hotel.hotelInfo.hotelImageUrl}" /> </td>
		    </tr>
		    <tr>
		    <td>Rate: ${hotel.hotelInfo.hotelStarRating} out of 5 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>
		    <td>Price /Night: ${hotel.hotelPricingInfo.totalPriceValue} ${hotel.hotelPricingInfo.currency}&nbsp;&nbsp;&nbsp;&nbsp;</td>
		  </tr>
	</table>
</c:forEach>
	   
      </div>
    </div>
    <div id="content_footer"></div>
    <div id="footer">
      <p><a href="index.jsp">Home</a> | <a href="index.jsp">Cars</a> | <a href="index.jsp">Bundle Deals</a> | <a href="index.jsp">Discover</a> | <a href="index.jsp">Things to Do</a> | <a href="index.jsp">Contact us</a></p>
      <p>Copyright &copy;2017 One Click Hotel. All rights reserved.</p>
    </div>
  </div>
</body>
</html>
