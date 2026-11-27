package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Yk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.reactive.PublisherAsFlow$collectSlowPath$2", f = "ReactiveFlow.kt", l = {83}, m = "invokeSuspend")
public final class C2500Yk1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ InterfaceC6606sf0<Object> g;
    public final /* synthetic */ C2422Xk1<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2500Yk1(InterfaceC6606sf0<Object> interfaceC6606sf0, C2422Xk1<Object> c2422Xk1, JM<? super C2500Yk1> jm) {
        super(2, jm);
        this.g = interfaceC6606sf0;
        this.h = c2422Xk1;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C2500Yk1 c2500Yk1 = new C2500Yk1(this.g, this.h, jm);
        c2500Yk1.e = obj;
        return c2500Yk1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2500Yk1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2 = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            KN kn = (KN) this.e;
            C2422Xk1<Object> c2422Xk1 = this.h;
            InterfaceC0764Co1<Object> interfaceC0764Co1M = c2422Xk1.m(new EM(kn.getE().t(c2422Xk1.d)));
            this.d = 1;
            Object objA = C0736Cf0.a(this.g, interfaceC0764Co1M, true, this);
            if (objA != obj2) {
                objA = Unit.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
