package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.profileandsettings.settings.screens.SettingsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.settings.screens.SettingsFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$3", f = "SettingsFragment.kt", l = {48}, m = "invokeSuspend")
public final class BJ1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ JJ1.a g;
    public final /* synthetic */ SettingsFragment h;

    @InterfaceC3368dU(c = "com.base.feature.profileandsettings.settings.screens.SettingsFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$3$1", f = "SettingsFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ JJ1.a g;
        public final /* synthetic */ SettingsFragment h;

        /* JADX INFO: renamed from: BJ1$a$a, reason: collision with other inner class name */
        public static final class C0004a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ SettingsFragment e;

            public C0004a(KN kn, SettingsFragment settingsFragment) {
                this.e = settingsFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                UL0 ul0 = (UL0) obj;
                SettingsFragment settingsFragment = this.e;
                settingsFragment.k().g.e.setText(ul0.d);
                AppCompatImageView langIcon = settingsFragment.k().g.g;
                Intrinsics.checkNotNullExpressionValue(langIcon, "langIcon");
                C3435dm0.e(langIcon, ul0.l, EnumC7035uh1.g);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JJ1.a aVar, JM jm, SettingsFragment settingsFragment) {
            super(2, jm);
            this.g = aVar;
            this.h = settingsFragment;
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
                C0004a c0004a = new C0004a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0004a, this) == mn) {
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
    public BJ1(FP0 fp0, JJ1.a aVar, JM jm, SettingsFragment settingsFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = aVar;
        this.h = settingsFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new BJ1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((BJ1) create(kn, jm)).invokeSuspend(Unit.a);
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
