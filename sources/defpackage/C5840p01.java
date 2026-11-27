package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: p01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5840p01 extends AbstractC3899g01 {

    @NotNull
    public static final C5840p01 c = new C5840p01(4, 5);

    @Override // defpackage.AbstractC3899g01
    public final void a(@NotNull C3213cj0 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.E("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db.E("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
