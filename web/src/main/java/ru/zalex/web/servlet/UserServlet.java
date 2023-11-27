package ru.zalex.web.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import ru.zalex.service.service.UserService;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

  private final UserService userService = new UserService();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    var user = userService.getUser(1L);
  }
}
