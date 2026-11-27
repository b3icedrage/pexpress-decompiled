package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class RI extends G1 {
    public static RI e;

    public static synchronized RI w() {
        try {
            if (e == null) {
                e = new RI();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    @Override // defpackage.G1
    public final String g() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // defpackage.G1
    public final String h() {
        return "experiment_app_start_ttid";
    }
}
