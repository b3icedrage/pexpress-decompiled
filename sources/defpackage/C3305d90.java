package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.core.utilities.EventsFileManager", f = "EventsFileManager.kt", l = {367}, m = "handleV1Files")
public final class C3305d90 extends LM {
    public C4144h90 d;
    public InterfaceC4117h21 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C4144h90 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3305d90(C4144h90 c4144h90, LM lm) {
        super(lm);
        this.h = c4144h90;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C4144h90.b(this.h, this);
    }
}
