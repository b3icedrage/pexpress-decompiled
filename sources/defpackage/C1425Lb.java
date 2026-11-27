package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.storage.AndroidStorageV2", f = "AndroidStorageV2.kt", l = {53}, m = "writeEvent")
public final class C1425Lb extends LM {
    public C1502Mb d;
    public C0612Aq e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C1502Mb h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1425Lb(C1502Mb c1502Mb, LM lm) {
        super(lm);
        this.h = c1502Mb;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(null, this);
    }
}
