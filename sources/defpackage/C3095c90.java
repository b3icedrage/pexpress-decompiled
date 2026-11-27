package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: c90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.core.utilities.EventsFileManager", f = "EventsFileManager.kt", l = {367}, m = "getEventString")
public final class C3095c90 extends LM {
    public C4144h90 d;
    public String e;
    public InterfaceC4117h21 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C4144h90 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3095c90(C4144h90 c4144h90, LM lm) {
        super(lm);
        this.i = c4144h90;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.e(null, this);
    }
}
