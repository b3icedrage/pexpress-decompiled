package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.migration.MigrationManager", f = "MigrationManager.kt", l = {RequestError.NO_DEV_KEY, 45, 48}, m = "safePerformMigration$android_release")
public final class C4109h01 extends LM {
    public C4319i01 d;
    public MI e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C4319i01 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4109h01(C4319i01 c4319i01, LM lm) {
        super(lm);
        this.h = c4319i01;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
