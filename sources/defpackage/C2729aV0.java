package defpackage;

import org.slf4j.impl.StaticMDCBinder;

/* JADX INFO: renamed from: aV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2729aV0 {
    public static final InterfaceC2953bV0 a;

    static {
        try {
            a = a();
        } catch (Exception e) {
            C7016uc2.b("MDC binding unsuccessful.", e);
        } catch (NoClassDefFoundError e2) {
            a = new C3787fU();
            String message = e2.getMessage();
            if (message == null || !message.contains("StaticMDCBinder")) {
                throw e2;
            }
            C7016uc2.a("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            C7016uc2.a("Defaulting to no-operation MDCAdapter implementation.");
            C7016uc2.a("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        }
    }

    public static C7403wS0 a() {
        try {
            StaticMDCBinder.getSingleton().getClass();
            return new C7403wS0();
        } catch (NoSuchMethodError unused) {
            return new C7403wS0();
        }
    }
}
