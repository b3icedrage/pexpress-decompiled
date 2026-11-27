package defpackage;

import android.view.ViewGroup;
import com.base.feature.account.screens.common.AccountCommonFragmentBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.account.screens.common.AccountCommonFragmentBase", f = "AccountCommonFragmentBase.kt", l = {60}, m = "addInvisible")
public final class R2 extends LM {
    public ViewGroup d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AccountCommonFragmentBase g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R2(AccountCommonFragmentBase accountCommonFragmentBase, LM lm) {
        super(lm);
        this.g = accountCommonFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.m(null, this);
    }
}
