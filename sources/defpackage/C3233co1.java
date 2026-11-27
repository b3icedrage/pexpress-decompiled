package defpackage;

import io.sentry.okhttp.h;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: co1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3233co1 implements InterfaceC1023Fx {

    @NotNull
    public final C6711t81 d;

    @NotNull
    public final C4543is1 e;
    public final boolean g;

    @NotNull
    public final C4282ho1 h;

    @NotNull
    public final AbstractC7971z80 i;

    @NotNull
    public final c j;

    @NotNull
    public final AtomicBoolean k;

    @Nullable
    public Object l;

    @Nullable
    public M90 m;

    @Nullable
    public C3442do1 n;
    public boolean o;

    @Nullable
    public K90 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public volatile boolean t;

    @Nullable
    public volatile K90 u;

    @Nullable
    public volatile C3442do1 v;

    /* JADX INFO: renamed from: co1$a */
    public final class a implements Runnable {

        @NotNull
        public final InterfaceC1727Ox d;

        @NotNull
        public volatile AtomicInteger e;
        public final /* synthetic */ C3233co1 g;

        public a(@NotNull C3233co1 c3233co1, InterfaceC1727Ox responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.g = c3233co1;
            this.d = responseCallback;
            this.e = new AtomicInteger(0);
        }

        @Override // java.lang.Runnable
        public final void run() {
            C5847p20 c5847p20;
            String str = "OkHttp " + this.g.e.a.h();
            C3233co1 c3233co1 = this.g;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                c3233co1.j.i();
                boolean z = false;
                try {
                    try {
                        try {
                            this.d.a(c3233co1, c3233co1.g());
                            c5847p20 = c3233co1.d.d;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                C1903Rd1 c1903Rd1 = C1903Rd1.a;
                                C1903Rd1 c1903Rd2 = C1903Rd1.a;
                                String str2 = "Callback failure for " + C3233co1.a(c3233co1);
                                c1903Rd2.getClass();
                                C1903Rd1.i(4, str2, e);
                            } else {
                                this.d.b(c3233co1, e);
                            }
                            c5847p20 = c3233co1.d.d;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            c3233co1.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                J90.a(iOException, th);
                                this.d.b(c3233co1, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c3233co1.d.d.c(this);
                        throw th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
                c5847p20.c(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th4) {
                threadCurrentThread.setName(name);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: co1$b */
    public static final class b extends WeakReference<C3233co1> {

        @Nullable
        public final Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C3233co1 referent, @Nullable Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.a = obj;
        }
    }

    /* JADX INFO: renamed from: co1$c */
    public static final class c extends C7255vk {
        public c() {
        }

        @Override // defpackage.C7255vk
        public final void k() {
            C3233co1.this.cancel();
        }
    }

    public C3233co1(@NotNull C6711t81 client, @NotNull C4543is1 originalRequest, boolean z) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.d = client;
        this.e = originalRequest;
        this.g = z;
        this.h = client.e.a;
        AbstractC7971z80 this_asFactory = (AbstractC7971z80) client.i.d;
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(this, "it");
        this.i = this_asFactory;
        c cVar = new c();
        cVar.g(0, TimeUnit.MILLISECONDS);
        this.j = cVar;
        this.k = new AtomicBoolean();
        this.s = true;
    }

    public static final String a(C3233co1 c3233co1) {
        StringBuilder sb = new StringBuilder();
        sb.append(c3233co1.t ? "canceled " : "");
        sb.append(c3233co1.g ? "web socket" : "call");
        sb.append(" to ");
        sb.append(c3233co1.e.a.h());
        return sb.toString();
    }

    @Override // defpackage.InterfaceC1023Fx
    public final void Z(@NotNull InterfaceC1727Ox responseCallback) {
        a other;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.k.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        C1903Rd1 c1903Rd1 = C1903Rd1.a;
        this.l = C1903Rd1.a.g();
        this.i.f(this);
        C5847p20 c5847p20 = this.d.d;
        a call = new a(this, responseCallback);
        c5847p20.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (c5847p20) {
            c5847p20.b.add(call);
            if (!this.g) {
                String str = this.e.a.d;
                Iterator<a> it = c5847p20.c.iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator<a> it2 = c5847p20.b.iterator();
                        do {
                            if (!it2.hasNext()) {
                                other = null;
                                break;
                            }
                            other = it2.next();
                        } while (!Intrinsics.a(other.g.e.a.d, str));
                    } else {
                        other = it.next();
                    }
                } while (!Intrinsics.a(other.g.e.a.d, str));
                if (other != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    call.e = other.e;
                }
            }
            Unit unit = Unit.a;
        }
        c5847p20.d();
    }

    public final void b(@NotNull C3442do1 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = C6806tc2.a;
        if (this.n != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.n = connection;
        connection.p.add(new b(this, this.l));
    }

    @Override // defpackage.InterfaceC1023Fx
    @NotNull
    public final C0857Dt1 c() {
        if (!this.k.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.j.i();
        C1903Rd1 c1903Rd1 = C1903Rd1.a;
        this.l = C1903Rd1.a.g();
        this.i.f(this);
        try {
            C5847p20 c5847p20 = this.d.d;
            synchronized (c5847p20) {
                Intrinsics.checkNotNullParameter(this, "call");
                c5847p20.d.add(this);
            }
            C0857Dt1 c0857Dt1G = g();
            C5847p20 c5847p21 = this.d.d;
            c5847p21.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            c5847p21.b(c5847p21.d, this);
            return c0857Dt1G;
        } catch (Throwable th) {
            C5847p20 c5847p22 = this.d.d;
            c5847p22.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            c5847p22.b(c5847p22.d, this);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1023Fx
    public final void cancel() {
        Socket socket;
        if (this.t) {
            return;
        }
        this.t = true;
        K90 k90 = this.u;
        if (k90 != null) {
            k90.d.cancel();
        }
        C3442do1 c3442do1 = this.v;
        if (c3442do1 != null && (socket = c3442do1.c) != null) {
            C6806tc2.e(socket);
        }
        this.i.g(this);
    }

    public final Object clone() {
        return new C3233co1(this.d, this.e, this.g);
    }

    public final <E extends IOException> E d(E e) {
        E interruptedIOException;
        Socket socketJ;
        byte[] bArr = C6806tc2.a;
        C3442do1 c3442do1 = this.n;
        if (c3442do1 != null) {
            synchronized (c3442do1) {
                socketJ = j();
            }
            if (this.n == null) {
                if (socketJ != null) {
                    C6806tc2.e(socketJ);
                }
                this.i.l(this, c3442do1);
            } else if (socketJ != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.o && this.j.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e != null) {
                interruptedIOException.initCause(e);
            }
        } else {
            interruptedIOException = e;
        }
        if (e == null) {
            this.i.d(this);
            return interruptedIOException;
        }
        AbstractC7971z80 abstractC7971z80 = this.i;
        Intrinsics.checkNotNull(interruptedIOException);
        abstractC7971z80.e(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void e(boolean z) {
        K90 k90;
        synchronized (this) {
            if (!this.s) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.a;
        }
        if (z && (k90 = this.u) != null) {
            k90.d.cancel();
            k90.a.h(k90, true, true, null);
        }
        this.p = null;
    }

    @NotNull
    public final C0857Dt1 g() {
        Object next;
        ArrayList arrayList = new ArrayList();
        C2904bF.o(arrayList, this.d.g);
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((UB0) next) instanceof h));
        if (next == null) {
            SD1 scopes = SD1.a;
            Intrinsics.checkNotNullExpressionValue(scopes, "getInstance(...)");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            arrayList.add(new h(null, null, null, 28));
        }
        arrayList.add(new C2345Wt1(this.d));
        arrayList.add(new C1092Gu(this.d.n));
        arrayList.add(new C4775jx(this.d.o));
        arrayList.add(C5905pJ.a);
        if (!this.g) {
            C2904bF.o(arrayList, this.d.h);
        }
        arrayList.add(new C1257Ix(this.g));
        C4543is1 c4543is1 = this.e;
        C6711t81 c6711t81 = this.d;
        try {
            try {
                C0857Dt1 c0857Dt1B = new C5593no1(this, arrayList, 0, null, c4543is1, c6711t81.A, c6711t81.B, c6711t81.C).b(this.e);
                if (this.t) {
                    C6806tc2.d(c0857Dt1B);
                    throw new IOException("Canceled");
                }
                i(null);
                return c0857Dt1B;
            } catch (IOException e) {
                IOException iOExceptionI = i(e);
                Intrinsics.c(iOExceptionI, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionI;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001c), top: B:54:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001c), top: B:54:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final <E extends IOException> E h(@NotNull K90 exchange, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.a(exchange, this.u)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (this.q) {
                            if (z) {
                                this.q = false;
                            }
                            if (z2) {
                                this.r = false;
                            }
                            z5 = this.q;
                            if (z5) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        } else if (z2 || !this.r) {
                            z4 = false;
                        } else {
                            if (z) {
                                this.q = false;
                            }
                            if (z2) {
                                this.r = false;
                            }
                            z5 = this.q;
                            if (z5 || this.r) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z5 && !this.r && !this.s) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                    Unit unit2 = Unit.a;
                }
            }
            if (z3) {
                this.u = null;
                C3442do1 c3442do1 = this.n;
                if (c3442do1 != null) {
                    synchronized (c3442do1) {
                        c3442do1.m++;
                    }
                }
            }
            if (z4) {
                return (E) d(e);
            }
        }
        return e;
    }

    @Nullable
    public final IOException i(@Nullable IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.s) {
                    this.s = false;
                    if (!this.q && !this.r) {
                        z = true;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? d(iOException) : iOException;
    }

    @Nullable
    public final Socket j() {
        C3442do1 connection = this.n;
        Intrinsics.checkNotNull(connection);
        byte[] bArr = C6806tc2.a;
        ArrayList arrayList = connection.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.n = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        connection.q = System.nanoTime();
        C4282ho1 c4282ho1 = this.h;
        c4282ho1.getClass();
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr2 = C6806tc2.a;
        boolean z = connection.j;
        C7839yX1 c7839yX1 = c4282ho1.b;
        if (!z) {
            c7839yX1.c(c4282ho1.c, 0L);
            return null;
        }
        connection.j = true;
        ConcurrentLinkedQueue<C3442do1> concurrentLinkedQueue = c4282ho1.d;
        concurrentLinkedQueue.remove(connection);
        if (concurrentLinkedQueue.isEmpty()) {
            c7839yX1.a();
        }
        Socket socket = connection.d;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    @Override // defpackage.InterfaceC1023Fx
    public final boolean q() {
        return this.t;
    }

    @Override // defpackage.InterfaceC1023Fx
    @NotNull
    public final C4543is1 u() {
        return this.e;
    }
}
