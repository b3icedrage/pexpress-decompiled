package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.AppDataRepository", f = "AppDataRepository.kt", l = {132}, m = "loadDataStore")
public final class C5766of extends LM {
    public GP1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4923kf g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5766of(C4923kf c4923kf, LM lm) {
        super(lm);
        this.g = c4923kf;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
