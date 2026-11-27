package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: r01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6259r01 extends AbstractC3899g01 {

    @NotNull
    public static final C6259r01 c = new C6259r01(7, 8);

    @Override // defpackage.AbstractC3899g01
    public final void a(@NotNull C3213cj0 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.E("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
