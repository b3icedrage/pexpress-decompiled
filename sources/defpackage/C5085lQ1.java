package defpackage;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.activation.providers.StepDescriptionProviderBase", f = "StepDescriptionProviderBase.kt", l = {53, 55}, m = "notActivatedDescription")
public final class C5085lQ1 extends LM {
    public Object d;
    public String e;
    public List g;
    public Object[] h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ C4875kQ1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5085lQ1(C4875kQ1 c4875kQ1, LM lm) {
        super(lm);
        this.m = c4875kQ1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return C4875kQ1.b(this.m, this);
    }
}
