package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stories.usecases.ShownStoriesUseCaseBase$writeValue$2", f = "ShownStoriesUseCaseBase.kt", l = {25}, m = "invokeSuspend")
public final class CL1 extends AW1 implements Function1<JM<? super Set<? extends String>>, Object> {
    public int d;
    public final /* synthetic */ BL1 e;
    public final /* synthetic */ WQ1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CL1(BL1 bl1, WQ1 wq1, JM jm) {
        super(1, jm);
        this.e = bl1;
        this.g = wq1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new CL1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Set<? extends String>> jm) {
        return ((CL1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC6396rf0<Set<String>> interfaceC6396rf0 = this.e.c;
            this.d = 1;
            obj = C4466ii.o(interfaceC6396rf0, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return C5907pJ1.e((Set) obj, this.g.invoke());
    }
}
