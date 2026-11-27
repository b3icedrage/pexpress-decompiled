package defpackage;

import io.sentry.android.core.b0;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: renamed from: Fl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0989Fl1 implements InterfaceC2133Uc0 {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public C0833Dl1 b;

    /* JADX INFO: renamed from: Fl1$a */
    public static class a {
        public final byte[] a;
        public final int b;

        public a(int i, byte[] bArr) {
            this.a = bArr;
            this.b = i;
        }
    }

    public C0989Fl1(File file) {
        this.a = file;
    }

    @Override // defpackage.InterfaceC2133Uc0
    public final void a() {
        C7155vG.a(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // defpackage.InterfaceC2133Uc0
    public final String b() {
        a aVar;
        byte[] bArr;
        if (this.a.exists()) {
            d();
            C0833Dl1 c0833Dl1 = this.b;
            if (c0833Dl1 == null) {
                aVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[c0833Dl1.v()];
                try {
                    this.b.g(new C0911El1(bArr2, iArr));
                } catch (IOException e) {
                    b0.d("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                aVar = new a(iArr[0], bArr2);
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            bArr = null;
        } else {
            int i = aVar.b;
            bArr = new byte[i];
            System.arraycopy(aVar.a, 0, bArr, 0, i);
        }
        if (bArr != null) {
            return new String(bArr, c);
        }
        return null;
    }

    @Override // defpackage.InterfaceC2133Uc0
    public final void c(String str, long j) {
        d();
        if (this.b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.b.c(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(c));
            while (!this.b.k() && this.b.v() > 65536) {
                this.b.q();
            }
        } catch (IOException e) {
            b0.d("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    public final void d() {
        File file = this.a;
        if (this.b == null) {
            try {
                this.b = new C0833Dl1(file);
            } catch (IOException e) {
                b0.d("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }
}
