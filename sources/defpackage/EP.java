package defpackage;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.usecases.CreateBetConfirmationParamsUseCaseBase", f = "CreateBetConfirmationParamsUseCaseBase.kt", l = {79}, m = "setupStrategy")
public final class EP extends LM {
    public AP d;
    public Iterator e;
    public Object g;
    public EnumC2644a42 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ AP j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EP(AP ap, LM lm) {
        super(lm);
        this.j = ap;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return AP.c(this.j, this);
    }
}
