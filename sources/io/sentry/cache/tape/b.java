package io.sentry.cache.tape;

import io.sentry.cache.tape.d.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> extends c<T> {
    public final d d;
    public final a e = new a();
    public final c.a<T> g;

    public static final class a extends ByteArrayOutputStream {
        public final byte[] c() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* JADX INFO: renamed from: io.sentry.cache.tape.b$b, reason: collision with other inner class name */
    public final class C0393b implements Iterator<T> {
        public final d.b d;

        public C0393b(d.b bVar) {
            this.d = bVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        @Nullable
        public final T next() {
            return b.this.g.b((byte[]) this.d.next());
        }

        @Override // java.util.Iterator
        public final void remove() throws IOException {
            this.d.remove();
        }
    }

    public b(d dVar, c.a<T> aVar) {
        this.d = dVar;
        this.g = aVar;
    }

    @Override // io.sentry.cache.tape.c
    public final void c(T t) throws IOException {
        long j;
        long j2;
        long j3;
        long jK0;
        long j4;
        long j5;
        a aVar = this.e;
        aVar.reset();
        this.g.a(t, aVar);
        byte[] bArrC = aVar.c();
        int size = aVar.size();
        d dVar = this.d;
        dVar.getClass();
        if (bArrC == null) {
            throw new NullPointerException("data == null");
        }
        if (size < 0 || size > bArrC.length) {
            throw new IndexOutOfBoundsException();
        }
        if (dVar.n) {
            throw new IllegalStateException("closed");
        }
        int i = dVar.m;
        if (i != -1 && dVar.h == i) {
            dVar.D(1);
        }
        long j6 = ((long) size) + 4;
        long j7 = dVar.g;
        if (dVar.h == 0) {
            j = 4;
            j3 = 32;
            j2 = 32;
        } else {
            d.a aVar2 = dVar.j;
            long j8 = aVar2.a;
            j = 4;
            long j9 = dVar.i.a;
            int i2 = aVar2.b;
            if (j8 >= j9) {
                j3 = (j8 - j9) + 4 + ((long) i2) + 32;
                j2 = 32;
            } else {
                j2 = 32;
                j3 = (((j8 + 4) + ((long) i2)) + j7) - j9;
            }
        }
        long j10 = j7 - j3;
        if (j10 < j6) {
            do {
                j10 += j7;
                j7 <<= 1;
            } while (j10 < j6);
            dVar.d.setLength(j7);
            dVar.d.getChannel().force(true);
            d.a aVar3 = dVar.j;
            long jK1 = dVar.K0(aVar3.a + j + ((long) aVar3.b));
            if (jK1 <= dVar.i.a) {
                FileChannel channel = dVar.d.getChannel();
                channel.position(dVar.g);
                j4 = jK1 - j2;
                if (channel.transferTo(32L, j4, channel) != j4) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            } else {
                j4 = 0;
            }
            long j11 = dVar.j.a;
            long j12 = dVar.i.a;
            if (j11 < j12) {
                long j13 = (dVar.g + j11) - j2;
                j5 = j7;
                dVar.M0(j5, dVar.h, j12, j13);
                dVar.j = new d.a(dVar.j.b, j13);
            } else {
                j5 = j7;
                dVar.M0(j5, dVar.h, j12, j11);
            }
            dVar.g = j5;
            long j14 = j2;
            long j15 = j4;
            while (j15 > 0) {
                int iMin = (int) Math.min(j15, 4096);
                dVar.Z(iMin, j14, d.o);
                long j16 = iMin;
                j15 -= j16;
                j14 += j16;
            }
        }
        boolean z = dVar.h == 0;
        if (z) {
            jK0 = j2;
        } else {
            d.a aVar4 = dVar.j;
            jK0 = dVar.K0(aVar4.a + j + ((long) aVar4.b));
        }
        d.a aVar5 = new d.a(size, jK0);
        byte[] bArr = dVar.k;
        d.Q0(bArr, 0, size);
        dVar.Z(4, jK0, bArr);
        dVar.Z(size, jK0 + j, bArrC);
        dVar.M0(dVar.g, dVar.h + 1, z ? jK0 : dVar.i.a, jK0);
        dVar.j = aVar5;
        dVar.h++;
        dVar.l++;
        if (z) {
            dVar.i = aVar5;
        }
    }

    @Override // io.sentry.cache.tape.c
    public final void clear() throws IOException {
        this.d.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        d dVar = this.d;
        dVar.getClass();
        return new C0393b(dVar.new b());
    }

    @Override // io.sentry.cache.tape.c
    public final void q(int i) throws IOException {
        this.d.D(i);
    }

    @Override // io.sentry.cache.tape.c
    public final int size() {
        return this.d.h;
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.d + '}';
    }
}
