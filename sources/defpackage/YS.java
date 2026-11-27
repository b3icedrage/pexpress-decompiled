package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
public final class YS extends AW1 implements Function2<KN, JM<Object>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ IS<Object> g;
    public final /* synthetic */ AW1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public YS(IS<Object> is, Function2<Object, ? super JM<Object>, ? extends Object> function2, JM<? super YS> jm) {
        super(2, jm);
        this.g = is;
        this.h = (AW1) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        YS ys = new YS(this.g, this.h, jm);
        ys.e = obj;
        return ys;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<Object> jm) {
        return ((YS) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        KN kn = (KN) this.e;
        DG dgE = C6561sS.e();
        IS<Object> is = this.g;
        AbstractC6373rZ0.a aVar = new AbstractC6373rZ0.a(this.h, dgE, is.h.a(), kn.getE());
        ZL1<AbstractC6373rZ0.a<Object>> zl1 = is.l;
        Object objN = zl1.c.n(aVar);
        if (objN instanceof C3308dA.a) {
            Throwable thA = C3308dA.a(objN);
            if (thA == null) {
                throw new C6939uE("Channel was closed normally");
            }
            throw thA;
        }
        if (objN instanceof C3308dA.b) {
            throw new IllegalStateException("Check failed.");
        }
        if (zl1.d.a.getAndIncrement() == 0) {
            C5189lv.k(zl1.a, null, new YL1(zl1, null), 3);
        }
        this.d = 1;
        Object objZ = dgE.z(this);
        return objZ == mn ? mn : objZ;
    }
}
