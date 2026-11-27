package defpackage;

import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: mD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class AbstractC5259mD1 {

    /* JADX INFO: renamed from: mD1$a */
    @AutoValue
    public static abstract class a {
        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: mD1$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final /* synthetic */ b[] h;

        static {
            b bVar = new b("NETWORK_UNMETERED", 0);
            d = bVar;
            b bVar2 = new b("DEVICE_IDLE", 1);
            e = bVar2;
            b bVar3 = new b("DEVICE_CHARGING", 2);
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

    public abstract InterfaceC3529eE a();

    public final long b(EnumC6825th1 enumC6825th1, long j, int i) {
        long jD = j - a().d();
        a aVar = c().get(enumC6825th1);
        long jA = aVar.a();
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * jA * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA > 1 ? jA : 2L) * ((long) i2)))), jD), aVar.c());
    }

    public abstract Map<EnumC6825th1, a> c();
}
