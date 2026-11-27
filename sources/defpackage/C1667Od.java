package defpackage;

import androidx.activity.ComponentActivity;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1667Od implements W81 {
    public final /* synthetic */ ActivityC1745Pd a;

    public C1667Od(ActivityC1745Pd activityC1745Pd) {
        this.a = activityC1745Pd;
    }

    @Override // defpackage.W81
    public final void a(@NonNull ComponentActivity componentActivity) {
        ActivityC1745Pd activityC1745Pd = this.a;
        AbstractC2759ae abstractC2759aeO = activityC1745Pd.o();
        abstractC2759aeO.k();
        activityC1745Pd.getSavedStateRegistry().a("androidx:appcompat");
        abstractC2759aeO.n();
    }
}
