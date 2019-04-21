package com.junhua.hadoop.demo.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/30 9:23 AM
 */
public class TokenizerMapper extends Mapper<Object, Text, Text, IntWritable> {

  public static final IntWritable one = new IntWritable(1);
  private Text word = new Text();

  @Override
  public void map(Object key, Text value, Context context)
          throws IOException, InterruptedException {
    StringTokenizer itr = new StringTokenizer(value.toString());
    while (itr.hasMoreTokens()) {
      this.word.set(itr.nextToken());
      context.write(this.word, one);
    }
  }

}
