package com.junhua.hadoop.demo;

import ch.qos.logback.core.util.FileUtil;
import com.junhua.hadoop.demo.mapper.TokenizerMapper;
import com.junhua.hadoop.demo.reducer.IntSumReducer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * @author Junhua E-mail:xjhclks@163.com
 * @version create time：2018/11/30 8:45 AM
 */
public class WordCount {

  public static void main(String[] args)
          throws IOException, ClassNotFoundException, InterruptedException {

//    FileUtil.deleteDir("output");
    Configuration conf = new Configuration();
    Job job = Job.getInstance(conf, "word count");
    job.setJarByClass(WordCount.class);

    job.setMapperClass(TokenizerMapper.class);
    job.setCombinerClass(IntSumReducer.class);
    job.setReducerClass(IntSumReducer.class);

    // 这里Mapper的输出和Reducer的输出相同，所以只用指定一个就可以了。如果不同，需要另外指定Mapper的输出类型
    //    job.setMapOutputKeyClass(Text.class);
    //    job.setMapOutputValueClass(IntWritable.class);
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(IntWritable.class);

    FileInputFormat.addInputPath(job, new Path(args[0]));
    FileOutputFormat.setOutputPath(job, new Path(args[1]));

    System.exit(job.waitForCompletion(true) ? 0 : 1);
  }

}
