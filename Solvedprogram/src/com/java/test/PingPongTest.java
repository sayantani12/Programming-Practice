package com.java.test;

import org.testng.annotations.Test;

import com.java.main.PingPong;

public class PingPongTest {
  @Test
  public void testping() {
	 PingPong.pingpong(3);
  }
}
