package defpackage;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ie0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4452ie0 extends AbstractC5550nd1 {
    public static final C6170qb b = C6170qb.d();
    public final I02 a;

    public C4452ie0(@NonNull I02 i02) {
        this.a = i02;
    }

    public static boolean d(I02 i02, int i) {
        if (i02 != null) {
            C6170qb c6170qb = b;
            if (i > 1) {
                c6170qb.f("Exceed MAX_SUBTRACE_DEEP:1");
                return false;
            }
            for (Map.Entry<String, Long> entry : i02.H().entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    String strTrim = key.trim();
                    if (strTrim.isEmpty()) {
                        c6170qb.f("counterId is empty");
                    } else if (strTrim.length() > 100) {
                        c6170qb.f("counterId exceeded max length 100");
                    } else if (entry.getValue() == null) {
                        c6170qb.f("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
                c6170qb.f("invalid CounterId:" + entry.getKey());
                return false;
            }
            Iterator<E> it = i02.N().iterator();
            while (it.hasNext()) {
                if (!d((I02) it.next(), i + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean e(I02 i02, int i) {
        Long l;
        C6170qb c6170qb = b;
        if (i02 == null) {
            c6170qb.f("TraceMetric is null");
            return false;
        }
        if (i > 1) {
            c6170qb.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String strL = i02.L();
        if (strL != null) {
            String strTrim = strL.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (i02.K() <= 0) {
                    c6170qb.f("invalid TraceDuration:" + i02.K());
                    return false;
                }
                if (!i02.O()) {
                    c6170qb.f("clientStartTimeUs is null.");
                    return false;
                }
                if (i02.L().startsWith("_st_") && ((l = i02.H().get("_fr_tot")) == null || l.compareTo((Long) 0L) <= 0)) {
                    c6170qb.f("non-positive totalFrames in screen trace " + i02.L());
                    return false;
                }
                Iterator<E> it = i02.N().iterator();
                while (it.hasNext()) {
                    if (!e((I02) it.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry<String, String> entry : i02.I().entrySet()) {
                    try {
                        AbstractC5550nd1.b(entry.getKey(), entry.getValue());
                    } catch (IllegalArgumentException e) {
                        c6170qb.f(e.getLocalizedMessage());
                    }
                }
                return true;
            }
        }
        c6170qb.f("invalid TraceId:" + i02.L());
        return false;
    }

    @Override // defpackage.AbstractC5550nd1
    public final boolean a() {
        I02 i02 = this.a;
        boolean zE = e(i02, 0);
        C6170qb c6170qb = b;
        if (!zE) {
            c6170qb.f("Invalid Trace:" + i02.L());
            return false;
        }
        if (i02.G() <= 0) {
            Iterator<E> it = i02.N().iterator();
            while (it.hasNext()) {
                if (((I02) it.next()).G() > 0) {
                }
            }
            return true;
        }
        if (d(i02, 0)) {
            return true;
        }
        c6170qb.f("Invalid Counters for Trace:" + i02.L());
        return false;
    }
}
