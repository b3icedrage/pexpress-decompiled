package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5677oD extends QA1.b {

    @NotNull
    public static final C5677oD a = new C5677oD();

    @Override // QA1.b
    public final void a(@NotNull C3213cj0 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.a(db);
        db.x();
        try {
            db.E("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - Wj2.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db.p0();
        } finally {
            db.F0();
        }
    }
}
