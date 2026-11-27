package defpackage;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.providers.BottomSheetDialogsDataProviderBase", f = "BottomSheetDialogsDataProviderBase.kt", l = {60, 61, 69}, m = "getStrategiesDetailsListV1")
public final class C5186lu extends LM {
    public C5399mu d;
    public C5819ou[] e;
    public Object[] g;
    public Serializable h;
    public Integer i;
    public Integer j;
    public String[] k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ C5399mu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5186lu(C5399mu c5399mu, LM lm) {
        super(lm);
        this.o = c5399mu;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.d(this);
    }
}
