// MongoOptions.java

/**
 *      Copyright (C) 2008 10gen Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.mongodb;

/**
 * Various settings for the driver
 */
public class MongoOptions {

    public MongoOptions(){
        reset();
    }

    public void reset(){
        connectionsPerHost = Bytes.CONNECTIONS_PER_HOST;
        threadsAllowedToBlockForConnectionMultiplier = 5;
        connectTimeout = 0;
        socketTimeout = 0;
        autoConnectRetry = false;
    }

    /**
       number of connections allowed per host
       will block if run out
     */
    public int connectionsPerHost;

    /**
       multiplier for connectionsPerHost for # of threads that can block
       if connectionsPerHost is 10, and threadsAllowedToBlockForConnectionMultiplier is 5, 
       then 50 threads can block
       more than that and an exception will be throw
     */
    public int threadsAllowedToBlockForConnectionMultiplier;

    /**
       connect timeout in milliseconds. 0 is default and infinite
     */
    public int connectTimeout;

    /**
       socket timeout.  0 is default and infinite
     */
    public int socketTimeout;
    
    /**
       this controls whether or not on a connect, the system retries automatically 
    */
    public boolean autoConnectRetry;
}
