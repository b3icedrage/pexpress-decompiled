package defpackage;

import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.Timeline", f = "Timeline.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 66, 71, 75, 79, 81, 110}, m = "processEventMessage")
public final class FZ1 extends LM {
    public KZ1 d;
    public C0612Aq e;
    public Iterable g;
    public long h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ KZ1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FZ1(KZ1 kz1, LM lm) {
        super(lm);
        this.k = kz1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return KZ1.e(this.k, null, this);
    }
}
