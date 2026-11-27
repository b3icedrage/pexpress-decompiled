package defpackage;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ir1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.migration.RemnantDataMigration", f = "RemnantDataMigration.kt", l = {142}, m = "moveEvent")
public final class C4540ir1 extends LM {
    public Function1 d;
    public long e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C6232qr1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4540ir1(C6232qr1 c6232qr1, LM lm) {
        super(lm);
        this.h = c6232qr1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c(null, null, null, this);
    }
}
