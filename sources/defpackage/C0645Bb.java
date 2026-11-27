package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.storage.AndroidStorageContextV1", f = "AndroidStorageContextV1.kt", l = {112, 118}, m = "migrateToLatestVersion")
public final class C0645Bb extends LM {
    public C0723Cb d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C0723Cb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0645Bb(C0723Cb c0723Cb, LM lm) {
        super(lm);
        this.g = c0723Cb;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}
