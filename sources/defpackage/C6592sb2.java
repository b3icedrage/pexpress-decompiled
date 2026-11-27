package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: sb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6592sb2 {
    public final YZ0 a;
    public final RO b;
    public final String c;
    public final a d = new a(false);
    public final a e = new a(true);
    public final AtomicMarkableReference<String> f = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: renamed from: sb2$a */
    public class a {
        public final AtomicMarkableReference<BK0> a;

        public a(boolean z) {
            new AtomicReference(null);
            this.a = new AtomicMarkableReference<>(new BK0(z ? 8192 : UserVerificationMethods.USER_VERIFY_ALL), false);
        }

        public final Map<String, String> a() {
            Map<String, String> mapUnmodifiableMap;
            BK0 reference = this.a.getReference();
            synchronized (reference) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
            }
            return mapUnmodifiableMap;
        }
    }

    public C6592sb2(String str, C4448id0 c4448id0, RO ro) {
        this.c = str;
        this.a = new YZ0(c4448id0);
        this.b = ro;
    }
}
