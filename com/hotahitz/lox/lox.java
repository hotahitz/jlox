package com.hotahitz.lox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Lox{
  public static void main (string[] args) throws IOException{
    if(args.length >1){
      System.out.println("Usage: jlox [script]");
      System.exit(64);
    }else if (args.length == 1){
      //some code 1
    } else{
      //some code 2
    }
  }
}
