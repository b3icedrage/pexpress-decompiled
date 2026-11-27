package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* JADX INFO: renamed from: k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4789k1<E> extends AbstractC0666Bi<E> implements DN1 {
    public volatile Socket A;
    public final C3476e n;
    public final C6772tS0 o;
    public String p;
    public int q;
    public InetAddress r;
    public final O40 s;
    public final int t;
    public final int u;
    public final O40 v;
    public LinkedBlockingDeque w;
    public String x;
    public ZV y;
    public Future<?> z;

    /* JADX INFO: renamed from: k1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC4789k1 abstractC4789k1 = AbstractC4789k1.this;
            abstractC4789k1.getClass();
            while (true) {
                try {
                    Socket socketCall = abstractC4789k1.y.call();
                    abstractC4789k1.A = socketCall;
                    if (socketCall == null) {
                        break;
                    }
                    try {
                        C8108zn c8108znR = abstractC4789k1.r();
                        abstractC4789k1.n(abstractC4789k1.x + "connection established");
                        abstractC4789k1.s(c8108znR);
                        throw null;
                    } catch (IOException e) {
                        try {
                            abstractC4789k1.n(abstractC4789k1.x + "connection failed: " + e);
                            Socket socket = abstractC4789k1.A;
                            if (socket != null) {
                                try {
                                    socket.close();
                                } catch (IOException unused) {
                                }
                            }
                            abstractC4789k1.A = null;
                            abstractC4789k1.n(abstractC4789k1.x + "connection closed");
                        } catch (Throwable th) {
                            Socket socket2 = abstractC4789k1.A;
                            if (socket2 != null) {
                                try {
                                    socket2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            abstractC4789k1.A = null;
                            abstractC4789k1.n(abstractC4789k1.x + "connection closed");
                            throw th;
                        }
                    }
                } catch (InterruptedException unused3) {
                }
            }
            abstractC4789k1.n("shutting down");
        }
    }

    public AbstractC4789k1() {
        C6772tS0 c6772tS0 = new C6772tS0();
        C3476e c3476e = new C3476e();
        this.q = 4560;
        this.s = new O40(30000L);
        this.t = UserVerificationMethods.USER_VERIFY_PATTERN;
        this.u = 5000;
        this.v = new O40(100L);
        this.n = c3476e;
        this.o = c6772tS0;
    }

    @Override // defpackage.DN1
    public final void c(IOException iOException) {
        if (iOException instanceof ConnectException) {
            n(this.x + "connection refused");
            return;
        }
        n(this.x + iOException);
    }

    @Override // defpackage.AbstractC0666Bi
    public final void q(QS0 qs0) {
        if (this.h) {
            try {
                if (this.w.offer(qs0, this.v.a, TimeUnit.MILLISECONDS)) {
                    return;
                }
                n("Dropping event due to timeout limit of [" + this.v + "] being exceeded");
            } catch (InterruptedException e) {
                m("Interrupted while appending event to SocketAppender", e);
            }
        }
    }

    public final C8108zn r() throws IOException {
        this.A.setSoTimeout(this.u);
        C3476e c3476e = this.n;
        OutputStream outputStream = this.A.getOutputStream();
        c3476e.getClass();
        C8108zn c8108zn = new C8108zn(new ObjectOutputStream(outputStream));
        this.A.setSoTimeout(0);
        return c8108zn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(C8108zn c8108zn) throws InterruptedException, IOException {
        RS0 rs0;
        while (true) {
            Object objTakeFirst = this.w.takeFirst();
            InterfaceC6237qt0 interfaceC6237qt0 = (InterfaceC6237qt0) objTakeFirst;
            if (((C8019zN1) this).B) {
                interfaceC6237qt0.a();
            }
            if (interfaceC6237qt0 == null) {
                rs0 = null;
            } else if (interfaceC6237qt0 instanceof QS0) {
                rs0 = new RS0();
                rs0.e = interfaceC6237qt0.c();
                rs0.g = interfaceC6237qt0.f();
                rs0.d = interfaceC6237qt0.l();
                rs0.h = interfaceC6237qt0.getLevel();
                rs0.i = interfaceC6237qt0.getMessage();
                rs0.k = interfaceC6237qt0.e();
                rs0.n = interfaceC6237qt0.g();
                rs0.o = interfaceC6237qt0.k();
                rs0.p = interfaceC6237qt0.b();
                rs0.l = RY1.e(interfaceC6237qt0.h());
                if (interfaceC6237qt0.i()) {
                    rs0.m = interfaceC6237qt0.a();
                }
            } else {
                if (!(interfaceC6237qt0 instanceof RS0)) {
                    throw new IllegalArgumentException("Unsupported type ".concat(interfaceC6237qt0.getClass().getName()));
                }
                rs0 = (RS0) interfaceC6237qt0;
            }
            try {
                ObjectOutputStream objectOutputStream = c8108zn.a;
                objectOutputStream.writeObject(rs0);
                objectOutputStream.flush();
                int i = c8108zn.b + 1;
                c8108zn.b = i;
                if (i >= 70) {
                    objectOutputStream.reset();
                    c8108zn.b = 0;
                }
            } catch (IOException e) {
                if (!this.w.offerFirst(objTakeFirst)) {
                    n("Dropping event due to socket connection error and maxed out deque capacity");
                }
                throw e;
            }
        }
    }

    @Override // defpackage.AbstractC0666Bi, defpackage.InterfaceC7183vP0
    public final void start() {
        int i;
        ScheduledExecutorService scheduledExecutorServiceH;
        if (this.h) {
            return;
        }
        if (this.q <= 0) {
            l("No port was configured for appender" + this.j + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_port");
            i = 1;
        } else {
            i = 0;
        }
        if (this.p == null) {
            i++;
            l("No remote host was configured for appender" + this.j + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_host");
        }
        if (this.t == 0) {
            p("Queue size of zero is deprecated, use a size of one to indicate synchronous processing");
        }
        if (this.t < 0) {
            i++;
            l("Queue size must be greater than zero");
        }
        if (i == 0) {
            try {
                this.r = InetAddress.getByName(this.p);
            } catch (UnknownHostException unused) {
                l("unknown host: " + this.p);
                i++;
            }
        }
        if (i == 0) {
            C6772tS0 c6772tS0 = this.o;
            int i2 = this.t;
            c6772tS0.getClass();
            if (i2 < 1) {
                i2 = 1;
            }
            this.w = new LinkedBlockingDeque(i2);
            StringBuilder sb = new StringBuilder("remote peer ");
            sb.append(this.p);
            sb.append(":");
            this.x = SK.b(sb, this.q, ": ");
            ZV zv = new ZV(this.r, this.q, 0, this.s.a);
            zv.h = this;
            zv.i = SocketFactory.getDefault();
            this.y = zv;
            HS0 hs0 = this.e;
            synchronized (hs0) {
                scheduledExecutorServiceH = hs0.h();
            }
            this.z = ((ScheduledThreadPoolExecutor) scheduledExecutorServiceH).submit(new a());
            this.h = true;
        }
    }

    @Override // defpackage.AbstractC0666Bi, defpackage.InterfaceC7183vP0
    public final void stop() {
        if (this.h) {
            Socket socket = this.A;
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
            this.z.cancel(true);
            this.h = false;
        }
    }
}
