# UULogger
#### 主要用于输出Log信息,由于应用中输出的日志信息太多,debug的时候并不能快速定位到方法以及Log输出的行数,同时正式发布版本不应该有Log输出,故在该类中设置统一关闭Log的标志,并输出日志所在的方法,函数,类名.
*****

###测试代码及使用方式：      
		UULogger.log("fun log");
		UULogger.log("test", "fun log tag");
		UULogger.log(null, "fun log tag");
		UULogger.log(null,null);
		UULogger.log("test", null);
		
		UULogger.v("fun v");
		UULogger.v("test", "fun v tag");
		UULogger.v(null, "fun v tag");
		UULogger.v(null,null);
		UULogger.v("test", null);
		
		UULogger.d("fun d");
		UULogger.d("test", "fun d tag");
		UULogger.d(null, "fun d tag");
		UULogger.d(null,null);
		UULogger.d("test", null);

		UULogger.i("fun i");
		UULogger.i("test", "fun i tag");
		UULogger.i(null, "fun i tag");
		UULogger.i(null,null);
		UULogger.i("test", null);

		UULogger.w("fun w");
		UULogger.w("test", "fun w tag");
		UULogger.w(null, "fun w tag");
		UULogger.w(null,null);
		UULogger.w("test", null);

		UULogger.e("fun e");
		UULogger.e("test", "fun e tag");
		UULogger.e(null, "fun e tag");
		UULogger.e(null,null);
		UULogger.e("test", null);
*****

### 结果：
![all result](/Users/Kings/Documents/资料/uulogger.png)

### 使用方式：
#### 该类为工具类，不需要初始化，直接使用静态方法即可。
#### UULogger.log() 默认为使用i级别输出
#### 其他方法与log相同
#### 默认的TAG为"UULog Debuger"