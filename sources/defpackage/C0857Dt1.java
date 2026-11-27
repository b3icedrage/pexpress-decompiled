package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Dt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0857Dt1 implements Closeable {

    @NotNull
    public final C4543is1 d;

    @NotNull
    public final EnumC1298Jk1 e;

    @NotNull
    public final String g;
    public final int h;

    @Nullable
    public final C0916En0 i;

    @NotNull
    public final C2813ao0 j;

    @Nullable
    public final AbstractC1091Gt1 k;

    @Nullable
    public final C0857Dt1 l;

    @Nullable
    public final C0857Dt1 m;

    @Nullable
    public final C0857Dt1 n;
    public final long o;
    public final long p;

    @Nullable
    public final K90 q;

    @Nullable
    public C4307hx r;

    /* JADX INFO: renamed from: Dt1$a */
    public static class a {

        @Nullable
        public C4543is1 a;

        @Nullable
        public EnumC1298Jk1 b;

        @Nullable
        public String d;

        @Nullable
        public C0916En0 e;

        @Nullable
        public AbstractC1091Gt1 g;

        @Nullable
        public C0857Dt1 h;

        @Nullable
        public C0857Dt1 i;

        @Nullable
        public C0857Dt1 j;
        public long k;
        public long l;

        @Nullable
        public K90 m;
        public int c = -1;

        @NotNull
        public C2813ao0.a f = new C2813ao0.a();

        public static void b(C0857Dt1 c0857Dt1, String str) {
            if (c0857Dt1 != null) {
                if (c0857Dt1.k != null) {
                    throw new IllegalArgumentException(str.concat(".body != null").toString());
                }
                if (c0857Dt1.l != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (c0857Dt1.m != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (c0857Dt1.n != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        @NotNull
        public final C0857Dt1 a() {
            int i = this.c;
            if (i < 0) {
                throw new IllegalStateException(("code < 0: " + this.c).toString());
            }
            C4543is1 c4543is1 = this.a;
            if (c4543is1 == null) {
                throw new IllegalStateException("request == null");
            }
            EnumC1298Jk1 enumC1298Jk1 = this.b;
            if (enumC1298Jk1 == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.d;
            if (str != null) {
                return new C0857Dt1(c4543is1, enumC1298Jk1, str, i, this.e, this.f.d(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            }
            throw new IllegalStateException("message == null");
        }

        @NotNull
        public final void c(@NotNull C2813ao0 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f = headers.d();
        }
    }

    public C0857Dt1(@NotNull C4543is1 request, @NotNull EnumC1298Jk1 protocol, @NotNull String message, int i, @Nullable C0916En0 c0916En0, @NotNull C2813ao0 headers, @Nullable AbstractC1091Gt1 abstractC1091Gt1, @Nullable C0857Dt1 c0857Dt1, @Nullable C0857Dt1 c0857Dt2, @Nullable C0857Dt1 c0857Dt3, long j, long j2, @Nullable K90 k90) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.d = request;
        this.e = protocol;
        this.g = message;
        this.h = i;
        this.i = c0916En0;
        this.j = headers;
        this.k = abstractC1091Gt1;
        this.l = c0857Dt1;
        this.m = c0857Dt2;
        this.n = c0857Dt3;
        this.o = j;
        this.p = j2;
        this.q = k90;
    }

    public static String f(C0857Dt1 c0857Dt1, String name) {
        c0857Dt1.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String strB = c0857Dt1.j.b(name);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    @NotNull
    public final C4307hx c() {
        C4307hx c4307hx = this.r;
        if (c4307hx != null) {
            return c4307hx;
        }
        C4307hx c4307hx2 = C4307hx.n;
        C4307hx c4307hxA = C4307hx.b.a(this.j);
        this.r = c4307hxA;
        return c4307hxA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC1091Gt1 abstractC1091Gt1 = this.k;
        if (abstractC1091Gt1 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC1091Gt1.close();
    }

    public final boolean g() {
        int i = this.h;
        return 200 <= i && i < 300;
    }

    @NotNull
    public final a k() {
        Intrinsics.checkNotNullParameter(this, "response");
        a aVar = new a();
        aVar.a = this.d;
        aVar.b = this.e;
        aVar.c = this.h;
        aVar.d = this.g;
        aVar.e = this.i;
        aVar.f = this.j.d();
        aVar.g = this.k;
        aVar.h = this.l;
        aVar.i = this.m;
        aVar.j = this.n;
        aVar.k = this.o;
        aVar.l = this.p;
        aVar.m = this.q;
        return aVar;
    }

    @NotNull
    public final C1169Ht1 l(long j) throws EOFException {
        AbstractC1091Gt1 abstractC1091Gt1 = this.k;
        Intrinsics.checkNotNull(abstractC1091Gt1);
        C3024bo1 source = abstractC1091Gt1.k().peek();
        C1481Lu c1481Lu = new C1481Lu();
        source.s(j);
        long jMin = Math.min(j, source.e.e);
        Intrinsics.checkNotNullParameter(source, "source");
        while (jMin > 0) {
            long jS0 = source.s0(c1481Lu, jMin);
            if (jS0 == -1) {
                throw new EOFException();
            }
            jMin -= jS0;
        }
        CY0 cy0G = abstractC1091Gt1.g();
        long j2 = c1481Lu.e;
        Intrinsics.checkNotNullParameter(c1481Lu, "<this>");
        return new C1169Ht1(cy0G, j2, c1481Lu);
    }

    @NotNull
    public final String toString() {
        return "Response{protocol=" + this.e + ", code=" + this.h + ", message=" + this.g + ", url=" + this.d.a + '}';
    }
}
