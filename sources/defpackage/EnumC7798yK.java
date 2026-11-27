package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: yK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC7798yK {
    SystemOut("System.out", new a()),
    /* JADX INFO: Fake field, exist only in values array */
    SystemErr("System.err", new b());

    public final String d;
    public final OutputStream e;

    /* JADX INFO: renamed from: yK$a */
    public static class a extends OutputStream {
        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            System.out.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            System.out.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            System.out.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            System.out.write(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: yK$b */
    public static class b extends OutputStream {
        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            System.err.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            System.err.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            System.err.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            System.err.write(bArr, i, i2);
        }
    }

    EnumC7798yK(String str, OutputStream outputStream) {
        this.d = str;
        this.e = outputStream;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
