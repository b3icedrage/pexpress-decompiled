package defpackage;

/* JADX INFO: renamed from: de0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3403de0 extends AbstractC5550nd1 {
    public static final C6170qb b = C6170qb.d();
    public final C0822Di a;

    public C3403de0(C0822Di c0822Di) {
        this.a = c0822Di;
    }

    @Override // defpackage.AbstractC5550nd1
    public final boolean a() {
        C6170qb c6170qb = b;
        C0822Di c0822Di = this.a;
        if (c0822Di == null) {
            c6170qb.f("ApplicationInfo is null");
        } else if (!c0822Di.G()) {
            c6170qb.f("GoogleAppId is null");
        } else if (!c0822Di.E()) {
            c6170qb.f("AppInstanceId is null");
        } else if (!c0822Di.F()) {
            c6170qb.f("ApplicationProcessState is null");
        } else {
            if (!c0822Di.D()) {
                return true;
            }
            if (!c0822Di.B().A()) {
                c6170qb.f("AndroidAppInfo.packageName is null");
            } else {
                if (c0822Di.B().B()) {
                    return true;
                }
                c6170qb.f("AndroidAppInfo.sdkVersion is null");
            }
        }
        c6170qb.f("ApplicationInfo is invalid");
        return false;
    }
}
