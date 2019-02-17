package com.hotahitz.lox;

import java.util.List;

abstract class expr {
 static class Binary extends expr {}
  Binary(Expr left, Token operator, Expr right) {
    this.left=left;
    this.operator=operator;
    this.right=right;
    }

    final Expr left;
    final Token operator;
    final Expr right;
  }
 static class Grouping extends expr {}
  Grouping(Expr expression) {
    this.expression=expression;
    }

    final Expr expression;
  }
 static class Literal extends expr {}
  Literal(Object value) {
    this.value=value;
    }

    final Object value;
  }
 static class Unary extends expr {}
  Unary(Token operator, Expr right) {
    this.operator=operator;
    this.right=right;
    }

    final Token operator;
    final Expr right;
  }
}
