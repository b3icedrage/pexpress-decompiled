package defpackage;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.Timeline", f = "Timeline.kt", l = {152, 153}, m = "startNewSession")
public final class HZ1 extends LM {
    public KZ1 d;
    public List e;
    public long g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ KZ1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HZ1(KZ1 kz1, LM lm) {
        super(lm);
        this.j = kz1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.h(0L, this);
    }
}
