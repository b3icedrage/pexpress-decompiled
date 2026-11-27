package defpackage;

import android.view.ViewGroup;
import com.base.feature.support.support.screens.common.SupportFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.common.SupportFragment", f = "SupportFragment.kt", l = {59}, m = "addInvisible")
public final class C7202vV1 extends LM {
    public ViewGroup d;
    public /* synthetic */ Object e;
    public final /* synthetic */ SupportFragment g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7202vV1(SupportFragment supportFragment, LM lm) {
        super(lm);
        this.g = supportFragment;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.m(null, this);
    }
}
