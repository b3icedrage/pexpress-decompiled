package defpackage;

import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7292vv0 {

    @NotNull
    public final WorkDatabase a;

    public C7292vv0(@NotNull WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.a = workDatabase;
    }
}
