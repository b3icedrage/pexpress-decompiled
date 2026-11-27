package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase$initFlowCollectors$$inlined$launchAndCollectIn$default$4", f = "ProfileFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class C2309Wh1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC5910pK1 g;
    public final /* synthetic */ ProfileFragmentBase h;

    /* JADX INFO: renamed from: Wh1$a */
    @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase$initFlowCollectors$$inlined$launchAndCollectIn$default$4$1", f = "ProfileFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ ProfileFragmentBase h;

        /* JADX INFO: renamed from: Wh1$a$a, reason: collision with other inner class name */
        public static final class C0173a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ ProfileFragmentBase e;

            public C0173a(KN kn, ProfileFragmentBase profileFragmentBase) {
                this.e = profileFragmentBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                EnumC6804tc0 enumC6804tc0 = (EnumC6804tc0) obj;
                ProfileFragmentBase profileFragmentBase = this.e;
                if (enumC6804tc0 == null) {
                    C4259hi1 profileInputErrorLabel = profileFragmentBase.k().i;
                    Intrinsics.checkNotNullExpressionValue(profileInputErrorLabel, "profileInputErrorLabel");
                    ConstraintLayout constraintLayout = profileInputErrorLabel.d;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                    C7644xc.d(3, 0L, constraintLayout);
                    profileFragmentBase.k().j.e.setTextColor(C8056za.i(profileFragmentBase, R.color.white));
                } else {
                    C4259hi1 profileInputErrorLabel2 = profileFragmentBase.k().i;
                    Intrinsics.checkNotNullExpressionValue(profileInputErrorLabel2, "profileInputErrorLabel");
                    String string = profileFragmentBase.getString(enumC6804tc0.d);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    profileInputErrorLabel2.e.setText(string);
                    ConstraintLayout constraintLayout2 = profileInputErrorLabel2.d;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                    C7644xc.f(constraintLayout2);
                    if (enumC6804tc0 == EnumC6804tc0.BadLength) {
                        profileFragmentBase.k().j.e.setTextColor(C8056za.i(profileFragmentBase, R.color.error));
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, ProfileFragmentBase profileFragmentBase) {
            super(2, jm);
            this.g = interfaceC5910pK1;
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
                C0173a c0173a = new C0173a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0173a, this) == mn) {
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
    public C2309Wh1(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, ProfileFragmentBase profileFragmentBase) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC5910pK1;
        this.h = profileFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2309Wh1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2309Wh1) create(kn, jm)).invokeSuspend(Unit.a);
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
