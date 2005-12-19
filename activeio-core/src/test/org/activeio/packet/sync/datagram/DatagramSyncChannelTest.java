/**
 *
 * Copyright 2005 (C) The original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activeio.packet.sync.datagram;

import java.io.IOException;
import java.net.URI;

import org.activeio.Channel;
import org.activeio.packet.sync.ConnectionlessSyncChannelTestSupport;
import org.activeio.packet.sync.datagram.DatagramSocketSyncChannelFactory;


/**
 * @version $Revision$
 */
public class DatagramSyncChannelTest extends ConnectionlessSyncChannelTestSupport {

    DatagramSocketSyncChannelFactory factory = new DatagramSocketSyncChannelFactory();

    protected Channel openClientChannel(URI connectURI) throws IOException {
        return factory.openSyncChannel(null);
    }

    protected Channel openServerChannel(URI connectURI) throws IOException {
        return factory.openSyncChannel(null, connectURI);
    }

    protected String getAddress() {
        return "127.0.0.1";
    }
}