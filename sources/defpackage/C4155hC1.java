package defpackage;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: hC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4155hC1 {
    public final QU0<InterfaceC3129cK0, String> a = new QU0<>(1000);
    public final C5751ob0.c b = C5751ob0.a(10, new a());

    /* JADX INFO: renamed from: hC1$a */
    public class a implements C5751ob0.b<b> {
        @Override // defpackage.C5751ob0.b
        public final b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: hC1$b */
    public static final class b implements C5751ob0.d {
        public final MessageDigest d;
        public final RP1.a e = new RP1.a();

        public b(MessageDigest messageDigest) {
            this.d = messageDigest;
        }

        @Override // defpackage.C5751ob0.d
        @NonNull
        public final RP1.a f() {
            return this.e;
        }
    }

    public final String a(InterfaceC3129cK0 interfaceC3129cK0) {
        String strA;
        synchronized (this.a) {
            strA = this.a.a(interfaceC3129cK0);
        }
        if (strA == null) {
            b bVar = (b) this.b.a();
            try {
                interfaceC3129cK0.b(bVar.d);
                byte[] bArrDigest = bVar.d.digest();
                char[] cArr = C6177qc2.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b2 = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = C6177qc2.a;
                        cArr[i2] = cArr2[(b2 & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b2 & 15];
                    }
                    strA = new String(cArr);
                }
                this.b.b(bVar);
            } catch (Throwable th) {
                this.b.b(bVar);
                throw th;
            }
        }
        synchronized (this.a) {
            this.a.d(interfaceC3129cK0, strA);
        }
        return strA;
    }
}
