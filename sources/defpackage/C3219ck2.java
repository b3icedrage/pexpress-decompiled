package defpackage;

import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: ck2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3219ck2 {
    public final C4946kk2 a;
    public final C0743Ch1 b;
    public final Ck2 c;

    static {
        AS0.d("WMFgUpdater");
    }

    public C3219ck2(@NonNull WorkDatabase workDatabase, @NonNull C0743Ch1 c0743Ch1, @NonNull C4946kk2 c4946kk2) {
        this.b = c0743Ch1;
        this.a = c4946kk2;
        this.c = workDatabase.u();
    }
}
