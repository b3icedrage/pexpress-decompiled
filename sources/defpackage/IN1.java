package defpackage;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class IN1 {
    public final SocketFactory a;
    public final C5660o8 b;
    public final EnumC5225m40 c;
    public final int d;

    public class a {
        public final CountDownLatch a = new CountDownLatch(1);
        public final int b;

        public a(int i) {
            this.b = i;
        }
    }

    public class b {
        public CountDownLatch a;
        public ArrayList b;
        public Socket c;
        public Exception d;

        public final synchronized void a(c cVar, Socket socket) {
            ArrayList<c> arrayList;
            if (this.a == null || (arrayList = this.b) == null) {
                throw new IllegalStateException("Cannot set socket before awaiting!");
            }
            if (this.c == null) {
                this.c = socket;
                for (c cVar2 : arrayList) {
                    if (cVar2 != cVar) {
                        cVar2.a(new InterruptedException());
                        cVar2.interrupt();
                    }
                }
            } else {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
            this.a.countDown();
        }
    }

    public class c extends Thread {
        public final b d;
        public final SocketFactory e;
        public final InetSocketAddress g;
        public final int h = 15000;
        public final a i;
        public final a j;

        public c(b bVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, a aVar, a aVar2) {
            this.d = bVar;
            this.e = socketFactory;
            this.g = inetSocketAddress;
            this.i = aVar;
            this.j = aVar2;
        }

        public final void a(Exception exc) {
            synchronized (this.d) {
                try {
                    if (this.j.a.getCount() == 0) {
                        return;
                    }
                    b bVar = this.d;
                    synchronized (bVar) {
                        try {
                            CountDownLatch countDownLatch = bVar.a;
                            if (countDownLatch == null || bVar.b == null) {
                                throw new IllegalStateException("Cannot set exception before awaiting!");
                            }
                            if (bVar.d == null) {
                                bVar.d = exc;
                            }
                            countDownLatch.countDown();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.j.a.countDown();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            boolean z;
            Socket socketCreateSocket = null;
            try {
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a.await(aVar.b, TimeUnit.MILLISECONDS);
                }
                b bVar = this.d;
                synchronized (bVar) {
                    z = bVar.c != null;
                }
                if (z) {
                    return;
                }
                socketCreateSocket = this.e.createSocket();
                int i = LB1.a;
                boolean z2 = socketCreateSocket instanceof SSLSocket;
                socketCreateSocket.connect(this.g, this.h);
                synchronized (this.d) {
                    try {
                        if (this.j.a.getCount() == 0) {
                            return;
                        }
                        this.d.a(this, socketCreateSocket);
                        this.j.a.countDown();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                a(e);
                if (socketCreateSocket != null) {
                    try {
                        socketCreateSocket.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    public IN1(SocketFactory socketFactory, C5660o8 c5660o8, EnumC5225m40 enumC5225m40, int i) {
        this.a = socketFactory;
        this.b = c5660o8;
        this.c = enumC5225m40;
        this.d = i;
    }

    public final Socket a(InetAddress[] inetAddressArr) throws Exception {
        b bVar = new b();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i = 0;
        a aVar = null;
        for (InetAddress inetAddress : inetAddressArr) {
            EnumC5225m40 enumC5225m40 = EnumC5225m40.e;
            EnumC5225m40 enumC5225m41 = this.c;
            if ((enumC5225m41 != enumC5225m40 || (inetAddress instanceof Inet4Address)) && (enumC5225m41 != EnumC5225m40.g || (inetAddress instanceof Inet6Address))) {
                int i2 = i + this.d;
                a aVar2 = new a(i2);
                arrayList.add(new c(bVar, this.a, new InetSocketAddress(inetAddress, this.b.b), aVar, aVar2));
                aVar = aVar2;
                i = i2;
            }
        }
        bVar.b = arrayList;
        bVar.a = new CountDownLatch(bVar.b.size());
        Iterator it = bVar.b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).start();
        }
        bVar.a.await();
        Socket socket = bVar.c;
        if (socket != null) {
            return socket;
        }
        Exception exc = bVar.d;
        if (exc != null) {
            throw exc;
        }
        throw new C6193qg2(EnumC5773og2.S, "No viable interface to connect");
    }
}
