package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4997l01 extends AbstractC3899g01 {

    @NotNull
    public static final C4997l01 c = new C4997l01(12, 13);

    @Override // defpackage.AbstractC3899g01
    public final void a(@NotNull C3213cj0 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.E("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db.E("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
