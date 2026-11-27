package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.reporters.RobotTradingReporter", f = "RobotTradingReporter.kt", l = {195, 209, 215, 218, 223, 224, 231, 232, 234, 235, 236, 237, 239, 244}, m = "buildCommonTradingProperty")
public final class C7980zA1 extends LM {
    public Object d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public String k;
    public String l;
    public String m;
    public Double n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long s;
    public double t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ AbstractC7770yA1 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7980zA1(AbstractC7770yA1 abstractC7770yA1, LM lm) {
        super(lm);
        this.w = abstractC7770yA1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(false, null, null, 0L, null, this);
    }
}
