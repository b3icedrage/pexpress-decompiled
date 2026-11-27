package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Writer;

/* JADX INFO: renamed from: uS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6982uS0 extends Writer {
    public final StringBuilder d = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);

    public final void c() {
        StringBuilder sb = this.d;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        c();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                c();
            } else {
                this.d.append(c);
            }
        }
    }
}
