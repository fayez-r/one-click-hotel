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
          <h2>Finding a hotel never been easier!</h2>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <li><a href="index.jsp" class="selected">Home</a></li>
          <li><a href="index.jsp">Cars</a></li>
          <li><a href="index.jsp">Bundle Deals</a></li>
          <li ><a href="index.jsp">Discover</a></li>
          <li><a href="index.jsp">Things to Do</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
   <a href="https://travis-ci.org/alrafeea/one-click-hotel.svg?branch=master"> <img src="style/passing.svg" /></a>
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
       <form action="search">
			City: <input type="text" name="city" size="70"/> <br/><br/><br/>
			Check in: <input type="date" name="from" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			Check out: <input type="date" name="to" /> <br/><br/><br/>
			Minimum Stars:  <select name="minStar">
			  <option value="1">1</option>
			  <option value="2">2</option>
			  <option value="3">3</option>
			  <option value="4">4</option>
			  <option value="4">5</option>
			</select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			Maximum Stars: <select name="maxStar">
			  <option value="1">1</option>
			  <option value="2">2</option>
			  <option value="3">3</option>
			  <option value="4">4</option>
			  <option value="4">5</option>
			</select> <br/><br/><br/><br/>
			<input type="submit" name="Search" value="Find me a hotel"/>
			</form>
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
