package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ar0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.statement.HttpStatement$execute$4", f = "HttpStatement.kt", l = {63}, m = "invokeSuspend")
public final class C0616Ar0 extends AW1 implements Function2<AbstractC5391mr0, JM<? super AbstractC5391mr0>, Object> {
    public int d;
    public /* synthetic */ Object e;

    public C0616Ar0() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C0616Ar0 c0616Ar0 = new C0616Ar0(2, jm);
        c0616Ar0.e = obj;
        return c0616Ar0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC5391mr0 abstractC5391mr0, JM<? super AbstractC5391mr0> jm) {
        return ((C0616Ar0) create(abstractC5391mr0, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C2250Vp0 c2250Vp0B = ((AbstractC5391mr0) this.e).b();
            this.d = 1;
            obj = C3057c.o(c2250Vp0B, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return ((C2250Vp0) obj).d();
    }
}
