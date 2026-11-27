package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.activation.screens.big_stories.ActivationBigStoriesViewModelBase$onItemClick$1", f = "ActivationBigStoriesViewModelBase.kt", l = {25}, m = "invokeSuspend")
public final class R5 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public VQ1 d;
    public List e;
    public int g;
    public final /* synthetic */ S5 h;
    public final /* synthetic */ C0615Ar i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5(S5 s5, C0615Ar c0615Ar, JM<? super R5> jm) {
        super(2, jm);
        this.h = s5;
        this.i = c0615Ar;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new R5(this.h, this.i, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((R5) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        VQ1 vq1;
        List<List<C3151cR1>> list;
        MN mn = MN.d;
        int i = this.g;
        S5 s5 = this.h;
        if (i == 0) {
            C1795Pt1.b(obj);
            vq1 = s5.e;
            List<List<C3151cR1>> listA = s5.f.a();
            this.d = vq1;
            this.e = listA;
            this.g = 1;
            Object objO = C4466ii.o(s5.g, this);
            if (objO == mn) {
                return mn;
            }
            list = listA;
            obj = objO;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = this.e;
            vq1 = this.d;
            C1795Pt1.b(obj);
        }
        Iterator it = ((List) obj).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (Intrinsics.a(((C0615Ar) it.next()).b, this.i.b)) {
                vq1.c(i2, list);
                s5.d.a();
                return Unit.a;
            }
            i2++;
        }
        i2 = -1;
        vq1.c(i2, list);
        s5.d.a();
        return Unit.a;
    }
}
