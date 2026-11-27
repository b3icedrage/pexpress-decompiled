package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class Lm2 implements Callable {
    public final /* synthetic */ FirebaseAnalytics d;

    public Lm2(FirebaseAnalytics firebaseAnalytics) {
        this.d = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.d.a.zzl();
    }
}
