package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Dl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0833Dl1 implements Closeable {
    public static final Logger k = Logger.getLogger(C0833Dl1.class.getName());
    public final RandomAccessFile d;
    public int e;
    public int g;
    public b h;
    public b i;
    public final byte[] j;

    /* JADX INFO: renamed from: Dl1$a */
    public class a implements d {
        public boolean a = true;
        public final /* synthetic */ StringBuilder b;

        public a(StringBuilder sb) {
            this.b = sb;
        }

        @Override // defpackage.C0833Dl1.d
        public final void a(c cVar, int i) {
            boolean z = this.a;
            StringBuilder sb = this.b;
            if (z) {
                this.a = false;
            } else {
                sb.append(", ");
            }
            sb.append(i);
        }
    }

    /* JADX INFO: renamed from: Dl1$b */
    public static class b {
        public static final b c = new b(0, 0);
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.a);
            sb.append(", length = ");
            return SK.b(sb, this.b, "]");
        }
    }

    /* JADX INFO: renamed from: Dl1$d */
    public interface d {
        void a(c cVar, int i);
    }

    public C0833Dl1(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.j = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    D(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.d = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iP = p(0, bArr);
        this.e = iP;
        if (iP > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.e + ", Actual length: " + randomAccessFile2.length());
        }
        this.g = p(4, bArr);
        int iP2 = p(8, bArr);
        int iP3 = p(12, bArr);
        this.h = l(iP2);
        this.i = l(iP3);
    }

    public static void D(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static int p(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final int A(int i) {
        int i2 = this.e;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void C(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        byte[] bArr = this.j;
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            D(bArr, i5, iArr[i6]);
            i5 += 4;
        }
        RandomAccessFile randomAccessFile = this.d;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    public final void c(byte[] bArr) {
        int iA;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    f(length);
                    boolean zK = k();
                    if (zK) {
                        iA = 16;
                    } else {
                        b bVar = this.i;
                        iA = A(bVar.a + 4 + bVar.b);
                    }
                    b bVar2 = new b(iA, length);
                    D(this.j, 0, length);
                    u(this.j, iA, 4);
                    u(bArr, iA + 4, length);
                    C(this.e, this.g + 1, zK ? iA : this.h.a, iA);
                    this.i = bVar2;
                    this.g++;
                    if (zK) {
                        this.h = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d.close();
    }

    public final void f(int i) throws IOException {
        int i2 = i + 4;
        int iV = this.e - v();
        if (iV >= i2) {
            return;
        }
        int i3 = this.e;
        do {
            iV += i3;
            i3 <<= 1;
        } while (iV < i2);
        RandomAccessFile randomAccessFile = this.d;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        b bVar = this.i;
        int iA = A(bVar.a + 4 + bVar.b);
        if (iA < this.h.a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.e);
            long j = iA - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.i.a;
        int i5 = this.h.a;
        if (i4 < i5) {
            int i6 = (this.e + i4) - 16;
            C(i3, this.g, i5, i6);
            this.i = new b(i6, this.i.b);
        } else {
            C(i3, this.g, i5, i4);
        }
        this.e = i3;
    }

    public final synchronized void g(d dVar) {
        int iA = this.h.a;
        for (int i = 0; i < this.g; i++) {
            b bVarL = l(iA);
            dVar.a(new c(bVarL), bVarL.b);
            iA = A(bVarL.a + 4 + bVarL.b);
        }
    }

    public final synchronized boolean k() {
        return this.g == 0;
    }

    public final b l(int i) throws IOException {
        if (i == 0) {
            return b.c;
        }
        RandomAccessFile randomAccessFile = this.d;
        randomAccessFile.seek(i);
        return new b(i, randomAccessFile.readInt());
    }

    public final synchronized void q() {
        if (k()) {
            throw new NoSuchElementException();
        }
        if (this.g == 1) {
            synchronized (this) {
                C(4096, 0, 0, 0);
                this.g = 0;
                b bVar = b.c;
                this.h = bVar;
                this.i = bVar;
                if (this.e > 4096) {
                    RandomAccessFile randomAccessFile = this.d;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.e = 4096;
            }
        } else {
            b bVar2 = this.h;
            int iA = A(bVar2.a + 4 + bVar2.b);
            t(iA, this.j, 0, 4);
            int iP = p(0, this.j);
            C(this.e, this.g - 1, iA, this.i.a);
            this.g--;
            this.h = new b(iA, iP);
        }
    }

    public final void t(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iA = A(i);
        int i4 = iA + i3;
        int i5 = this.e;
        RandomAccessFile randomAccessFile = this.d;
        if (i4 <= i5) {
            randomAccessFile.seek(iA);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iA;
        randomAccessFile.seek(iA);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0833Dl1.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.e);
        sb.append(", size=");
        sb.append(this.g);
        sb.append(", first=");
        sb.append(this.h);
        sb.append(", last=");
        sb.append(this.i);
        sb.append(", element lengths=[");
        try {
            g(new a(sb));
        } catch (IOException e) {
            k.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final void u(byte[] bArr, int i, int i2) throws IOException {
        int iA = A(i);
        int i3 = iA + i2;
        int i4 = this.e;
        RandomAccessFile randomAccessFile = this.d;
        if (i3 <= i4) {
            randomAccessFile.seek(iA);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iA;
        randomAccessFile.seek(iA);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int v() {
        if (this.g == 0) {
            return 16;
        }
        b bVar = this.i;
        int i = bVar.a;
        int i2 = this.h.a;
        return i >= i2 ? (i - i2) + 4 + bVar.b + 16 : (((i + 4) + bVar.b) + this.e) - i2;
    }

    /* JADX INFO: renamed from: Dl1$c */
    public final class c extends InputStream {
        public int d;
        public int e;

        public c(b bVar) {
            this.d = C0833Dl1.this.A(bVar.a + 4);
            this.e = bVar.b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.e;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            int i4 = this.d;
            C0833Dl1 c0833Dl1 = C0833Dl1.this;
            c0833Dl1.t(i4, bArr, i, i2);
            this.d = c0833Dl1.A(this.d + i2);
            this.e -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.e == 0) {
                return -1;
            }
            C0833Dl1 c0833Dl1 = C0833Dl1.this;
            c0833Dl1.d.seek(this.d);
            int i = c0833Dl1.d.read();
            this.d = c0833Dl1.A(this.d + 1);
            this.e--;
            return i;
        }
    }
}
