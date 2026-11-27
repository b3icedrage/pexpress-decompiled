package defpackage;

import android.widget.ImageView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xh1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase$initFlowCollectors$$inlined$launchAndCollectIn$default$5", f = "ProfileFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class C2413Xh1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ AbstractC8090zi1.e g;
    public final /* synthetic */ ProfileFragmentBase h;

    /* JADX INFO: renamed from: Xh1$a */
    @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase$initFlowCollectors$$inlined$launchAndCollectIn$default$5$1", f = "ProfileFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ AbstractC8090zi1.e g;
        public final /* synthetic */ ProfileFragmentBase h;

        /* JADX INFO: renamed from: Xh1$a$a, reason: collision with other inner class name */
        public static final class C0194a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ ProfileFragmentBase e;

            public C0194a(KN kn, ProfileFragmentBase profileFragmentBase) {
                this.e = profileFragmentBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ImageView profileNicknameInputLockImage = this.e.k().j.h;
                Intrinsics.checkNotNullExpressionValue(profileNicknameInputLockImage, "profileNicknameInputLockImage");
                profileNicknameInputLockImage.setVisibility(zBooleanValue ? 0 : 8);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC8090zi1.e eVar, JM jm, ProfileFragmentBase profileFragmentBase) {
            super(2, jm);
            this.g = eVar;
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
                C0194a c0194a = new C0194a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0194a, this) == mn) {
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
    public C2413Xh1(FP0 fp0, AbstractC8090zi1.e eVar, JM jm, ProfileFragmentBase profileFragmentBase) {
        super(2, jm);
        this.e = fp0;
        this.g = eVar;
        this.h = profileFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2413Xh1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2413Xh1) create(kn, jm)).invokeSuspend(Unit.a);
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
