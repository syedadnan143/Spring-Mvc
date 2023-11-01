<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>

<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  <div class="container mt-5"  >
  <h3 class="text-center">welcome this is addy's form</h3>
  <p class="text-center">home for programmer</p>
  
    <form action="processform" method="post">
  <div class="form-group">
    <label for="user name"> user name</label>
    <input type="text"
     class="form-control" 
     id="exampleInputEmail1"
      aria-describedby="emailHelp"
       placeholder="Enter user name"
       name="name">
    
  </div>
  <div class="form-group">
   <label for="exampleInputEmail1">Email address</label>
    <input type="email"
     class="form-control"
      id="exampleInputEmail1"
       aria-describedby="emailHelp" 
       placeholder="Enter email"
       name="email">
   
  </div>
  <div class="form-group">
   <label for="user password">Enter Password</label>
    <input type="password"
     class="form-control" 
     id="exampleInputEmail1" 
     aria-describedby="emailHelp"
      placeholder="Enter password"
      name = "password">
    
    </div>
    
       <div class="container text-center">
       
       
        <button type="submit" class="btn-btn-success"> sign up</button>
       
       </div>
   </form>
  </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
   
  </body>
</html>