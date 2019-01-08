# RPC Benchmark

This project focuses on benchmarking and profiling RPC framework with the combination of different serialization and transporter options. The code and the idea behinds it is inspired by [RPC Benchmark](https://github.com/hank-whu/rpc-benchmark). 

## How To Run Benchmark

Clone this project onto your desktop, then

* Start the target server first, for example:
```bash
./benchmark.sh dubbo-benchmark/dubbo-kryo-server
```

* Start the corresponding client, for example:
```bash
./benchmark.sh dubbo-benchmark/dubbo-kryo-client
```

## How to Run Profiling

* Start the target server in profiling mode, for example:
```bash
./benchmark.sh -m profiling dubbo-benchmark/dubbo-kryo-server
```

* Start the corresponding client, for example:
```bash
./benchmark.sh dubbo-benchmark/dubbo-kryo-client
```

## Specify hostname, port and output file for service

```bash
./benchmark.sh -s [hostname|ip address] -p port -f output 
```

## Specify benchmark options

并发32，预热3次，每次10s，正式测试3次，每次10s, 以上流程，测试2轮，结果输出到 jmh.dat
也就是执行一次耗费 （3*10 + 3*10）* 2 = 120s

> 对client生效
  
```bash
./benchmark.sh -c 32 -i 3 -t 10 -I 3 -T 10 -F 2 -p 8088 -f jmh.json dubbo-benchmark/dubbo-kryo-client
```