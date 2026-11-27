package defpackage;

import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Sv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.common.screens.RobotCommonViewModelBase", f = "RobotCommonViewModelBase.kt", l = {194, 197, HttpPlatformResponse.MAX_MESSAGE_LENGTH, 201}, m = "shouldOpenReviewDialog")
public final class C2035Sv1 extends LM {
    public C1486Lv1 d;
    public boolean e;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C1486Lv1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2035Sv1(C1486Lv1 c1486Lv1, LM lm) {
        super(lm);
        this.i = c1486Lv1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return C1486Lv1.m(this.i, this);
    }
}
