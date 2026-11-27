package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentRepeat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Dz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentRepeat$initObservers$$inlined$launchAndCollectIn$default$1", f = "ChangeLanguageFragmentRepeat.kt", l = {48}, m = "invokeSuspend")
public final class C0873Dz extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C4250hg0 g;
    public final /* synthetic */ ChangeLanguageFragmentRepeat h;

    /* JADX INFO: renamed from: Dz$a */
    @InterfaceC3368dU(c = "com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentRepeat$initObservers$$inlined$launchAndCollectIn$default$1$1", f = "ChangeLanguageFragmentRepeat.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C4250hg0 g;
        public final /* synthetic */ ChangeLanguageFragmentRepeat h;

        /* JADX INFO: renamed from: Dz$a$a, reason: collision with other inner class name */
        public static final class C0019a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ ChangeLanguageFragmentRepeat e;

            public C0019a(KN kn, ChangeLanguageFragmentRepeat changeLanguageFragmentRepeat) {
                this.e = changeLanguageFragmentRepeat;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                UL0 ul0 = (UL0) obj;
                WL0 wl0 = this.e.o;
                wl0.I().setTitle(ul0.h);
                wl0.s().setText(ul0.k);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4250hg0 c4250hg0, JM jm, ChangeLanguageFragmentRepeat changeLanguageFragmentRepeat) {
            super(2, jm);
            this.g = c4250hg0;
            this.h = changeLanguageFragmentRepeat;
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
                C0019a c0019a = new C0019a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0019a, this) == mn) {
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
    public C0873Dz(FP0 fp0, C4250hg0 c4250hg0, JM jm, ChangeLanguageFragmentRepeat changeLanguageFragmentRepeat) {
        super(2, jm);
        this.e = fp0;
        this.g = c4250hg0;
        this.h = changeLanguageFragmentRepeat;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0873Dz(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C0873Dz) create(kn, jm)).invokeSuspend(Unit.a);
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
