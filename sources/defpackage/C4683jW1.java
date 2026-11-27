package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.experiments.remote.knowledge_base.SupportTestIsAvailableUseCaseBase", f = "SupportTestIsAvailableUseCaseBase.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE, 22, 25}, m = "updateAndGetValue")
public final class C4683jW1 extends LM {
    public Object d;
    public Object e;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C5103lW1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4683jW1(C5103lW1 c5103lW1, LM lm) {
        super(lm);
        this.i = c5103lW1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.m(this);
    }
}
