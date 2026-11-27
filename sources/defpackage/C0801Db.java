package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.storage.AndroidStorageContextV2", f = "AndroidStorageContextV2.kt", l = {114, 120}, m = "migrateToLatestVersion")
public final class C0801Db extends LM {
    public C0879Eb d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C0879Eb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0801Db(C0879Eb c0879Eb, LM lm) {
        super(lm);
        this.g = c0879Eb;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}
