package defpackage;

import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.auto.value.AutoValue;

/* JADX INFO: renamed from: f02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class AbstractC3690f02 {

    /* JADX INFO: renamed from: f02$a */
    @AutoValue.Builder
    public static abstract class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: f02$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final /* synthetic */ b[] h;

        static {
            b bVar = new b(Payload.RESPONSE_OK, 0);
            d = bVar;
            b bVar2 = new b("BAD_CONFIG", 1);
            e = bVar2;
            b bVar3 = new b("AUTH_ERROR", 2);
            g = bVar3;
            h = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) h.clone();
        }
    }

    @NonNull
    public static C1700Oo.a a() {
        C1700Oo.a aVar = new C1700Oo.a();
        aVar.b = 0L;
        return aVar;
    }

    public abstract b b();

    public abstract String c();

    @NonNull
    public abstract long d();
}
