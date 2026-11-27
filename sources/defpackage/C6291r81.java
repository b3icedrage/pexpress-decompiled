package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6291r81<T> implements InterfaceC1101Gx<T> {
    public final C0698Bs1 d;
    public final Object[] e;
    public final InterfaceC1023Fx.a g;
    public final WM<AbstractC1091Gt1, T> h;
    public volatile boolean i;

    @GuardedBy("this")
    @Nullable
    public InterfaceC1023Fx j;

    @GuardedBy("this")
    @Nullable
    public Throwable k;

    @GuardedBy("this")
    public boolean l;

    /* JADX INFO: renamed from: r81$a */
    public class a implements InterfaceC1727Ox {
        public final /* synthetic */ InterfaceC1649Nx d;

        public a(InterfaceC1649Nx interfaceC1649Nx) {
            this.d = interfaceC1649Nx;
        }

        @Override // defpackage.InterfaceC1727Ox
        public final void a(InterfaceC1023Fx interfaceC1023Fx, C0857Dt1 c0857Dt1) {
            InterfaceC1649Nx interfaceC1649Nx = this.d;
            C6291r81 c6291r81 = C6291r81.this;
            try {
                try {
                    interfaceC1649Nx.a(c6291r81, c6291r81.e(c0857Dt1));
                } catch (Throwable th) {
                    Dc2.n(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                Dc2.n(th2);
                try {
                    interfaceC1649Nx.b(c6291r81, th2);
                } catch (Throwable th3) {
                    Dc2.n(th3);
                    th3.printStackTrace();
                }
            }
        }

        @Override // defpackage.InterfaceC1727Ox
        public final void b(InterfaceC1023Fx interfaceC1023Fx, IOException iOException) {
            try {
                this.d.b(C6291r81.this, iOException);
            } catch (Throwable th) {
                Dc2.n(th);
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: r81$b */
    public static final class b extends AbstractC1091Gt1 {
        public final AbstractC1091Gt1 e;
        public final C3024bo1 g;

        @Nullable
        public IOException h;

        /* JADX INFO: renamed from: r81$b$a */
        public class a extends AbstractC1521Mh0 {
            public a(InterfaceC2833av interfaceC2833av) {
                super(interfaceC2833av);
            }

            @Override // defpackage.AbstractC1521Mh0, defpackage.UN1
            public final long s0(C1481Lu c1481Lu, long j) throws IOException {
                try {
                    return super.s0(c1481Lu, j);
                } catch (IOException e) {
                    b.this.h = e;
                    throw e;
                }
            }
        }

        public b(AbstractC1091Gt1 abstractC1091Gt1) {
            this.e = abstractC1091Gt1;
            this.g = Cm2.e(new a(abstractC1091Gt1.k()));
        }

        @Override // defpackage.AbstractC1091Gt1, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.e.close();
        }

        @Override // defpackage.AbstractC1091Gt1
        public final long f() {
            return this.e.f();
        }

        @Override // defpackage.AbstractC1091Gt1
        public final CY0 g() {
            return this.e.g();
        }

        @Override // defpackage.AbstractC1091Gt1
        public final InterfaceC2833av k() {
            return this.g;
        }
    }

    /* JADX INFO: renamed from: r81$c */
    public static final class c extends AbstractC1091Gt1 {

        @Nullable
        public final CY0 e;
        public final long g;

        public c(@Nullable CY0 cy0, long j) {
            this.e = cy0;
            this.g = j;
        }

        @Override // defpackage.AbstractC1091Gt1
        public final long f() {
            return this.g;
        }

        @Override // defpackage.AbstractC1091Gt1
        public final CY0 g() {
            return this.e;
        }

        @Override // defpackage.AbstractC1091Gt1
        public final InterfaceC2833av k() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C6291r81(C0698Bs1 c0698Bs1, Object[] objArr, InterfaceC1023Fx.a aVar, WM<AbstractC1091Gt1, T> wm) {
        this.d = c0698Bs1;
        this.e = objArr;
        this.g = aVar;
        this.h = wm;
    }

    @Override // defpackage.InterfaceC1101Gx
    public final void D(InterfaceC1649Nx<T> interfaceC1649Nx) {
        InterfaceC1023Fx interfaceC1023Fx;
        Throwable th;
        synchronized (this) {
            try {
                if (this.l) {
                    throw new IllegalStateException("Already executed.");
                }
                this.l = true;
                interfaceC1023Fx = this.j;
                th = this.k;
                if (interfaceC1023Fx == null && th == null) {
                    try {
                        InterfaceC1023Fx interfaceC1023FxA = a();
                        this.j = interfaceC1023FxA;
                        interfaceC1023Fx = interfaceC1023FxA;
                    } catch (Throwable th2) {
                        th = th2;
                        Dc2.n(th);
                        this.k = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC1649Nx.b(this, th);
            return;
        }
        if (this.i) {
            interfaceC1023Fx.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(interfaceC1023Fx, new a(interfaceC1649Nx));
    }

    public final InterfaceC1023Fx a() {
        C1318Jr0 url;
        C0698Bs1 c0698Bs1 = this.d;
        c0698Bs1.getClass();
        Object[] objArr = this.e;
        int length = objArr.length;
        AbstractC1819Qb1<?>[] abstractC1819Qb1Arr = c0698Bs1.j;
        if (length != abstractC1819Qb1Arr.length) {
            throw new IllegalArgumentException(SK.b(C1332Jw.c(length, "Argument count (", ") doesn't match expected count ("), abstractC1819Qb1Arr.length, ")"));
        }
        C6235qs1 c6235qs1 = new C6235qs1(c0698Bs1.c, c0698Bs1.b, c0698Bs1.d, c0698Bs1.e, c0698Bs1.f, c0698Bs1.g, c0698Bs1.h, c0698Bs1.i);
        if (c0698Bs1.k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            abstractC1819Qb1Arr[i].a(c6235qs1, objArr[i]);
        }
        C1318Jr0.a aVar = c6235qs1.d;
        if (aVar != null) {
            url = aVar.a();
        } else {
            String link = c6235qs1.c;
            C1318Jr0 c1318Jr0 = c6235qs1.b;
            c1318Jr0.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            C1318Jr0.a aVarG = c1318Jr0.g(link);
            url = aVarG != null ? aVarG.a() : null;
            if (url == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c1318Jr0 + ", Relative: " + c6235qs1.c);
            }
        }
        AbstractC5395ms1 aVar2 = c6235qs1.k;
        if (aVar2 == null) {
            C0898Eh0.a aVar3 = c6235qs1.j;
            if (aVar3 != null) {
                aVar2 = new C0898Eh0(aVar3.a, aVar3.b);
            } else {
                M11.a aVar4 = c6235qs1.i;
                if (aVar4 != null) {
                    ArrayList arrayList2 = aVar4.c;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    aVar2 = new M11(aVar4.a, aVar4.b, C6806tc2.y(arrayList2));
                } else if (c6235qs1.h) {
                    byte[] content = new byte[0];
                    Intrinsics.checkNotNullParameter(content, "content");
                    Intrinsics.checkNotNullParameter(content, "content");
                    Intrinsics.checkNotNullParameter(content, "<this>");
                    long j = 0;
                    C6806tc2.c(j, j, j);
                    aVar2 = new C5182ls1(null, 0, content);
                }
            }
        }
        CY0 cy0 = c6235qs1.g;
        C2813ao0.a aVar5 = c6235qs1.f;
        if (cy0 != null) {
            if (aVar2 != null) {
                aVar2 = new C6235qs1.a(aVar2, cy0);
            } else {
                aVar5.a("Content-Type", cy0.a);
            }
        }
        C4543is1.a aVar6 = c6235qs1.e;
        aVar6.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        aVar6.a = url;
        C2813ao0 headers = aVar5.d();
        Intrinsics.checkNotNullParameter(headers, "headers");
        aVar6.c = headers.d();
        aVar6.e(c6235qs1.a, aVar2);
        aVar6.g(YC0.class, new YC0(c0698Bs1.a, arrayList));
        InterfaceC1023Fx interfaceC1023FxA = this.g.a(aVar6.b());
        if (interfaceC1023FxA != null) {
            return interfaceC1023FxA;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final C0935Et1<T> b() {
        InterfaceC1023Fx interfaceC1023FxD;
        synchronized (this) {
            if (this.l) {
                throw new IllegalStateException("Already executed.");
            }
            this.l = true;
            interfaceC1023FxD = d();
        }
        if (this.i) {
            interfaceC1023FxD.cancel();
        }
        return e(FirebasePerfOkHttpClient.execute(interfaceC1023FxD));
    }

    @Override // defpackage.InterfaceC1101Gx
    public final void cancel() {
        InterfaceC1023Fx interfaceC1023Fx;
        this.i = true;
        synchronized (this) {
            interfaceC1023Fx = this.j;
        }
        if (interfaceC1023Fx != null) {
            interfaceC1023Fx.cancel();
        }
    }

    public final Object clone() {
        return new C6291r81(this.d, this.e, this.g, this.h);
    }

    @GuardedBy("this")
    public final InterfaceC1023Fx d() throws IOException {
        InterfaceC1023Fx interfaceC1023Fx = this.j;
        if (interfaceC1023Fx != null) {
            return interfaceC1023Fx;
        }
        Throwable th = this.k;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC1023Fx interfaceC1023FxA = a();
            this.j = interfaceC1023FxA;
            return interfaceC1023FxA;
        } catch (IOException | Error | RuntimeException e) {
            Dc2.n(e);
            this.k = e;
            throw e;
        }
    }

    public final C0935Et1<T> e(C0857Dt1 c0857Dt1) throws IOException {
        AbstractC1091Gt1 abstractC1091Gt1 = c0857Dt1.k;
        C0857Dt1.a aVarK = c0857Dt1.k();
        aVarK.g = new c(abstractC1091Gt1.g(), abstractC1091Gt1.f());
        C0857Dt1 c0857Dt1A = aVarK.a();
        int i = c0857Dt1A.h;
        if (i < 200 || i >= 300) {
            try {
                C1169Ht1 c1169Ht1A = Dc2.a(abstractC1091Gt1);
                if (c0857Dt1A.g()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                C0935Et1<T> c0935Et1 = new C0935Et1<>(c0857Dt1A, null, c1169Ht1A);
                abstractC1091Gt1.close();
                return c0935Et1;
            } catch (Throwable th) {
                abstractC1091Gt1.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            abstractC1091Gt1.close();
            return C0935Et1.a(null, c0857Dt1A);
        }
        b bVar = new b(abstractC1091Gt1);
        try {
            return C0935Et1.a(this.h.a(bVar), c0857Dt1A);
        } catch (RuntimeException e) {
            IOException iOException = bVar.h;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // defpackage.InterfaceC1101Gx
    /* JADX INFO: renamed from: f */
    public final InterfaceC1101Gx clone() {
        return new C6291r81(this.d, this.e, this.g, this.h);
    }

    @Override // defpackage.InterfaceC1101Gx
    public final boolean q() {
        boolean z = true;
        if (this.i) {
            return true;
        }
        synchronized (this) {
            try {
                InterfaceC1023Fx interfaceC1023Fx = this.j;
                if (interfaceC1023Fx == null || !interfaceC1023Fx.q()) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC1101Gx
    public final synchronized C4543is1 u() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return d().u();
    }
}
