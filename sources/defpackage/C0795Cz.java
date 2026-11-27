package defpackage;

import com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentRepeat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Cz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentRepeat$initListeners$1$1", f = "ChangeLanguageFragmentRepeat.kt", l = {67}, m = "invokeSuspend")
public final class C0795Cz extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ ChangeLanguageFragmentRepeat e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0795Cz(ChangeLanguageFragmentRepeat changeLanguageFragmentRepeat, JM<? super C0795Cz> jm) {
        super(2, jm);
        this.e = changeLanguageFragmentRepeat;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0795Cz(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C0795Cz) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            Object obj2 = this.e.i;
            Intrinsics.checkNotNull(obj2);
            this.d = 1;
            if (((C1263Iz) obj2).l(this) == mn) {
                return mn;
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
