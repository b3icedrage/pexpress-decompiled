package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class K90 {

    @NotNull
    public final C3233co1 a;

    @NotNull
    public final AbstractC7971z80 b;

    @NotNull
    public final M90 c;

    @NotNull
    public final L90 d;
    public boolean e;

    @NotNull
    public final C3442do1 f;

    public final class a extends AbstractC1444Lh0 {
        public final long e;
        public boolean g;
        public long h;
        public boolean i;
        public final /* synthetic */ K90 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull K90 k90, KM1 delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.j = k90;
            this.e = j;
        }

        public final <E extends IOException> E c(E e) {
            if (this.g) {
                return e;
            }
            this.g = true;
            return (E) this.j.a(this.h, false, true, e);
        }

        @Override // defpackage.AbstractC1444Lh0, defpackage.KM1, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.i) {
                return;
            }
            this.i = true;
            long j = this.e;
            if (j != -1 && this.h != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                c(null);
            } catch (IOException e) {
                throw c(e);
            }
        }

        @Override // defpackage.AbstractC1444Lh0, defpackage.KM1, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw c(e);
            }
        }

        @Override // defpackage.AbstractC1444Lh0, defpackage.KM1
        public final void i1(@NotNull C1481Lu source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.i) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.e;
            if (j2 == -1 || this.h + j <= j2) {
                try {
                    super.i1(source, j);
                    this.h += j;
                    return;
                } catch (IOException e) {
                    throw c(e);
                }
            }
            throw new ProtocolException("expected " + j2 + " bytes but received " + (this.h + j));
        }
    }

    public final class b extends AbstractC1521Mh0 {
        public final long e;
        public long g;
        public boolean h;
        public boolean i;
        public boolean j;
        public final /* synthetic */ K90 k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull K90 k90, UN1 delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.k = k90;
            this.e = j;
            this.h = true;
            if (j == 0) {
                t(null);
            }
        }

        @Override // defpackage.AbstractC1521Mh0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.j) {
                return;
            }
            this.j = true;
            try {
                super.close();
                t(null);
            } catch (IOException e) {
                throw t(e);
            }
        }

        @Override // defpackage.AbstractC1521Mh0, defpackage.UN1
        public final long s0(@NotNull C1481Lu sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.j) {
                throw new IllegalStateException("closed");
            }
            try {
                long jS0 = this.d.s0(sink, j);
                if (this.h) {
                    this.h = false;
                    K90 k90 = this.k;
                    k90.b.w(k90.a);
                }
                if (jS0 == -1) {
                    t(null);
                    return -1L;
                }
                long j2 = this.g + jS0;
                long j3 = this.e;
                if (j3 == -1 || j2 <= j3) {
                    this.g = j2;
                    if (j2 == j3) {
                        t(null);
                    }
                    return jS0;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e) {
                throw t(e);
            }
        }

        public final <E extends IOException> E t(E e) {
            if (this.i) {
                return e;
            }
            this.i = true;
            if (e == null && this.h) {
                this.h = false;
                K90 k90 = this.k;
                k90.b.w(k90.a);
            }
            return (E) this.k.a(this.g, true, false, e);
        }
    }

    public K90(@NotNull C3233co1 call, @NotNull AbstractC7971z80 eventListener, @NotNull M90 finder, @NotNull L90 codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.a = call;
        this.b = eventListener;
        this.c = finder;
        this.d = codec;
        this.f = codec.g();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <E extends IOException> E a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            e(e);
        }
        AbstractC7971z80 abstractC7971z80 = this.b;
        C3233co1 c3233co1 = this.a;
        if (z2) {
            if (e != null) {
                abstractC7971z80.s(c3233co1, e);
            } else {
                abstractC7971z80.q(c3233co1, j);
            }
        }
        if (z) {
            if (e != null) {
                abstractC7971z80.x(c3233co1, e);
            } else {
                abstractC7971z80.v(c3233co1, j);
            }
        }
        return (E) c3233co1.h(this, z2, z, e);
    }

    @NotNull
    public final C3862fo1 b() throws SocketException {
        C3233co1 c3233co1 = this.a;
        if (c3233co1.o) {
            throw new IllegalStateException("Check failed.");
        }
        c3233co1.o = true;
        c3233co1.j.j();
        C3442do1 c3442do1G = this.d.g();
        c3442do1G.getClass();
        Intrinsics.checkNotNullParameter(this, "exchange");
        Socket socket = c3442do1G.d;
        Intrinsics.checkNotNull(socket);
        C3024bo1 c3024bo1 = c3442do1G.h;
        Intrinsics.checkNotNull(c3024bo1);
        C2814ao1 c2814ao1 = c3442do1G.i;
        Intrinsics.checkNotNull(c2814ao1);
        socket.setSoTimeout(0);
        c3442do1G.l();
        return new C3862fo1(c3024bo1, c2814ao1, this);
    }

    @NotNull
    public final C6223qo1 c(@NotNull C0857Dt1 response) throws IOException {
        L90 l90 = this.d;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strF = C0857Dt1.f(response, "Content-Type");
            long jF = l90.f(response);
            return new C6223qo1(strF, jF, Cm2.e(new b(this, l90.b(response), jF)));
        } catch (IOException e) {
            this.b.x(this.a, e);
            e(e);
            throw e;
        }
    }

    @Nullable
    public final C0857Dt1.a d(boolean z) throws IOException {
        try {
            C0857Dt1.a aVarE = this.d.e(z);
            if (aVarE != null) {
                Intrinsics.checkNotNullParameter(this, "deferredTrailers");
                aVarE.m = this;
            }
            return aVarE;
        } catch (IOException e) {
            this.b.x(this.a, e);
            e(e);
            throw e;
        }
    }

    public final void e(IOException iOException) {
        this.e = true;
        this.c.c(iOException);
        C3442do1 c3442do1G = this.d.g();
        C3233co1 call = this.a;
        synchronized (c3442do1G) {
            try {
                Intrinsics.checkNotNullParameter(call, "call");
                if (!(iOException instanceof C2945bS1)) {
                    if (!(c3442do1G.g != null) || (iOException instanceof C3757fK)) {
                        c3442do1G.j = true;
                        if (c3442do1G.m == 0) {
                            C3442do1.e(call.d, c3442do1G.b, iOException);
                            c3442do1G.l++;
                        }
                    }
                } else if (((C2945bS1) iOException).d == EnumC7967z70.REFUSED_STREAM) {
                    int i = c3442do1G.n + 1;
                    c3442do1G.n = i;
                    if (i > 1) {
                        c3442do1G.j = true;
                        c3442do1G.l++;
                    }
                } else if (((C2945bS1) iOException).d != EnumC7967z70.CANCEL || !call.t) {
                    c3442do1G.j = true;
                    c3442do1G.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
