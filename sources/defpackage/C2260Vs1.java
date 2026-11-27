package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Vs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2260Vs1 extends AbstractC3899g01 {

    @NotNull
    public final Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2260Vs1(@NotNull Context mContext, int i, int i2) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.c = mContext;
    }

    @Override // defpackage.AbstractC3899g01
    public final void a(@NotNull C3213cj0 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        if (this.b >= 10) {
            db.c(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
