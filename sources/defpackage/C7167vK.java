package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: vK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7167vK<E> extends O92<Object> {
    public C3141cO0 n;
    public OutputStream p;
    public final ReentrantLock o = new ReentrantLock(false);
    public final boolean q = true;
    public final EnumC7798yK r = EnumC7798yK.SystemOut;

    @Override // defpackage.O92
    public final void q(QS0 qs0) {
        boolean z = this.h;
        if (z && z) {
            try {
                qs0.j();
                u(this.n.h.q(qs0).getBytes());
            } catch (IOException e) {
                this.h = false;
                o(new N70("IO failure in appender", e, 2, this));
            }
        }
    }

    public final void r() {
        if (this.p != null) {
            try {
                s();
                this.p.close();
                this.p = null;
            } catch (IOException e) {
                o(new N70("Could not close output stream for OutputStreamAppender.", e, 2, this));
            }
        }
    }

    public final void s() {
        byte[] bytes;
        C3141cO0 c3141cO0 = this.n;
        if (c3141cO0 == null || this.p == null) {
            return;
        }
        try {
            AbstractC2932bO0 abstractC2932bO0 = c3141cO0.h;
            if (abstractC2932bO0 == null) {
                bytes = null;
            } else {
                abstractC2932bO0.getClass();
                bytes = "".getBytes();
            }
            u(bytes);
        } catch (IOException e) {
            this.h = false;
            o(new N70(C5807oq.b(new StringBuilder("Failed to write footer for appender named ["), this.j, "]."), e, 2, this));
        }
    }

    @Override // defpackage.O92, defpackage.InterfaceC7183vP0
    public final void start() {
        int i;
        OutputStream outputStream = this.r.e;
        System.getProperty("os.name").startsWith("Windows");
        ReentrantLock reentrantLock = this.o;
        reentrantLock.lock();
        try {
            r();
            this.p = outputStream;
            if (this.n == null) {
                p("Encoder has not been set. Cannot invoke its init method.");
            } else {
                t();
            }
            reentrantLock.unlock();
            if (this.n == null) {
                o(new N70(C5807oq.b(new StringBuilder("No encoder set for the appender named \""), this.j, "\"."), this));
                i = 1;
            } else {
                i = 0;
            }
            if (this.p == null) {
                o(new N70(C5807oq.b(new StringBuilder("No output stream set for the appender named \""), this.j, "\"."), this));
                i++;
            }
            if (i == 0) {
                this.h = true;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.O92, defpackage.InterfaceC7183vP0
    public final void stop() {
        ReentrantLock reentrantLock = this.o;
        reentrantLock.lock();
        try {
            r();
            this.h = false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void t() {
        byte[] bytes;
        C3141cO0 c3141cO0 = this.n;
        if (c3141cO0 == null || this.p == null) {
            return;
        }
        try {
            if (c3141cO0.h == null) {
                bytes = null;
            } else {
                StringBuilder sb = new StringBuilder();
                c3141cO0.h.getClass();
                String strR = c3141cO0.h.r();
                if (strR != null) {
                    sb.append(strR);
                }
                if (sb.length() > 0) {
                    sb.append(C3766fN.a);
                }
                bytes = sb.toString().getBytes();
            }
            u(bytes);
        } catch (IOException e) {
            this.h = false;
            o(new N70(C5807oq.b(new StringBuilder("Failed to initialize encoder for appender named ["), this.j, "]."), e, 2, this));
        }
    }

    public final void u(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        ReentrantLock reentrantLock = this.o;
        reentrantLock.lock();
        try {
            this.p.write(bArr);
            if (this.q) {
                this.p.flush();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
