package org.junhua;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.junhua.service.HelloServiceImpl;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new HelloServiceImpl()).build();

        System.out.println("server is starting");
        server.start();
        System.out.println("server started");
        server.awaitTermination();

    }

}
