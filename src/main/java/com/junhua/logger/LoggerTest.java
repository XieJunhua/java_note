package com.junhua.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * Created by xiejunhua on 2018/4/3.
 */
public class LoggerTest {
  private static Logger logger = LoggerFactory.getLogger(LoggerTest.class);
  public static void main(String[] args) {
    Marker marker = MarkerFactory.getMarker("CONFIG");
    SampleTurboFilter sampleTurboFilter = new SampleTurboFilter();
    logger.info(marker, "from marker");
    logger.info("ddd");

  }
}
