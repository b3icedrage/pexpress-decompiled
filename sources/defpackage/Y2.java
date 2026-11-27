package defpackage;

import com.base.feature.account.screens.common.AccountCommonFragmentBase;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.account.screens.common.AccountCommonFragmentBase", f = "AccountCommonFragmentBase.kt", l = {54}, m = "initView")
public final class Y2 extends LM {
    public AccountCommonFragmentBase d;
    public Iterator e;
    public V3 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ AccountCommonFragmentBase i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(AccountCommonFragmentBase accountCommonFragmentBase, LM lm) {
        super(lm);
        this.i = accountCommonFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return AccountCommonFragmentBase.l(this.i, this);
    }
}
