package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: s01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6469s01 extends AbstractC3899g01 {

    @NotNull
    public static final C6469s01 c = new C6469s01(8, 9);

    @Override // defpackage.AbstractC3899g01
    public final void a(@NotNull C3213cj0 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.E("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
