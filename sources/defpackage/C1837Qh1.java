package defpackage;

import android.text.Editable;
import com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Qh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase$initClickListeners$1$1$1", f = "ProfileFragmentBase.kt", l = {79}, m = "invokeSuspend")
public final class C1837Qh1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ ProfileFragmentBase e;
    public final /* synthetic */ Editable g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1837Qh1(ProfileFragmentBase profileFragmentBase, Editable editable, JM<? super C1837Qh1> jm) {
        super(2, jm);
        this.e = profileFragmentBase;
        this.g = editable;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1837Qh1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1837Qh1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            Object obj2 = this.e.i;
            Intrinsics.checkNotNull(obj2);
            AbstractC8090zi1 abstractC8090zi1 = (AbstractC8090zi1) obj2;
            String strValueOf = String.valueOf(this.g);
            this.d = 1;
            abstractC8090zi1.getClass();
            if (AbstractC8090zi1.m(abstractC8090zi1, strValueOf, this) == mn) {
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
