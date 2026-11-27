package defpackage;

import android.os.Looper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3390db implements PV0 {
    @Override // defpackage.PV0
    @NotNull
    public final C7899yn0 a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C7899yn0(C0682Bn0.b(mainLooper), false);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
