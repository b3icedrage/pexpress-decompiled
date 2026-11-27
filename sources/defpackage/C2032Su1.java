package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Su1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionViewModelBase", f = "RobotAccountSelectionViewModelBase.kt", l = {188, 189, 197}, m = "updateMultiAccount")
public final class C2032Su1 extends LM {
    public C1798Pu1 d;
    public C6945uG e;
    public double g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C1798Pu1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2032Su1(C1798Pu1 c1798Pu1, JM<? super C2032Su1> jm) {
        super(jm);
        this.i = c1798Pu1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return C1798Pu1.m(this.i, this);
    }
}
