package defpackage;

import android.content.Context;
import android.widget.EditText;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase$initFlowCollectors$$inlined$launchAndCollectIn$default$2", f = "ProfileFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class C2149Uh1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ ProfileFragmentBase h;

    /* JADX INFO: renamed from: Uh1$a */
    @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase$initFlowCollectors$$inlined$launchAndCollectIn$default$2$1", f = "ProfileFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ ProfileFragmentBase h;

        /* JADX INFO: renamed from: Uh1$a$a, reason: collision with other inner class name */
        public static final class C0156a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ ProfileFragmentBase e;

            public C0156a(KN kn, ProfileFragmentBase profileFragmentBase) {
                this.e = profileFragmentBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ProfileFragmentBase profileFragmentBase = this.e;
                if (zBooleanValue) {
                    EditText profileNicknameInputEditText = profileFragmentBase.k().j.g;
                    Intrinsics.checkNotNullExpressionValue(profileNicknameInputEditText, "profileNicknameInputEditText");
                    Context contextRequireContext = profileFragmentBase.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    C1874Qu.t(profileNicknameInputEditText, contextRequireContext);
                } else {
                    EditText profileNicknameInputEditText2 = profileFragmentBase.k().j.g;
                    Intrinsics.checkNotNullExpressionValue(profileNicknameInputEditText2, "profileNicknameInputEditText");
                    Intrinsics.checkNotNullParameter(profileNicknameInputEditText2, "<this>");
                    profileNicknameInputEditText2.clearFocus();
                    profileNicknameInputEditText2.setClickable(true);
                    profileNicknameInputEditText2.setFocusable(false);
                    profileNicknameInputEditText2.setFocusableInTouchMode(false);
                    Object obj2 = profileFragmentBase.i;
                    Intrinsics.checkNotNull(obj2);
                    AbstractC8090zi1 abstractC8090zi1 = (AbstractC8090zi1) obj2;
                    abstractC8090zi1.getClass();
                    C6561sS.g(abstractC8090zi1, new C0668Bi1(abstractC8090zi1, null));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, ProfileFragmentBase profileFragmentBase) {
            super(2, jm);
            this.g = fp1;
            this.h = profileFragmentBase;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C0156a c0156a = new C0156a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0156a, this) == mn) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2149Uh1(FP0 fp0, FP1 fp1, JM jm, ProfileFragmentBase profileFragmentBase) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = profileFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2149Uh1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2149Uh1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
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
