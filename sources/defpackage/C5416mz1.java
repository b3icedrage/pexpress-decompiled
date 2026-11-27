package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.RobotSessionIdHolder", f = "RobotSessionIdHolder.kt", l = {82}, m = "getOrRestoreSession")
public final class C5416mz1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C5206lz1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5416mz1(C5206lz1 c5206lz1, LM lm) {
        super(lm);
        this.e = c5206lz1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
