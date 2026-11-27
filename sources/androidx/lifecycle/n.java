package androidx.lifecycle;

import defpackage.AW1;
import defpackage.C1585Nc1;
import defpackage.C1795Pt1;
import defpackage.C5189lv;
import defpackage.InterfaceC3368dU;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import defpackage.XF0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {203}, m = "invokeSuspend")
public final class n extends AW1 implements Function2<KN, JM<Object>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ g g;
    public final /* synthetic */ g.b h;
    public final /* synthetic */ AW1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(g gVar, g.b bVar, Function2<? super KN, ? super JM<Object>, ? extends Object> function2, JM<? super n> jm) {
        super(2, jm);
        this.g = gVar;
        this.h = bVar;
        this.i = (AW1) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        n nVar = new n(this.g, this.h, this.i, jm);
        nVar.e = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<Object> jm) {
        return ((n) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        h hVar;
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) this.e;
            try {
                C1795Pt1.b(obj);
                hVar.a();
                return obj;
            } catch (Throwable th) {
                th = th;
                hVar.a();
                throw th;
            }
        }
        C1795Pt1.b(obj);
        XF0 xf0 = (XF0) ((KN) this.e).getE().p(XF0.a.d);
        if (xf0 == null) {
            throw new IllegalStateException("when[State] methods should have a parent job");
        }
        C1585Nc1 c1585Nc1 = new C1585Nc1();
        h hVar2 = new h(this.g, this.h, c1585Nc1.g, xf0);
        try {
            ?? r8 = this.i;
            this.e = hVar2;
            this.d = 1;
            obj = C5189lv.p(c1585Nc1, r8, this);
            if (obj == mn) {
                return mn;
            }
            hVar = hVar2;
            hVar.a();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            hVar = hVar2;
            hVar.a();
            throw th;
        }
    }
}
