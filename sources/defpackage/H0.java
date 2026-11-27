package defpackage;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H0 implements HZ0 {

    public static abstract class a<BuilderType extends a> implements HZ0.a {
        @Override // HZ0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType U0(EE ee, C1578Na0 c1578Na0);

        /* JADX INFO: renamed from: H0$a$a, reason: collision with other inner class name */
        public static final class C0041a extends FilterInputStream {
            public int d;

            public C0041a(ByteArrayInputStream byteArrayInputStream, int i) {
                super(byteArrayInputStream);
                this.d = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.d);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.d <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.d--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.d));
                if (jSkip >= 0) {
                    this.d = (int) (((long) this.d) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.d;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.d -= i4;
                }
                return i4;
            }
        }
    }
}
