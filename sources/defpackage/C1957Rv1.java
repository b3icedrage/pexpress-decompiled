package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase", f = "RobotCommonViewModelBase.kt", l = {173}, m = "setupWebView")
public final class C1957Rv1 extends LM {
    public GP1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1486Lv1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1957Rv1(C1486Lv1 c1486Lv1, JM<? super C1957Rv1> jm) {
        super(jm);
        this.g = c1486Lv1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C1486Lv1.l(this.g, false, this);
    }
}
