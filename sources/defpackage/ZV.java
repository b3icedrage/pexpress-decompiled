package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.Callable;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class ZV implements Callable {
    public final InetAddress d;
    public final int e;
    public final C1671Oe0 g;
    public DN1 h;
    public SocketFactory i;

    public static class a implements DN1 {
        @Override // defpackage.DN1
        public final void c(IOException iOException) {
            System.out.println(iOException);
        }
    }

    public ZV(InetAddress inetAddress, int i, long j, long j2) {
        C1671Oe0 c1671Oe0 = new C1671Oe0(j, j2);
        this.d = inetAddress;
        this.e = i;
        this.g = c1671Oe0;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Socket call() throws InterruptedException {
        Socket socketCreateSocket;
        int i = this.e;
        InetAddress inetAddress = this.d;
        if (this.h == null) {
            this.h = new a();
        }
        if (this.i == null) {
            this.i = SocketFactory.getDefault();
        }
        try {
            socketCreateSocket = this.i.createSocket(inetAddress, i);
        } catch (IOException e) {
            this.h.c(e);
            socketCreateSocket = null;
        }
        while (socketCreateSocket == null && !Thread.currentThread().isInterrupted()) {
            C1671Oe0 c1671Oe0 = this.g;
            long j = c1671Oe0.b;
            c1671Oe0.b = c1671Oe0.a;
            Thread.sleep(j);
            try {
                socketCreateSocket = this.i.createSocket(inetAddress, i);
            } catch (IOException e2) {
                this.h.c(e2);
                socketCreateSocket = null;
            }
        }
        return socketCreateSocket;
    }
}
