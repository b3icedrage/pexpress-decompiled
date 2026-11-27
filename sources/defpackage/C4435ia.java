package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.core.Amplitude$setUserId$1", f = "Amplitude.kt", l = {243}, m = "invokeSuspend")
public final class C4435ia extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C3595ea e;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4435ia(C3595ea c3595ea, String str, JM<? super C4435ia> jm) {
        super(2, jm);
        this.e = c3595ea;
        this.g = str;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new C4435ia(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4435ia) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        MN mn = MN.d;
        int i = this.d;
        C3595ea c3595ea = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            C7624xW c7624xW = c3595ea.n;
            this.d = 1;
            obj = c7624xW.z(this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            C1956Rv0 c1956Rv0 = c3595ea.d().a;
            C1252Iv0 c1252Iv0A = c1956Rv0.a();
            String str = c1252Iv0A.a;
            c1956Rv0.b(new C1252Iv0(this.g, c1252Iv0A.b), EnumC2532Yv0.e);
        }
        return Unit.a;
    }
}
