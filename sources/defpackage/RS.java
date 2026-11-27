package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, 300}, m = "invokeSuspend")
public final class RS extends AW1 implements Function1<JM<? super Pair<? extends EP1<Object>, ? extends Boolean>>, Object> {
    public Throwable d;
    public int e;
    public final /* synthetic */ IS<Object> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RS(IS<Object> is, JM<? super RS> jm) {
        super(1, jm);
        this.g = is;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@NotNull JM<?> jm) {
        return new RS(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Pair<? extends EP1<Object>, ? extends Boolean>> jm) {
        return ((RS) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Throwable th;
        EP1 c0605An1;
        MN mn = MN.d;
        int i = this.e;
        IS<Object> is = this.g;
        try {
            if (i == 0) {
                C1795Pt1.b(obj);
                this.e = 1;
                obj = IS.f(is, true, this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = this.d;
                    C1795Pt1.b(obj);
                    c0605An1 = new C0605An1(th, ((Number) obj).intValue());
                    return new Pair(c0605An1, Boolean.TRUE);
                }
                C1795Pt1.b(obj);
            }
            c0605An1 = (EP1) obj;
        } catch (Throwable th2) {
            SB0 sb0G = is.g();
            this.d = th2;
            this.e = 2;
            Integer numE = sb0G.e();
            if (numE != mn) {
                th = th2;
                obj = numE;
            }
            return mn;
        }
        return new Pair(c0605An1, Boolean.TRUE);
    }
}
