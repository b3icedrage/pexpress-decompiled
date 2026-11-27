package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class QA0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] g;

        static {
            a aVar = new a(Payload.RESPONSE_OK, 0);
            d = aVar;
            a aVar2 = new a("BAD_CONFIG", 1);
            e = aVar2;
            g = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) g.clone();
        }
    }

    public abstract AbstractC3690f02 a();

    public abstract String b();

    public abstract String c();

    public abstract a d();

    public abstract String e();
}
