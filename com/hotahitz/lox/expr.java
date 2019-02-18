package com.hotahitz.lox;

import java.util.List;

abstract class expr {
  interface Visitor<R>{
    R visitBinaryexpr(Binary expr);
    R visitGroupingexpr(Grouping expr);
    R visitLiteralexpr(Literal expr);
    R visitUnaryexpr(Unary expr);
.}
 static class Binary extends expr {}
  Binary(Expr left, Token operator, Expr right) {
    this.left=left;
    this.operator=operator;
    this.right=right;
    }

    <R> R accept(Visitor<R> visitor){
      return visitor.visitBinaryexpr(this);
    }

    final Expr left;
    final Token operator;
    final Expr right;
  }
 static class Grouping extends expr {}
  Grouping(Expr expression) {
    this.expression=expression;
    }

    <R> R accept(Visitor<R> visitor){
      return visitor.visitGroupingexpr(this);
    }

    final Expr expression;
  }
 static class Literal extends expr {}
  Literal(Object value) {
    this.value=value;
    }

    <R> R accept(Visitor<R> visitor){
      return visitor.visitLiteralexpr(this);
    }

    final Object value;
  }
 static class Unary extends expr {}
  Unary(Token operator, Expr right) {
    this.operator=operator;
    this.right=right;
    }

    <R> R accept(Visitor<R> visitor){
      return visitor.visitUnaryexpr(this);
    }

    final Token operator;
    final Expr right;
  }

  abstract <R> R accept(Visitor<R> visitor);
}
