package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe", f = "AppDataReadinessProbe.kt", l = {341, 360, 412}, m = "runFieldWatchdog")
public final class C1982Se extends LM {
    public C4245hf d;
    public C5647o42 e;
    public String g;
    public Object h;
    public InterfaceC2347Wu0 i;
    public long j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C4245hf n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1982Se(C4245hf c4245hf, LM lm) {
        super(lm);
        this.n = c4245hf;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return C4245hf.a(this.n, null, null, null, null, this);
    }
}
