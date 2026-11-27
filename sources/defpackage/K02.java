package defpackage;

import io.sentry.util.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class K02 {

    @NotNull
    public final C2688aH1 a;

    public K02(@NotNull C2688aH1 c2688aH1) {
        this.a = c2688aH1;
    }

    @NotNull
    public final L02 a(@NotNull C6935uC1 c6935uC1) {
        Double dA;
        C4804k42 c4804k42 = c6935uC1.a;
        L02 l02 = c4804k42.h;
        if (l02 != null) {
            return u.a(l02);
        }
        C2688aH1 c2688aH1 = this.a;
        c2688aH1.getProfilesSampler();
        Double profilesSampleRate = c2688aH1.getProfilesSampleRate();
        Double d = c6935uC1.b;
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d.doubleValue());
        if (c2688aH1.getTracesSampler() != null) {
            try {
                dA = ((RF0) c2688aH1.getTracesSampler()).a(c6935uC1);
            } catch (Throwable th) {
                c2688aH1.getLogger().d(NG1.ERROR, "Error in the 'TracesSamplerCallback' callback.", th);
                dA = null;
            }
            if (dA != null) {
                return new L02(Boolean.valueOf(dA.doubleValue() >= d.doubleValue()), dA, d, boolValueOf, profilesSampleRate);
            }
        }
        L02 l03 = c4804k42.v;
        if (l03 != null) {
            return u.a(l03);
        }
        Double tracesSampleRate = c2688aH1.getTracesSampleRate();
        Double dValueOf = tracesSampleRate != null ? Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, c2688aH1.getBackpressureMonitor().a())) : null;
        if (dValueOf != null) {
            return new L02(Boolean.valueOf(dValueOf.doubleValue() >= d.doubleValue()), dValueOf, d, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new L02(bool, null, d, bool, null);
    }
}
